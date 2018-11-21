package com.mayburger.doublerecycler.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import com.mayburger.doublerecycler.R;
import com.mayburger.doublerecycler.adapter.AwardeeAdapter;
import com.mayburger.doublerecycler.model.Scholarship;
import com.mayburger.doublerecycler.adapter.ScholarshipAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements HomeView {

    @BindView(R.id.recycler_open)
    RecyclerView recycler_open;
    @BindView(R.id.recycler_recommended)
    RecyclerView recycler_recommended;
    @BindView(R.id.recycler_awardee)
    RecyclerView recycler_awardee;
    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        HomePresenter presenter = new HomePresenter(this);
        presenter.getOpen();
        presenter.getRecommended();
        presenter.getAwardee();
        initBottomNavigation();
    }

    void initBottomNavigation() {
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(HomeActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.explore:
                        Toast.makeText(HomeActivity.this, "Explore", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onGetOpen(List<Scholarship> data) {
        recycler_open.setAdapter(new ScholarshipAdapter(this, data));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler_open.setLayoutManager(layoutManager);
    }

    @Override
    public void onGetRecommended(List<Scholarship> data) {
        recycler_recommended.setAdapter(new ScholarshipAdapter(this, data));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler_recommended.setLayoutManager(layoutManager);
    }

    @Override
    public void onGetAwardee(List<Scholarship> data) {
        recycler_awardee.setAdapter(new AwardeeAdapter(this, data));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler_awardee.setLayoutManager(layoutManager);
    }
}

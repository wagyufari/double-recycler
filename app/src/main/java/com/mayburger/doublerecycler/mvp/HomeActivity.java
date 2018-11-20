package com.mayburger.doublerecycler.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mayburger.doublerecycler.R;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        HomePresenter presenter = new HomePresenter(this);
        presenter.getOpen();
        presenter.getRecommended();
        presenter.getAwardee();
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
        recycler_awardee.setAdapter(new ScholarshipAdapter(this, data));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler_awardee.setLayoutManager(layoutManager);
    }
}

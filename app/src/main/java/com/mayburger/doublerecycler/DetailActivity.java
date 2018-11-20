package com.mayburger.doublerecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mayburger.doublerecycler.model.Scholarship;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Scholarship data = (Scholarship)getIntent().getSerializableExtra(getString(R.string.data_intent));
        Toast.makeText(this, "" + data.getName(), Toast.LENGTH_SHORT).show();

    }
}

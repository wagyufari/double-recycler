package com.mayburger.doublerecycler.mvp;

import com.mayburger.doublerecycler.model.Scholarship;

import java.util.List;

/**
 * Created by Mayburger on 11/20/18.
 */

public interface HomeView {
    public void onGetOpen(List<Scholarship> data);

    public void onGetRecommended(List<Scholarship> data);
}

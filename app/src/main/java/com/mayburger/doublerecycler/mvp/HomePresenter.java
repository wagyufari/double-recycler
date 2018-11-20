package com.mayburger.doublerecycler.mvp;

import com.mayburger.doublerecycler.model.Scholarship;

import java.util.ArrayList;

/**
 * Created by Mayburger on 11/20/18.
 */

public class HomePresenter {

    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
    }

    public void getOpen(){
        ArrayList<Scholarship> data = new ArrayList<>();
        data.add(new Scholarship("Beasiswa Jardines", "15 November 2018", "S1, S2, S3", "Inggris"));
        data.add(new Scholarship("Monbugakusho", "28 September 2018", "S1, S2, S3", "Jepang"));
        data.add(new Scholarship("Beasiswa Jardines", "15 November 2018", "S1, S2, S3", "Inggris"));
        data.add(new Scholarship("Monbugakusho", "28 September 2018", "S1, S2, S3", "Jepang"));
        view.onGetOpen(data);
    }

    public void getRecommended(){
        ArrayList<Scholarship> data = new ArrayList<>();
        data.add(new Scholarship("Beasiswa Chevening di Inggris", "6 November 2018", "Master (S2)", "Inggris"));
        data.add(new Scholarship("Beasiswa StuNed di Belanda", "15 Desember 2018", "S2, S3", "Belanda"));
        data.add(new Scholarship("Beasiswa Chevening di Inggris", "6 November 2018", "Master (S2)", "Inggris"));
        data.add(new Scholarship("Beasiswa StuNed di Belanda", "15 Desember 2018", "S2, S3", "Belanda"));
        view.onGetRecommended(data);
    }
    public void getAwardee(){
        ArrayList<Scholarship> data = new ArrayList<>();
        data.add(new Scholarship("Beasiswa Chevening di Inggris", "6 November 2018", "Master (S2)", "Inggris"));
        data.add(new Scholarship("Beasiswa StuNed di Belanda", "15 Desember 2018", "S2, S3", "Belanda"));
        data.add(new Scholarship("Beasiswa Chevening di Inggris", "6 November 2018", "Master (S2)", "Inggris"));
        data.add(new Scholarship("Beasiswa StuNed di Belanda", "15 Desember 2018", "S2, S3", "Belanda"));
        view.onGetAwardee(data);
    }

}

package com.douib.dagger228.ui.main;

import android.app.Application;

import com.douib.dagger228.di.AppComponent;
import com.douib.dagger228.di.DaggerAppComponent;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);
    }
}

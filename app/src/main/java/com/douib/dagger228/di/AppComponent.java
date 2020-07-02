package com.douib.dagger228.di;


import android.app.Application;

import com.douib.dagger228.ui.main.MyApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class})
public interface AppComponent {

    void inject(MyApp hubApp);

    @Component.Builder
    interface Builder {
        @BindsInstance
        //Builder application(Application application);
        AppComponent build();
    }
}

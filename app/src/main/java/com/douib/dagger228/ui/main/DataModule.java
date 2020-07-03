package com.douib.dagger228.ui.main;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    MainRepository provideMainRepository() {
        return new MainRepository();
    }
}

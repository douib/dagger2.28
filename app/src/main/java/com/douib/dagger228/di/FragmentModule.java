package com.douib.dagger228.di;

import com.douib.dagger228.ui.main.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragment();


}

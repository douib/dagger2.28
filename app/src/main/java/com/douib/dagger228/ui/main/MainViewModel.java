package com.douib.dagger228.ui.main;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {

    @Inject
    MainRepository mainRepository;

    @Inject
    MainViewModel() { }
    // TODO: Implement the ViewModel
}

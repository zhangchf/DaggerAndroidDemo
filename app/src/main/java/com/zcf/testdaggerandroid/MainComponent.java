package com.zcf.testdaggerandroid;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {

    MainDependentObject getMainDependentObject();

    void inject(MainActivity mainActivity);
}

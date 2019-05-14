package com.zcf.testdaggerandroid;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;


@Subcomponent(modules = {MainModule.class})
public interface SecondActivitySubcomponent extends AndroidInjector<SecondActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<SecondActivity> {

    }
}

package com.zcf.testdaggerandroid;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SecondActivitySubcomponent.class)
abstract class SecondActivityModule {
    @Binds
    @IntoMap
    @ClassKey(SecondActivity.class)
    abstract AndroidInjector.Factory<?>
    bindSecondActivityInjectorFactory(SecondActivitySubcomponent.Factory factory);
}

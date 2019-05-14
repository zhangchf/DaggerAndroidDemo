package com.zcf.testdaggerandroid;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    MainProvidedObject providesMainProvidedObject() {
        return new MainProvidedObject();
    }

}

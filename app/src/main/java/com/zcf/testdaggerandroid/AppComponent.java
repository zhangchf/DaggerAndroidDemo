package com.zcf.testdaggerandroid;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, SecondActivityModule.class})
public interface AppComponent {

    void inject(App app);
}

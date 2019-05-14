package com.zcf.testdaggerandroid;

import javax.inject.Inject;

public class MainProvidedObject {

    @Inject
    MainDependentObject mainDependentObject;
}

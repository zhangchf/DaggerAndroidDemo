package com.zcf.testdaggerandroid;

import javax.inject.Inject;

public class MainDependentObject {

    public String strValue = "";

    @Inject
    public MainDependentObject() {
        strValue = "Injected";
    }
}

package com.zcf.testdaggerandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.getSimpleName();

    @Inject
    MainDependentObject mainDependentObject;

    @Inject
    MainProvidedObject mainProvidedObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        Log.i(TAG, "mainDependentObject: " + mainDependentObject);
        Log.i(TAG, "mainProvidedObject: " + mainProvidedObject);
    }
}

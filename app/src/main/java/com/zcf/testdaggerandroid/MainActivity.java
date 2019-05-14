package com.zcf.testdaggerandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainDependentObject mainDependentObject;

    @Inject
    MainProvidedObject mainProvidedObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().build().inject(this);

        Log.i(TAG, "mainDependentObject: " + mainDependentObject);
        Log.i(TAG, "mainProvidedObject: " + mainProvidedObject);

    }
}

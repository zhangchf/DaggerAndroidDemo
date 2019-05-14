package com.zcf.testdaggerandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

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

        View gotoSecondActivity = findViewById(R.id.gotoSecondActivity);
        gotoSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

    }
}

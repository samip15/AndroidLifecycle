package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView mLifeCycleTextView;

    //constant values
    private static final String ON_CREATE  = "onCreate";
    private static final String ON_START  = "onStart";
    private static final String ON_RESUME  = "onResume";
    private static final String ON_PAUSE  = "onPause";
    private static final String ON_STOP  = "onStop";
    private static final String ON_RESTART  = "onRestart";
    private static final String ON_DISTORY  = "onDestory";
    private static final String ON_SAVEDINSTANCESTATE  = "onSavedInstanceState";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLifeCycleTextView = findViewById(R.id.lifecycle_events);
        //oncreate
        logAndAppend(ON_CREATE);
    }
    //-----------------------------Activity Life Cycle----------------

    @Override
    protected void onStart() {
        super.onStart();
        logAndAppend(ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndAppend(ON_RESUME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        logAndAppend(ON_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndAppend(ON_STOP);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndAppend(ON_RESTART);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndAppend(ON_DISTORY);
    }

    // add lifecycle to text view
    private void logAndAppend(String lifecycleEvent){
        Log.e(TAG, "logAndAppend: "+lifecycleEvent );
        mLifeCycleTextView.append(lifecycleEvent+"\n");
    }

    public void resetLifecycleDisplat(View view) {
        mLifeCycleTextView.setText("LifeCycle Call backs: \n");
    }
}
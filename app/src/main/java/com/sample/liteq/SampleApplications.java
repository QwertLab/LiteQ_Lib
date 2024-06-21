package com.sample.liteq;

import android.app.Application;

import java.io.File;


public class SampleApplications extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        File dexoutputDir = getCodeCacheDir();
        dexoutputDir.setReadOnly();
    }
}


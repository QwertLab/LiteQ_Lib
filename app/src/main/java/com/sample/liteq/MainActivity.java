package com.sample.liteq;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.qwertlab.liteq.main.LiteQManager;
import com.qwertlab.liteq.utils.XAdsFunc;


public class MainActivity extends AppCompatActivity {

    /***
     * API Document : https://api.qwertlab.com/liteq/index.php
     * Admin : https://agent.qwertlab.com/
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-- LiteQ SDK Call ------------------------------------------------------------------------
        LiteQManager.initLiteQ(MainActivity.this, "AgentKey");
        //------------------------------------------------------------------------------------------
        Log.i("LiteQ", "#- Version : " + XAdsFunc.getVersionname());
    }

}
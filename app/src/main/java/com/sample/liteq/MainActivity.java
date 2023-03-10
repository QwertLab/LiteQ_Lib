package com.sample.liteq;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.qwertlab.liteq.main.LiteQManager;

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

    }


}
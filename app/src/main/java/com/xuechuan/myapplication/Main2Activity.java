package com.xuechuan.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {


    private MyBrore brore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        brore = new MyBrore();
        IntentFilter filter = new IntentFilter("www.xuechaun.net");
         registerReceiver(brore,filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
      unregisterReceiver(brore);
    }
    private class MyBrore extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String name = intent.getStringExtra("name");
                Log.e("====main2接受===", name);
            }
        }
    }
}

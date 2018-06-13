package com.xuechuan.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String name = intent.getStringExtra("name");
            Log.e("2222", "name");

            Intent intent1 = new Intent();
            intent1.setAction("www.xuechaun.net");
            intent1.putExtra("name", "测试");
            context.sendBroadcast(intent1);
        }
    }
}

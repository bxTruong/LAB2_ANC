package com.example.lab2_anc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String nhan=intent.getStringExtra("name");
        Toast.makeText(context,nhan,Toast.LENGTH_SHORT).show();
    }
}
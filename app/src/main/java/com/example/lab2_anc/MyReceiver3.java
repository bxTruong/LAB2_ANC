package com.example.lab2_anc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String nhan=intent.getStringExtra("name");
        if(nhan.equals("MEM537128")){
            Toast.makeText(context, "Khuyến mãi 10%", Toast.LENGTH_SHORT).show();
        }
        else if(nhan.equals("MEM537129")){
            Toast.makeText(context, "Khuyến mãi 20%", Toast.LENGTH_SHORT).show();
        }
        else if(nhan.equals("VIP537128")){
            Toast.makeText(context, "Khuyến mãi 30%", Toast.LENGTH_SHORT).show();
        }
        else if(nhan.equals("VIP537129")){
            Toast.makeText(context, "Khuyến mãi 50%", Toast.LENGTH_SHORT).show();
        }
    }
}

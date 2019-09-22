package com.example.lab2_anc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle exstra=intent.getExtras();

        if(exstra!=null){
            String state=exstra.getString(TelephonyManager.EXTRA_STATE);
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNumber=exstra.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);

                Toast.makeText(context,phoneNumber,Toast.LENGTH_SHORT).show();
            }
        }
    }
}

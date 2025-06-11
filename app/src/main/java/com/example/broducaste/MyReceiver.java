package com.example.broducaste;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class MyReceiver extends BroadcastReceiver {
    ImageView imageView;

    public MyReceiver(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
       switch (intent.getAction()){
           case Intent.ACTION_POWER_CONNECTED:
               imageView.setImageResource(R.drawable.baseline_battery_6_bar_24);
               break;

           case  Intent.ACTION_POWER_DISCONNECTED:
               imageView.setImageResource(R.drawable.baseline_battery_alert_24);
               break;
       }
    }
}
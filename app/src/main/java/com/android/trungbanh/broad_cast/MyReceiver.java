package com.android.trungbanh.broad_cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by trungbanh on 3/10/18.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //call service
        if (isOnline(context)){
            Intent myIntent = new Intent(context, MyService.class);
            //  call startService
            context.startService(myIntent);
        }else {
            Intent myIntent = new Intent(context, MyService.class);
            context.stopService(myIntent);
        }


    }

    // checks network is one of not
    public boolean isOnline(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfoMob = cm.getNetworkInfo(cm.TYPE_MOBILE); // mobile network
        NetworkInfo netInfoWifi = cm.getNetworkInfo(cm.TYPE_WIFI); // wifi network


        if ((netInfoMob != null || netInfoWifi != null)
                && (netInfoMob.isConnectedOrConnecting() || netInfoWifi.isConnectedOrConnecting())) {
            // connected
            return true;
        }
        // or not
        return false;
    }
}

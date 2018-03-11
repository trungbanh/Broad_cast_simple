package com.android.trungbanh.broad_cast;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by trungbanh on 3/10/18.
 */

public class MyService extends Service {
    MediaPlayer mediaPlayer;

    private String LOG_TAG = "MyService";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(LOG_TAG, "onCreate MyService");
        //create media
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.noinaycoanh);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // start
        mediaPlayer.start();
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(LOG_TAG, "In onBind");
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //stop
        Log.i(LOG_TAG, "In onDestroy");
        mediaPlayer.release();
        //and release the memory
    }
}

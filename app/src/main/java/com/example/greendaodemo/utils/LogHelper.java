package com.example.greendaodemo.utils;

import android.util.Log;

public class LogHelper {

    private static final boolean isDebug = true;

    private final static String TAG = "hugh";

    public static void d(String msg){
        if(isDebug){
            Log.d(TAG , msg);
        }
    }
}

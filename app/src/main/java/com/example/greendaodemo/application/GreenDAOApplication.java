package com.example.greendaodemo.application;

import android.app.Application;

import com.example.greendaodemo.greendao.GreenDaoManager;

public class GreenDAOApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GreenDaoManager.initDaoMaster(this);
    }
}

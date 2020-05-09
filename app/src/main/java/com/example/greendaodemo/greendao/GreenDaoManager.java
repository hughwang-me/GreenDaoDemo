package com.example.greendaodemo.greendao;

import android.content.Context;

import com.example.greendaodemo.greendao.dao.DaoMaster;
import com.example.greendaodemo.greendao.dao.DaoSession;

import org.greenrobot.greendao.query.QueryBuilder;

public class GreenDaoManager {

    private static final String DB_NAME = "uwjx-green-test";

    private static DaoMaster sDaoMaster;
    private static DaoMaster.DevOpenHelper sHelper;
    private static DaoSession sDaoSession;

    public static void initDaoMaster(Context context){
        if(sDaoMaster == null) {
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
            sDaoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        sDaoSession = sDaoMaster.newSession();
    }

    public static DaoSession getDaoSession(){
        return sDaoSession;
    }

    /**
     * 打开输出日志，默认关闭
     */
    public void setDebug(){
        QueryBuilder.LOG_SQL = true;
        QueryBuilder.LOG_VALUES = true;
    }

    /**
     * 关闭所有的操作，数据库开启后，使用完毕要关闭
     */
    public void closeConnection(){
        closeHelper();
        closeDaoSession();
    }

    public void closeHelper(){
        if(sHelper != null){
            sHelper.close();
            sHelper = null;
        }
    }

    public void closeDaoSession(){
        if(sDaoSession != null){
            sDaoSession.clear();
            sDaoSession = null;
        }
    }
}

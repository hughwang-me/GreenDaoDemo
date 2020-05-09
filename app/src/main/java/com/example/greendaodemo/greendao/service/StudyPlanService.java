package com.example.greendaodemo.greendao.service;

import com.example.greendaodemo.entities.StudyPlanEntity;
import com.example.greendaodemo.greendao.GreenDaoManager;
import com.example.greendaodemo.greendao.dao.StudyPlanEntityDao;

import java.util.List;

public class StudyPlanService {

    private static StudyPlanEntityDao studyPlanEntityDao;

    private static void init(){
        if(studyPlanEntityDao == null){
            studyPlanEntityDao = GreenDaoManager.getDaoSession().getStudyPlanEntityDao();
        }
    }

    public static boolean insert(StudyPlanEntity entity){
        init();
        studyPlanEntityDao.insert(entity);
        return true;
    }

    public static boolean delete(StudyPlanEntity entity){
        init();
        studyPlanEntityDao.delete(entity);
        return true;
    }

    public static boolean edit(StudyPlanEntity entity){
        init();
        studyPlanEntityDao.update(entity);
        return true;
    }

    public static List<StudyPlanEntity> list(StudyPlanEntity entity){
        init();
        return studyPlanEntityDao.loadAll();
    }
}

package com.example.greendaodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.example.greendaodemo.entities.StudyPlanEntity;
import com.example.greendaodemo.greendao.service.StudyPlanService;
import com.example.greendaodemo.utils.LogHelper;

import java.util.Date;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.insert , R.id.delete , R.id.edit , R.id.query})
    public void onClick(View v){

        StudyPlanEntity entity = new StudyPlanEntity();
        entity.setId(111L);
        entity.setCreateDate(new Date());
        entity.setName("王欢");
        entity.setUserCode("1001");

        switch (v.getId()){
            case R.id.insert:
                LogHelper.d("点击 insert");
                StudyPlanService.insert(entity);
                break;
            case R.id.delete:
                LogHelper.d("点击 delete");
                StudyPlanService.delete(entity);
                break;
            case R.id.edit:
                LogHelper.d("点击 edit");
                StudyPlanService.delete(entity);
                break;
            case R.id.query:
                LogHelper.d("点击 query");
                List<StudyPlanEntity> entities = StudyPlanService.list(entity);
                for (StudyPlanEntity planEntity : entities) {
                    LogHelper.d("msg->" + JSON.toJSONString(planEntity));
                }
                break;
        }
    }
}

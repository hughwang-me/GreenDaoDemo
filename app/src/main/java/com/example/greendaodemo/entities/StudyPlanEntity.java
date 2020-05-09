package com.example.greendaodemo.entities;

import org.greenrobot.greendao.annotation.Entity;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class StudyPlanEntity {

    @Id
    private Long id;
    private String userCode;
    private String name;
    private Date createDate;
    @Generated(hash = 512799405)
    public StudyPlanEntity(Long id, String userCode, String name, Date createDate) {
        this.id = id;
        this.userCode = userCode;
        this.name = name;
        this.createDate = createDate;
    }
    @Generated(hash = 135204689)
    public StudyPlanEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserCode() {
        return this.userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

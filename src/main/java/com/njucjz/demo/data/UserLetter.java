package com.njucjz.demo.data;

import lombok.Data;


public class UserLetter {
    private Integer ulid;
    private Integer uid;
    private Integer lid;

    public Integer getUlid() {
        return ulid;
    }

    public void setUlid(Integer ulid) {
        this.ulid = ulid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }
}

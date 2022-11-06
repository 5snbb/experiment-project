package com.system.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "c_s")
public class CS {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "c_id", nullable = false)
    private String cId;

    @Column(name = "s_id", nullable = false)
    private String sId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCId() {
        return cId;
    }

    public void setCId(String cId) {
        this.cId = cId;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

}
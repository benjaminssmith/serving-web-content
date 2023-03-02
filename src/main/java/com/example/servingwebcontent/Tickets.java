package com.example.servingwebcontent;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TICKETS")

public class Tickets {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name="JIRAID")
    private Integer jiraId;
    
    @Column(name="DATE")
    private Date date;
    
    @Column(name="COUNTY")
    private String county;
    
    @Column(name="STATE")
    private String state;
    
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="PRODUCT")
    private String product;
    
    @Column(name="STATUS")
    private String status;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJiraId() {

        return this.jiraId;
    }

    public void setJiraId(Integer jiraid) {
        this.jiraId = jiraid;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public getState() {
        return this.state;
    }

    public void setState( String state) {
        this.state = state;
    }

    public getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public getStatus() {
        return this.status;
    }

    public setStatus(String status) {
        this.status = status;
    }

}




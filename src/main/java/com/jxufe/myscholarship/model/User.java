package com.jxufe.myscholarship.model;

import org.junit.Test;

import javax.validation.constraints.NotEmpty;
import java.lang.annotation.Native;

public class User {
    @NotEmpty(message = "学号不能为空")
    private Integer studentnumber;

    private String username;

    private String major;
    @NotEmpty(message = "密码不能为空")
    private String password;

    private Integer schoolyear;

    private Float courseweight;

    private Float paperscore;

    private Float researchsubject;

    private Float technologicalinvention;

    private Float professionalskill;

    private Float scientificresearchscore;

    private Float subjectnature;

    private Float honoraward;

    private Float studentwork;

    private Float professionalskillscore;

    private Float comprehensivequality;

    private Integer sixgrades;

    private Float finalgrades;

    private String content;

    public Integer getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(Integer studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSchoolyear() {
        return schoolyear;
    }

    public void setSchoolyear(Integer schoolyear) {
        this.schoolyear = schoolyear;
    }

    public Float getCourseweight() {
        return courseweight;
    }

    public void setCourseweight(Float courseweight) {
        this.courseweight = courseweight;
    }

    public Float getPaperscore() {
        return paperscore;
    }

    public void setPaperscore(Float paperscore) {
        this.paperscore = paperscore;
    }

    public Float getResearchsubject() {
        return researchsubject;
    }

    public void setResearchsubject(Float researchsubject) {
        this.researchsubject = researchsubject;
    }

    public Float getTechnologicalinvention() {
        return technologicalinvention;
    }

    public void setTechnologicalinvention(Float technologicalinvention) {
        this.technologicalinvention = technologicalinvention;
    }

    public Float getProfessionalskill() {
        return professionalskill;
    }

    public void setProfessionalskill(Float professionalskill) {
        this.professionalskill = professionalskill;
    }

    public Float getScientificresearchscore() {
        return scientificresearchscore;
    }

    public void setScientificresearchscore(Float scientificresearchscore) {
        this.scientificresearchscore = scientificresearchscore;
    }

    public Float getSubjectnature() {
        return subjectnature;
    }

    public void setSubjectnature(Float subjectnature) {
        this.subjectnature = subjectnature;
    }

    public Float getHonoraward() {
        return honoraward;
    }

    public void setHonoraward(Float honoraward) {
        this.honoraward = honoraward;
    }

    public Float getStudentwork() {
        return studentwork;
    }

    public void setStudentwork(Float studentwork) {
        this.studentwork = studentwork;
    }

    public Float getProfessionalskillscore() {
        return professionalskillscore;
    }

    public void setProfessionalskillscore(Float professionalskillscore) {
        this.professionalskillscore = professionalskillscore;
    }

    public Float getComprehensivequality() {
        return comprehensivequality;
    }

    public void setComprehensivequality(Float comprehensivequality) {
        this.comprehensivequality = comprehensivequality;
    }

    public Integer getSixgrades() {
        return sixgrades;
    }

    public void setSixgrades(Integer sixgrades) {
        this.sixgrades = sixgrades;
    }

    public Float getFinalgrades() {
        return finalgrades;
    }

    public void setFinalgrades(Float finalgrades) {
        this.finalgrades = finalgrades;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "studentnumber=" + studentnumber +
                ", username='" + username + '\'' +
                ", major='" + major + '\'' +
                ", password='" + password + '\'' +
                ", schoolyear=" + schoolyear +
                ", courseweight=" + courseweight +
                ", paperscore=" + paperscore +
                ", researchsubject=" + researchsubject +
                ", technologicalinvention=" + technologicalinvention +
                ", professionalskill=" + professionalskill +
                ", scientificresearchscore=" + scientificresearchscore +
                ", subjectnature=" + subjectnature +
                ", honoraward=" + honoraward +
                ", studentwork=" + studentwork +
                ", professionalskillscore=" + professionalskillscore +
                ", comprehensivequality=" + comprehensivequality +
                ", sixgrades=" + sixgrades +
                ", finalgrades=" + finalgrades +
                ", content='" + content + '\'' +
                '}';
    }
}
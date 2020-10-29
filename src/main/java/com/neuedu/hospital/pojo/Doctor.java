package com.neuedu.hospital.pojo;

import java.math.BigDecimal;

public class Doctor {
    private Integer doctorId;

    private String doctorIname;

    private String doctorIcertid;

    private String doctorImg;

    private String doctorIsex;

    private Integer doctorIdepartment;

    private String password;

    private String doctorTel;

    private BigDecimal doctorPrice;

    private String doctorItext;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorIname() {
        return doctorIname;
    }

    public void setDoctorIname(String doctorIname) {
        this.doctorIname = doctorIname == null ? null : doctorIname.trim();
    }

    public String getDoctorIcertid() {
        return doctorIcertid;
    }

    public void setDoctorIcertid(String doctorIcertid) {
        this.doctorIcertid = doctorIcertid == null ? null : doctorIcertid.trim();
    }

    public String getDoctorImg() {
        return doctorImg;
    }

    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg == null ? null : doctorImg.trim();
    }

    public String getDoctorIsex() {
        return doctorIsex;
    }

    public void setDoctorIsex(String doctorIsex) {
        this.doctorIsex = doctorIsex == null ? null : doctorIsex.trim();
    }

    public Integer getDoctorIdepartment() {
        return doctorIdepartment;
    }

    public void setDoctorIdepartment(Integer doctorIdepartment) {
        this.doctorIdepartment = doctorIdepartment;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel == null ? null : doctorTel.trim();
    }

    public BigDecimal getDoctorPrice() {
        return doctorPrice;
    }

    public void setDoctorPrice(BigDecimal doctorPrice) {
        this.doctorPrice = doctorPrice;
    }

    public String getDoctorItext() {
        return doctorItext;
    }

    public void setDoctorItext(String doctorItext) {
        this.doctorItext = doctorItext == null ? null : doctorItext.trim();
    }
}
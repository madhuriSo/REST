package com.sd.model;

import com.sun.org.apache.regexp.internal.RE;

public class RegisterModel {

    private String fName;
    private String lName;
    private String email;
    private String address;

    public RegisterModel(String name,String l, String e,String a){
        this.fName=name;
        this.lName=l;
        this.email=e;
        this.address=a;
    }
    public RegisterModel(){

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RegisterModel{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

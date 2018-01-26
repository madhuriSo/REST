package com.sd.Entity;

import javax.persistence.*;

@Entity
@Table(name="register")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable=false)
    private String fName;

    @Column
    private String lName;

    @Column
    private String email;

    @Column
    private String address;

    public RegisterEntity(String fName, String lName, String email, String address) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.address = address;
    }

    public RegisterEntity(){

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
        return "RegisterEntity{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

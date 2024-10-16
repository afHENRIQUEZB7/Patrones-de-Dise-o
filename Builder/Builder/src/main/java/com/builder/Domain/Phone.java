package com.builder.Domain;

public class Phone {
    private String phoneNumber;
    private String ext;
    private String phonetype;

    public Phone() {
    }

    public Phone(String phoneNumber, String ext, String phonetype) {
        this.phoneNumber = phoneNumber;
        this.ext = ext;
        this.phonetype = phonetype;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", ext='" + ext + '\'' +
                ", phonetype='" + phonetype + '\'' +
                '}';
    }
}

package tech.codoverse.java.models.dto;

import tech.codoverse.java.models.domain.Gender;
import tech.codoverse.java.models.domain.Grade;

public class StudentDto {

    private String name;
    private Gender gender;
    private String phone;
    private Grade grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}

package dev.insaneduck;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "users")
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "first-name")
    private String firstName;
    @Basic
    @Column(name = "last-name")
    private String lastName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "gpa")
    private int gpa;
    @Basic
    @Column(name = "course-code")
    private String courseCode;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "favorite-language")
    private String favoriteLanguage;
    @Basic
    @Column(name = "pincode")
    private String pincode;

    public Users() {
    }

    public Users(String firstName, String lastName, String email, int gpa, String courseCode, String country, String favoriteLanguage, String pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
        this.courseCode = courseCode;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && gpa == users.gpa && Objects.equals(firstName, users.firstName) && Objects.equals(lastName, users.lastName) && Objects.equals(email, users.email) && Objects.equals(courseCode, users.courseCode) && Objects.equals(country, users.country) && Objects.equals(favoriteLanguage, users.favoriteLanguage) && Objects.equals(pincode, users.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, gpa, courseCode, country, favoriteLanguage, pincode);
    }
}

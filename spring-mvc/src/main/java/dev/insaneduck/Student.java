package dev.insaneduck;


import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class Student {
    @NotNull(message = "is required (not null)")
    @Size(min = 1, message = "not sufficient length")
    String firstName;
    String lastName;
    @NotNull(message = "required")
    @Min(value = 1, message = "enter value in between 1 to 10")
    @Max(value = 10, message = "enter value in between 1 to 10")
    Integer gpa;

    @CourseCode(value = "COMP", message = "not valid")
    String courseCode;

    String country;

    //@Value("#{countryOptions}")
    LinkedHashMap<String, String> countryOptions;

    String favoriteLanguage;

    LinkedHashMap<String, String> favoriteLanguageOptions;

    String[] operatingSystems;

    LinkedHashMap<String, String> operatingSystemOptions;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "not a valid pin code")
    String pinCode;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States");
        countryOptions.put("GB", "United Kingdom");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("JavaScript", "JavaScript");
        favoriteLanguageOptions.put("C#", "C#");
        operatingSystemOptions = new LinkedHashMap<>();
        operatingSystemOptions.put("Linux", "Linux");
        operatingSystemOptions.put("Windows", "Windows");
        operatingSystemOptions.put("macOS", "macOS");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
        this.favoriteLanguageOptions = favoriteLanguageOptions;
    }

    public LinkedHashMap<String, String> getOperatingSystemOptions() {
        return operatingSystemOptions;
    }

    public void setOperatingSystemOptions(LinkedHashMap<String, String> operatingSystemOptions) {
        this.operatingSystemOptions = operatingSystemOptions;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

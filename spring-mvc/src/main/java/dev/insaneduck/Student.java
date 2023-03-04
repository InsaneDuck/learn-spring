package dev.insaneduck;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class Student {
    @NotNull(message = "is required not null")
    @Size(min = 1, message = "is required")
    String firstName;
    String lastName;
    @Min(value = 1, message = "enter value in between 1 to 10")
    @Max(value = 1, message = "enter value in between 1 to 10")
    int gpa;

    String country;

    //@Value("#{countryOptions}")
    LinkedHashMap<String, String> countryOptions;

    String favoriteLanguage;

    LinkedHashMap<String, String> favoriteLanguageOptions;

    String[] operatingSystems;

    LinkedHashMap<String, String> operatingSystemOptions;

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

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}

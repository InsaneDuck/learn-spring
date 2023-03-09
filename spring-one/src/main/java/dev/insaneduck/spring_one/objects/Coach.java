package dev.insaneduck.spring_one.objects;

import org.springframework.stereotype.Component;

@Component
public interface Coach {

    boolean getWorkout();

    boolean getFortune();

    public String getDailyWorkout();

    public String getDailyFortune();

}

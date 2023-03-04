package dev.insaneduck.objects;

import org.springframework.stereotype.Component;

@Component
public interface Coach
{

    boolean getWorkout();

    boolean getFortune();

    public String getDailyWorkout();

    public String getDailyFortune();

}

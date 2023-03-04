package dev.insaneduck.objects;

import dev.insaneduck.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;


    // create a no-arg constructor
    public CricketCoach()
    {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public boolean getWorkout()
    {
        return false;
    }

    @Override
    public boolean getFortune()
    {
        return false;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

}

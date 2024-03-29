package dev.insaneduck.spring_one.objects;

import dev.insaneduck.spring_one.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public boolean getWorkout() {
        return false;
    }

    @Override
    public boolean getFortune() {
        return false;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}









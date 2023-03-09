package dev.insaneduck.spring_one.objects;

public class HockeyCoach implements Coach {
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
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

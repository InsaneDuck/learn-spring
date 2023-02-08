package dev.insaneduck;

public class HockeyCoach implements Coach
{
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
        return null;
    }

    @Override
    public String getDailyFortune()
    {
        return null;
    }
}

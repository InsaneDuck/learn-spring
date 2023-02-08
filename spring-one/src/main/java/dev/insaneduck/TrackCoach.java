package dev.insaneduck;

public class TrackCoach implements Coach
{

    private FortuneService fortuneService;

    public TrackCoach()
    {

    }

    public TrackCoach(FortuneService fortuneService)
    {
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
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune()
    {
        return "Just Do It: " + fortuneService.getFortune();
    }

}











package dev.insaneduck;

import dev.insaneduck.objects.Coach;
import dev.insaneduck.objects.TrackCoach;

public class MyApp
{

    public static void main(String[] args)
    {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}

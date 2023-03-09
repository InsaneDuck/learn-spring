package dev.insaneduck.spring_one;

import dev.insaneduck.spring_one.objects.Coach;
import dev.insaneduck.spring_one.objects.TrackCoach;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}

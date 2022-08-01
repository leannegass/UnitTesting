package org.sparta;

public class Greeter {
    static String getgreetings(int timeOfDay) {
        String message;
        if (timeOfDay >= 5 && timeOfDay <= 12){
            message = "Good Morn";

        }
        else if (timeOfDay >= 12 && timeOfDay <= 18){
            message = "Good Aft";
        }
        else{
            message = "Good Even";;
        }
        return message;
    }
}

package com.sustainability.util;
import java.sql.*;
public class calculation{
    //Calculating Mileage
    static void Mileage(float distance, float distance_travel){
        float randomDistance = distance_travel / distance;
        System.out.println(randomDistance);
    }
    //Calculating Water by usage
    static void Water(float gallons, float usage){
        float randomUsage = usage * gallons;
        System.out.println(randomUsage);
    }
    static void Fly(float miles, float flight_travel){
        float randomFD = flight_travel / miles;
        System.out.println(randomFD);
    }
    //getting the amount from each void
    static void Prompt(int count, int user_response){
        int total_responses = user_response;
        System.out.println(total_responses);

    }


}

package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        String name;
        int distanceTraveled, speed, runDuration, restDuration, timeRan;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            timeRan = 0;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            timeRan++;
            if (timeRan <= runDuration) {
                distanceTraveled += speed;
            }
            else {
                if (timeRan == runDuration + restDuration) {
                    timeRan = 0;
                }
            }
            
        }   

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int furthestRan = 0;
        String Winner = "";
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
                
            }
            System.out.println(reindeers[i].getName() + " traveled " + reindeers[i].getDistanceTraveled());
            if (furthestRan < reindeers[i].getDistanceTraveled()) {
                furthestRan = reindeers[i].getDistanceTraveled();
                Winner = reindeers[i].getName();
            }
            
        }
        
        return Winner;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}




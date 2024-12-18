package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { 
        String[][] grid = new String[size][size];

        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            if (i + j == size - 1 || i == size / 2 || i == j || j == size / 2) {
              grid[i][j] = "*" ;
            }
            else {
              grid[i][j] = " ";
            }     
          }
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      
    }
}

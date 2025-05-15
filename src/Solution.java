import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public  static void main(String[] args) {
        int[] records = { 5 , 10 , 2 , 14 , 25 , 21};

        int lowestRecords =  records[0];
        int lowestCount = 0;
        int highestRecords = records[0];
        int highestCount = 0;

        for (int currentRecords : records) {
            // define lowest records
            if (currentRecords < lowestRecords) {
                lowestRecords = currentRecords;
                lowestCount++;
            }
            // define highest records
            if (currentRecords > highestRecords) {
                highestRecords = currentRecords;
                highestCount++;
            }

        }
        System.out.print(List.of(lowestCount , highestCount));
    }
}

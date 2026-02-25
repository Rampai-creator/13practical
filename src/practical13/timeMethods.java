package practical13;

import java.io.*;
import java.text.*;
import java.util.*;

public class timeMethods {
    public static int N = 32654; 
    public static Node[] records = new Node[N + 1];
    public static Node[] sortedRecords; 

    public static void main(String args[]) {
        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = 30; //Number of keys to search 
        int repetition, repetitions = 30;

        //Loading data from file
        loadData("ulysses.numbered");

        

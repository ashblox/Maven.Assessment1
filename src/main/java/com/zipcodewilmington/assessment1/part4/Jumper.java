package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps;
        if (k % j == 0) {
            jumps = k / j;
        } else {
            int additionalJumps = k % j;
            jumps = k/j + additionalJumps;
        }
        return jumps;
    }
}

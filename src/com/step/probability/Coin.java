package com.step.probability;

import java.util.Arrays;

public class Coin {
    private final Face[] faces;
    
    public Coin(Face tail, Face head) {
        this.faces = new Face[] {tail,head};
    }
    
    public double calculateProbabilityOfGettingTail() {
        long numOfTails = Arrays.stream(this.faces).filter(face -> face == Face.TAIL).count();
        return (double) numOfTails / this.faces.length;
    }
    
    public double calculateProbabilityOfNotGettingTail() {
        return 1 - this.calculateProbabilityOfGettingTail();
    }
}

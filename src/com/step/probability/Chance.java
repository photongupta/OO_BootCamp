package com.step.probability;

public class Chance {
    private final double probability;
    public Chance(double probability) {
        this.probability = probability;
    }
    
    public Chance not() {
        return new Chance(1 - this.probability);
    }
    
    public Chance and(Chance other) {
        return new Chance(this.probability * other.probability);
    }
    
    public Chance or(Chance other) {
        return this.not().and(other.not()).not();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.probability, probability) == 0;
    }
}
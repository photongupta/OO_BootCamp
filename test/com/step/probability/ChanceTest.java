package com.step.probability;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void shouldCalculateChancesOfNotGettingTailsWhenFlippingACoin() {
        double probabilityOfGettingTails = 0.5;
        Chance chanceOfGettingTails = new Chance(probabilityOfGettingTails);
        
        Chance expected = new Chance(0.5);
        assertEquals(expected, chanceOfGettingTails.not());
    }
    
    @Test
    public void shouldCalculateChancesOfGettingTwoTailsWhenFlippingTwoCoins() {
        double probabilityOfGettingTails = 0.5;
        Chance chanceOfGettingOneTails = new Chance(probabilityOfGettingTails);
        
        Chance expected = new Chance(0.25);
        assertEquals(expected, chanceOfGettingOneTails.and(chanceOfGettingOneTails));
    }
    
    @Test
    public void shouldCalculateChancesOfGettingAtLeastOneTailWhenFlippingTwoCoins() {
        double probabilityOfGettingTails = 0.5;
        Chance chanceOfGettingOneTail = new Chance(probabilityOfGettingTails);
        
        Chance expected = new Chance(0.75);
        assertEquals(expected, chanceOfGettingOneTail.or(chanceOfGettingOneTail));
    }
}
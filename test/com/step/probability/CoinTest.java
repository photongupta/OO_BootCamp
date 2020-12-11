package com.step.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {
    @Test
    public void shouldCalculateChancesOfGettingTailWhenFlippingANormalCoin() {
        Coin coin = new Coin(Face.TAIL,Face.HEAD);
        assertEquals(0.5, coin.calculateProbabilityOfGettingTail(),0.0);
    }
    
    @Test
    public void shouldCalculateChancesOfGettingTailWhenFlippedCoinHasTwoTails() {
        Coin coin = new Coin(Face.TAIL, Face.TAIL);
        assertEquals(1, coin.calculateProbabilityOfGettingTail(), 0.0);
    }
    
    @Test
    public void shouldCalculateChancesOfGettingTailWhenFlippedCoinHasNoTails() {
        Coin coin = new Coin(Face.HEAD, Face.HEAD);
        assertEquals(0, coin.calculateProbabilityOfGettingTail(), 0.0);
    }
    
    @Test
    public void shouldCalculateChancesOfNotGettingTailWhenFlippingACoin() {
        Coin coin = new Coin(Face.TAIL, Face.HEAD);
        assertEquals(0.5, coin.calculateProbabilityOfNotGettingTail(), 0.0);
    }
}
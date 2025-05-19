package com.coin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailPossibilitiesTest {
    @Test
    void possibilitiesOfNotGettingTailForOneCoin() {
        TailPossibilities tailPossibilities = new TailPossibilities(1,2);
        assertEquals(1,tailPossibilities.getChancesOfNotTails());
    }

    @Test
    void possibilitiesOfGettingTailForOneCoin() {
        TailPossibilities tailPossibilities = new TailPossibilities(1,2);
        assertEquals(1,tailPossibilities.getChanceOfTails(1));
    }
}
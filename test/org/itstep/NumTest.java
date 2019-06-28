package org.itstep;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.itstep.Num.*;

class NumTest {
    @Test
    void sumStr() {
        int testData2 = SumStr(12345);

        Assertions.assertEquals(15,testData2);
    }
    @Test
    void sum() {
        int testData1 = Sum(12345);
        Assertions.assertEquals(15,testData1);
    }
}
package tests;

import org.junit.jupiter.api.Test;
import step1.Dealership;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testIsEmpty {
    @Test

    void testWithIsEmpty(){
        Dealership dealership = new Dealership();

        boolean expectedResult = dealership.listSize()==0;
        boolean actualResult = dealership.isEmpty();

        assertEquals(expectedResult,actualResult);
    }
}

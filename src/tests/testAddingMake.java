package tests;

import org.junit.jupiter.api.Test;
import step1.Dealership;
import step1.Make;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAddingMake {
    @Test

    void testWithAddingMakes(){
        Dealership dealership = new Dealership();
        dealership.addMake(new Make("Ford"));

        boolean expectedResult = true;
        boolean actualResult = dealership.findMakeName("Ford");

        assertEquals(expectedResult,actualResult);
    }
}

package tests;

import org.junit.jupiter.api.Test;
import step1.Dealership;
import step1.Make;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testRemoveMake {
    @Test

    void testWithRemoveMake(){

        Dealership dealership = new Dealership();

        Make make1 = new Make("Ford");
        Make make2 = new Make("Toyota");

        dealership.addMake(make1);
        dealership.addMake(make2);

        dealership.removeMake(make1);

        boolean expectedResult = false;
        boolean actualResult = dealership.findMakeName("Ford");

        assertEquals(expectedResult,actualResult);
    }
}

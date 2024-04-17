package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void testBuildCar(){
        Car c = CarFactory.buildCar("Audi","A4","Pink","CA1234","135KM","Available","R2000");
        assertNotNull(c);

        System.out.println(c.toString());
    }

    @Test
    void testBuildCarWithFail(){
        Car c = CarFactory.buildCar("","","","","","","");
        assertNotNull(c);

        System.out.println(c.toString());

    }

}
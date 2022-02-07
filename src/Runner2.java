import java.util.ArrayList;
import java.util.Arrays;
public class Runner2
{
    public static void main(String[] args)
    {
        Integer[] intsArray = {1, 2, 3, 4, 5};

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Lambo", 10);
        Car car2 = new Car("Mustang", 15);
        Car car3 = new Car("Camry", 0);
        Car[] collections = {car1, car2, car3};

        ArrayList<Car> importCar = new ArrayList<Car>(Arrays.asList(collections));
        System.out.println(importCar);
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car,Data>cars = new HashMap<>();
        cars.put(new Car(1,344), new Data(2003, "RAV4", 5000, "gray"));
        cars.put(new Car(2,323), new Data(1993, "Benz",6000, "Black"));

        System.out.println(cars.entrySet());


    }
}
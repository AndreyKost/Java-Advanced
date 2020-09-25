package softUniParking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parking {
    private Map<String, Car> cars;
    private int capacity;

    public Parking( int capacity) {
        this.cars = new HashMap<>();
        this.capacity = capacity;
    }

    public String addCar(Car car){
        String str="";
        boolean isRegNumOk=true;
        boolean isParkingFull=false;
        for (Map.Entry<String, Car> stringCarEntry : cars.entrySet()) {
            Car value = stringCarEntry.getValue();
            if(value.getRegistrationNumber().equals(car.getRegistrationNumber())){
                isRegNumOk=false;
                str=String.format("Car with that registration number, already exists!");
                break;
            }
        }
        if(cars.size()>=capacity){
            isParkingFull=true;
            str=String.format("Parking is full!");
        }

        if(isRegNumOk && !isParkingFull){
            cars.put(car.getMake(),car);
            str=String.format("Successfully added new car %s %s",car.getMake(),car.getRegistrationNumber());
        }
        return str;
    }

    public String removeCar(String registrationNumber){
        boolean isRemoved=false;
        String str="";
        for (Map.Entry<String, Car> stringCarEntry : cars.entrySet()) {
            Car value = stringCarEntry.getValue();
            if(value.getRegistrationNumber().equals(registrationNumber)){
                cars.remove(stringCarEntry.getKey());
                str=String.format("Successfully removed %s",registrationNumber);
                isRemoved=true;
                break;
            }
        }

        if(!isRemoved){
            str=String.format("Car with that registration number, doesn't exists!");
        }

        return str;
    }

    public void removeSetOfRegistrationNumber(List<String> registrationNumbers){
        boolean isRemoved=false;
        for (String registrationNumber : registrationNumbers) {
            isRemoved=false;
            for (Map.Entry<String, Car> stringCarEntry : cars.entrySet()) {
                Car value = stringCarEntry.getValue();
                if(value.getRegistrationNumber().equals(registrationNumber)){
                    cars.remove(stringCarEntry.getKey());
                    System.out.printf("Successfully removed %s%n",registrationNumber);
                    isRemoved=true;
                }
            }
            if(!isRemoved){
                System.out.printf("Car with that %s number, doesn't exists!%n",registrationNumber);
            }
        }

    }

    public Car getCar(String registrationNumber){
        Car car1=new Car("D","S",1,"33333");
        for (Map.Entry<String, Car> stringCarEntry : cars.entrySet()) {
            Car value = stringCarEntry.getValue();
            if(value.getRegistrationNumber().equals(registrationNumber)){
                return value;
            }
        }
        return car1;
    }

    //ako kluchi ni e reg nomera gvrsuthame obekt car po tozi nachin
    /*public Car getCar(String registrationtionNumber){
        return this.cars.get(registrationtionNumber);
    }*/

    public int getCount(){
        return this.cars.size();
    }


}

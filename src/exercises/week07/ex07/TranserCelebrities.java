package exercises.week07.ex07;

import java.util.List;

public class TranserCelebrities {
    public Boolean transport(Integer numberOfCelebrities, Integer numberOfFivePersonVehicles, Integer numberOfOnePersonVehicles) {

        List<Vehicle> vehicles = new Vehicles().getVehicles(numberOfFivePersonVehicles, numberOfOnePersonVehicles);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.canCarry(numberOfCelebrities)) {
                numberOfCelebrities = vehicle.calculateRemainedCelebrities(numberOfCelebrities);
            }
        }
        if (numberOfCelebrities > 0) {
            return false;
        }
        return true;
    }
}
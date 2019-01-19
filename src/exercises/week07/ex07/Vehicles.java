package exercises.week07.ex07;

import java.util.ArrayList;
import java.util.List;

public class Vehicles {
    FivePersonVehicle fivePersonVehicle = new FivePersonVehicle();
    OnePersonVehicle onePersonVehicle = new OnePersonVehicle();

    public List<Vehicle> getVehicles(Integer numberOf5PersonVehicles, Integer numberOf1PersonVehicles) {
        List<Vehicle> transportVehicle = new ArrayList<>();
        for (int times = 0; times < numberOf5PersonVehicles; times++) {
            transportVehicle.add(fivePersonVehicle);
        }

        for (int times = 0; times < numberOf1PersonVehicles; times++) {
            transportVehicle.add(onePersonVehicle);
        }
        return transportVehicle;
    }
}

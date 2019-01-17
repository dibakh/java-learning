package exercises.week07.ex07;

public class transerCelebrities {
    FivePersonVehicles fivePersonVehicles = new FivePersonVehicles();
    OnePeronVehicles onePeronVehicles = new OnePeronVehicles();

    public Boolean transport(Integer numberOfOnePersonVehicles, Integer numberOfFivePersonVehicles, Integer numberOfCelebrities) {
        if (fivePersonVehicles.checkIfItsPossible(numberOfFivePersonVehicles, numberOfCelebrities)) {
            numberOfCelebrities= calculateRemainedCelebrities(numberOfCelebrities);
            if (onePeronVehicles.checkIfItsPossible(numberOfCelebrities,numberOfOnePersonVehicles)){
                return true;
            }

        }
        return false;
    }

    private Integer calculateRemainedCelebrities(Integer numberOfCelebrities) {
       return numberOfCelebrities % fivePersonVehicles.capacity;
    }

}

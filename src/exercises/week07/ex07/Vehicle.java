package exercises.week07.ex07;

public abstract class Vehicle {

    private Integer numbersOfSeats;

    public Vehicle(Integer numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    public Boolean canCarry(Integer numberOfCelebrities) {
        return numbersOfSeats <= numberOfCelebrities;
    }

    public Integer calculateRemainedCelebrities(Integer numberOfCelebrities){
        return numberOfCelebrities -= numbersOfSeats;
    }
}
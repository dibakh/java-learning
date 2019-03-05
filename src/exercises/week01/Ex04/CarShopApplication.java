package Ex04;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();

        Car bmv = new Car("BMV");
        Car benz = new Car("Benz");
        Car ferari = new Car("Ferari");

        seller.describe(bmv);
        seller.describe(benz);
        seller.describe(ferari);

    }
}

//    Mugatu is thinking about buying another car but he’s not sure which brand he should choose. He goes to a car shop and the seller says that every brand is particularly good, which confuses him.
//        Develop the code that the seller uses to confuse Mugatu saying that every car is particularly good.
//        Follow the instructions below:
//        You need the following classes: Seller, Car and CarShopApplication.
//        A Car has a brand. It also has the getBrand method.
//        A Seller has no attributes. It has the describe method that receives a Car and it says that that car’s brand is particularly good.

//        In the CarShopApplication class main method,
//          create a Seller and three Cars with different brands and use the Seller to describe the three of them.
//          He should say that the three of them are particularly good.


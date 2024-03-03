public class Subscribers extends Passenger {

    public Subscribers(String name, Car reservedCar, double tripCost) {
        super(name, reservedCar, tripCost);
    }

    @Override
    public void reserveCar(Car car) {
        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.5);
    }

    @Override
    public void displayInformation() {
        System.out.println("Subscriber Information:");
        System.out.println("Name: " + getName());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}
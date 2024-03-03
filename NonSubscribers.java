
public class NonSubscribers extends Passenger {
    private boolean hasDiscountCoupon;

    public NonSubscribers(String name, Car reservedCar, double tripCost, boolean hasDiscountCoupon) {
        super(name, reservedCar, tripCost);
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    public boolean hasDiscountCoupon() {
        return hasDiscountCoupon;
    }

    public boolean isHasDiscountCoupon() {
        return hasDiscountCoupon;
    }

    public void setHasDiscountCoupon(boolean hasDiscountCoupon) {
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    @Override
    public void reserveCar(Car car) {
        if (car.getCapacity() == 0) {
            throw new IllegalArgumentException("Cannot reserve a car with zero capacity.");
        }

        setReservedCar(car);
        if (hasDiscountCoupon) {
            setTripCost(car.getRoute().getPrice() * 0.9);
        } else {
            setTripCost(car.getRoute().getPrice());
        }
    }

    @Override
    public void displayInformation() {
        System.out.println("Non-Subscriber Information:");
        System.out.println("Name: " + getName());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}
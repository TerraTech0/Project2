public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Start1", "Destination1", 100.0);
        Route route2 = new Route("Start2", "Destination2", 150.0);


        Car car1 = new Car("Code1", route1, 4);
        Car car2 = new Car("Code2", route2, 0);


        Passenger[] passengers = new Passenger[2];
        passengers[0] = new Subscribers("Subscriber1", null, 0);
        passengers[1] = new NonSubscribers("NonSubscriber1", null, 0, true);

        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof Subscribers) {
                    passenger.reserveCar(car1);
                } else if (passenger instanceof NonSubscribers) {
                    passenger.reserveCar(car2);
                }
                passenger.displayInformation();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
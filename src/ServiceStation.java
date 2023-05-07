public class ServiceStation implements ServiceStationInt {
    @Override
    public void check(Car car) {
        checkTyre(car);
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        checkTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    @Override
    public void check(Bicycle bicycle) {
        checkTyre(bicycle);
        }

    private void checkTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}

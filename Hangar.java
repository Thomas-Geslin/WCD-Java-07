class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Audi", 118000);
        Boat boat = new Boat("King of The Sea", 40000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
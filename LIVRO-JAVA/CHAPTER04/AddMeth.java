class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }
}

class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int minivanRange, sportscarRange;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        minivanRange = minivan.range();
        sportscarRange = sportscar.range();


        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " miles.");

        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + sportscar.range() + " miles.");
    }
}
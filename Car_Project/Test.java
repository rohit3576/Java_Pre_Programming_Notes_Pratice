import java.util.Objects;

// Base class with overridden methods - all other classes will extend this
class Parent {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public Parent(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    // toString() - converts object to string
    @Override
    public String toString() {
        return brand + " " + model + " " + year + " $" + price + " " + color;
    }

    // equals() - compares two objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Parent p = (Parent) obj;
        return year == p.year &&
               price == p.price &&
               brand.equals(p.brand) &&
               model.equals(p.model) &&
               color.equals(p.color);
    }

    // hashCode() - generates unique number for object
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, price, color);
    }
}

// 1. Car class
class Car extends Parent {
    int doors;
    String fuel;
    double engineSize;
    boolean automatic;
    String bodyType;

    public Car(String brand, String model, int year, double price, String color,
               int doors, String fuel, double engineSize, boolean automatic, String bodyType) {
        super(brand, model, year, price, color);
        this.doors = doors;
        this.fuel = fuel;
        this.engineSize = engineSize;
        this.automatic = automatic;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + " Doors:" + doors + " Fuel:" + fuel + 
               " Engine:" + engineSize + "L Auto:" + automatic + " Body:" + bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Car c = (Car) obj;
        return doors == c.doors &&
               engineSize == c.engineSize &&
               automatic == c.automatic &&
               fuel.equals(c.fuel) &&
               bodyType.equals(c.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doors, fuel, engineSize, automatic, bodyType);
    }
}

// 2. Bike class
class Bike extends Parent {
    int cc;
    String type;
    boolean fairing;
    double tankSize;
    String suspension;

    public Bike(String brand, String model, int year, double price, String color,
                int cc, String type, boolean fairing, double tankSize, String suspension) {
        super(brand, model, year, price, color);
        this.cc = cc;
        this.type = type;
        this.fairing = fairing;
        this.tankSize = tankSize;
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return super.toString() + " CC:" + cc + " Type:" + type + 
               " Fairing:" + fairing + " Tank:" + tankSize + "L Suspension:" + suspension;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Bike b = (Bike) obj;
        return cc == b.cc &&
               tankSize == b.tankSize &&
               fairing == b.fairing &&
               type.equals(b.type) &&
               suspension.equals(b.suspension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cc, type, fairing, tankSize, suspension);
    }
}

// 3. Truck class
class Truck extends Parent {
    double payload;
    int axles;
    String truckClass;
    double bedLength;
    boolean hitch;

    public Truck(String brand, String model, int year, double price, String color,
                 double payload, int axles, String truckClass, double bedLength, boolean hitch) {
        super(brand, model, year, price, color);
        this.payload = payload;
        this.axles = axles;
        this.truckClass = truckClass;
        this.bedLength = bedLength;
        this.hitch = hitch;
    }

    @Override
    public String toString() {
        return super.toString() + " Payload:" + payload + "tons Axles:" + axles + 
               " Class:" + truckClass + " Bed:" + bedLength + "ft Hitch:" + hitch;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Truck t = (Truck) obj;
        return payload == t.payload &&
               axles == t.axles &&
               bedLength == t.bedLength &&
               hitch == t.hitch &&
               truckClass.equals(t.truckClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), payload, axles, truckClass, bedLength, hitch);
    }
}

// 4. Boat class
class Boat extends Parent {
    double length;
    String boatType;
    int engines;
    double fuelCap;
    boolean cabin;

    public Boat(String brand, String model, int year, double price, String color,
                double length, String boatType, int engines, double fuelCap, boolean cabin) {
        super(brand, model, year, price, color);
        this.length = length;
        this.boatType = boatType;
        this.engines = engines;
        this.fuelCap = fuelCap;
        this.cabin = cabin;
    }

    @Override
    public String toString() {
        return super.toString() + " Length:" + length + "ft Type:" + boatType + 
               " Engines:" + engines + " Fuel:" + fuelCap + "gal Cabin:" + cabin;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Boat b = (Boat) obj;
        return length == b.length &&
               engines == b.engines &&
               fuelCap == b.fuelCap &&
               cabin == b.cabin &&
               boatType.equals(b.boatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, boatType, engines, fuelCap, cabin);
    }
}

// 5. Plane class
class Plane extends Parent {
    int passengers;
    double wingspan;
    double maxAlt;
    int engines;
    String planeType;

    public Plane(String brand, String model, int year, double price, String color,
                 int passengers, double wingspan, double maxAlt, int engines, String planeType) {
        super(brand, model, year, price, color);
        this.passengers = passengers;
        this.wingspan = wingspan;
        this.maxAlt = maxAlt;
        this.engines = engines;
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        return super.toString() + " Passengers:" + passengers + " Wingspan:" + wingspan + 
               "m MaxAlt:" + maxAlt + "ft Engines:" + engines + " Type:" + planeType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Plane p = (Plane) obj;
        return passengers == p.passengers &&
               wingspan == p.wingspan &&
               maxAlt == p.maxAlt &&
               engines == p.engines &&
               planeType.equals(p.planeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengers, wingspan, maxAlt, engines, planeType);
    }
}

// 6. Bicycle class
class Bicycle extends Parent {
    int gears;
    String frameMat;
    double wheelSize;
    String brakeType;
    boolean electric;

    public Bicycle(String brand, String model, int year, double price, String color,
                   int gears, String frameMat, double wheelSize, String brakeType, boolean electric) {
        super(brand, model, year, price, color);
        this.gears = gears;
        this.frameMat = frameMat;
        this.wheelSize = wheelSize;
        this.brakeType = brakeType;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return super.toString() + " Gears:" + gears + " Frame:" + frameMat + 
               " Wheels:" + wheelSize + "in Brakes:" + brakeType + " Electric:" + electric;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Bicycle b = (Bicycle) obj;
        return gears == b.gears &&
               wheelSize == b.wheelSize &&
               electric == b.electric &&
               frameMat.equals(b.frameMat) &&
               brakeType.equals(b.brakeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gears, frameMat, wheelSize, brakeType, electric);
    }
}

// 7. RV class
class RV extends Parent {
    double length;
    int sleeps;
    boolean bathroom;
    String rvClass;
    double waterTank;

    public RV(String brand, String model, int year, double price, String color,
              double length, int sleeps, boolean bathroom, String rvClass, double waterTank) {
        super(brand, model, year, price, color);
        this.length = length;
        this.sleeps = sleeps;
        this.bathroom = bathroom;
        this.rvClass = rvClass;
        this.waterTank = waterTank;
    }

    @Override
    public String toString() {
        return super.toString() + " Length:" + length + "ft Sleeps:" + sleeps + 
               " Bathroom:" + bathroom + " Class:" + rvClass + " Water:" + waterTank + "gal";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        RV r = (RV) obj;
        return length == r.length &&
               sleeps == r.sleeps &&
               waterTank == r.waterTank &&
               bathroom == r.bathroom &&
               rvClass.equals(r.rvClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, sleeps, bathroom, rvClass, waterTank);
    }
}

// 8. Bus class
class Bus extends Parent {
    int seats;
    double busLength;
    boolean wifi;
    String busType;
    int standing;

    public Bus(String brand, String model, int year, double price, String color,
               int seats, double busLength, boolean wifi, String busType, int standing) {
        super(brand, model, year, price, color);
        this.seats = seats;
        this.busLength = busLength;
        this.wifi = wifi;
        this.busType = busType;
        this.standing = standing;
    }

    @Override
    public String toString() {
        return super.toString() + " Seats:" + seats + " Length:" + busLength + 
               "m WiFi:" + wifi + " Type:" + busType + " Standing:" + standing;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Bus b = (Bus) obj;
        return seats == b.seats &&
               busLength == b.busLength &&
               standing == b.standing &&
               wifi == b.wifi &&
               busType.equals(b.busType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats, busLength, wifi, busType, standing);
    }
}

// 9. Tractor class
class Tractor extends Parent {
    double horsePower;
    String driveType;
    int plows;
    boolean cab;
    String fuelType;

    public Tractor(String brand, String model, int year, double price, String color,
                   double horsePower, String driveType, int plows, boolean cab, String fuelType) {
        super(brand, model, year, price, color);
        this.horsePower = horsePower;
        this.driveType = driveType;
        this.plows = plows;
        this.cab = cab;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " HP:" + horsePower + " Drive:" + driveType + 
               " Plows:" + plows + " Cab:" + cab + " Fuel:" + fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Tractor t = (Tractor) obj;
        return horsePower == t.horsePower &&
               plows == t.plows &&
               cab == t.cab &&
               driveType.equals(t.driveType) &&
               fuelType.equals(t.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horsePower, driveType, plows, cab, fuelType);
    }
}

// 10. Helicopter class
class Helicopter extends Parent {
    int rotors;
    double maxSpeed;
    double maxAltitude;
    int engines;
    String heliType;

    public Helicopter(String brand, String model, int year, double price, String color,
                      int rotors, double maxSpeed, double maxAltitude, int engines, String heliType) {
        super(brand, model, year, price, color);
        this.rotors = rotors;
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.engines = engines;
        this.heliType = heliType;
    }

    @Override
    public String toString() {
        return super.toString() + " Rotors:" + rotors + " Speed:" + maxSpeed + 
               "kts MaxAlt:" + maxAltitude + "ft Engines:" + engines + " Type:" + heliType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Helicopter h = (Helicopter) obj;
        return rotors == h.rotors &&
               maxSpeed == h.maxSpeed &&
               maxAltitude == h.maxAltitude &&
               engines == h.engines &&
               heliType.equals(h.heliType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rotors, maxSpeed, maxAltitude, engines, heliType);
    }
}

// Main class to test everything
public class Test {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", "Camry", 2023, 28000, "Silver", 
                          4, "Hybrid", 2.5, true, "Sedan");
        Car car2 = new Car("Toyota", "Camry", 2023, 28000, "Silver", 
                          4, "Hybrid", 2.5, true, "Sedan");
        Car car3 = new Car("Honda", "Civic", 2023, 25000, "Red", 
                          4, "Gas", 1.8, false, "Coupe");
        Bike bike = new Bike("Harley", "Street", 2023, 28000, "Black", 
                            1800, "Cruiser", true, 22.7, "Telescopic");

        // Testing toString()
        System.out.println("=== Testing toString() ===");
        System.out.println("Car1: " + car1);
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);
        System.out.println("Bike: " + bike);
        
        // Testing equals()
        System.out.println("\n=== Testing equals() ===");
        System.out.println("car1 equals car2: " + car1.equals(car2)); // true
        System.out.println("car1 equals car3: " + car1.equals(car3)); // false
        System.out.println("car1 equals bike: " + car1.equals(bike)); // false
        
        // Testing hashCode()
        System.out.println("\n=== Testing hashCode() ===");
        System.out.println("car1 hash: " + car1.hashCode());
        System.out.println("car2 hash: " + car2.hashCode());
        System.out.println("car3 hash: " + car3.hashCode());
        
        // Important: Equal objects must have equal hashcodes
        System.out.println("\ncar1 and car2 have " + 
            (car1.hashCode() == car2.hashCode() ? "SAME" : "DIFFERENT") + " hash codes");
    }
}
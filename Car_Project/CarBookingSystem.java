import java.util.Objects;

public class CarBookingSystem {

    public static void main(String[] args) {

        Car car1 = new Car(1,"Toyota","Fortuner",5000,true);
        Car car2 = new Car(1,"Toyota","Fortuner",5000,true);
        Car car3 = new Car(2,"BMW","X5",8000,true);

        Customer c1 = new Customer(101,"Rohit","rohit@mail","9999","MH123");
        Customer c2 = new Customer(102,"Amit","amit@mail","8888","MH456");

        Booking b1 = new Booking(1,101,1,"1-JUN","5-JUN");
        Payment p1 = new Payment(201,1,20000,"UPI","Paid");

        Location l1 = new Location(1,"Mumbai","Andheri",400001,"WestBranch");
        Driver d1 = new Driver(11,"Ramesh","7777",5,4.5);

        Insurance i1 = new Insurance(301,1,"HDFC",500000,"2027");
        Maintenance m1 = new Maintenance(401,1,"10-MAY","Engine",3000);

        Review r1 = new Review(501,101,1,5,"Great car");
        CarType t1 = new CarType(1,"SUV",7,"Diesel","Auto");

        System.out.println("---- CAR DETAILS ----");
        System.out.println(car1);
        System.out.println(car3);

        System.out.println("\n---- CUSTOMER ----");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\n---- BOOKING ----");
        System.out.println(b1);

        System.out.println("\n---- PAYMENT ----");
        System.out.println(p1);

        System.out.println("\n---- LOCATION ----");
        System.out.println(l1);

        System.out.println("\n---- DRIVER ----");
        System.out.println(d1);

        System.out.println("\n---- INSURANCE ----");
        System.out.println(i1);

        System.out.println("\n---- MAINTENANCE ----");
        System.out.println(m1);

        System.out.println("\n---- REVIEW ----");
        System.out.println(r1);

        System.out.println("\n---- CAR TYPE ----");
        System.out.println(t1);

        System.out.println("\n---- EQUALS TEST ----");
        System.out.println("car1 equals car2 : "+car1.equals(car2));
        System.out.println("car1 equals car3 : "+car1.equals(car3));

        System.out.println("\n---- HASHCODE ----");
        System.out.println("car1 hash : "+car1.hashCode());
        System.out.println("car2 hash : "+car2.hashCode());
    }
}

/* CAR */

class Car{
int id; String brand; String model; double price; boolean available;

Car(int id,String brand,String model,double price,boolean available){
this.id=id; this.brand=brand; this.model=model; this.price=price; this.available=available;
}

public String toString(){
return "Car[id="+id+", brand="+brand+", model="+model+", price="+price+", available="+available+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Car)) return false;
Car c=(Car)o;
return id==c.id && price==c.price && available==c.available &&
Objects.equals(brand,c.brand)&&Objects.equals(model,c.model);
}

public int hashCode(){ return Objects.hash(id,brand,model,price,available); }
}

/* CUSTOMER */

class Customer{
int id; String name; String email; String phone; String license;

Customer(int id,String name,String email,String phone,String license){
this.id=id; this.name=name; this.email=email; this.phone=phone; this.license=license;
}

public String toString(){
return "Customer[id="+id+", name="+name+", email="+email+", phone="+phone+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Customer)) return false;
Customer c=(Customer)o;
return id==c.id;
}

public int hashCode(){ return Objects.hash(id,name,email,phone,license); }
}

/* BOOKING */

class Booking{
int id; int custId; int carId; String start; String end;

Booking(int id,int custId,int carId,String start,String end){
this.id=id; this.custId=custId; this.carId=carId; this.start=start; this.end=end;
}

public String toString(){
return "Booking[id="+id+", customer="+custId+", car="+carId+", start="+start+", end="+end+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Booking)) return false;
Booking b=(Booking)o;
return id==b.id;
}

public int hashCode(){ return Objects.hash(id,custId,carId,start,end); }
}

/* PAYMENT */

class Payment{
int id; int bookingId; double amount; String method; String status;

Payment(int id,int bookingId,double amount,String method,String status){
this.id=id; this.bookingId=bookingId; this.amount=amount; this.method=method; this.status=status;
}

public String toString(){
return "Payment[id="+id+", amount="+amount+", method="+method+", status="+status+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Payment)) return false;
Payment p=(Payment)o;
return id==p.id;
}

public int hashCode(){ return Objects.hash(id,bookingId,amount,method,status); }
}

/* LOCATION */

class Location{
int id; String city; String address; int pincode; String branch;

Location(int id,String city,String address,int pincode,String branch){
this.id=id; this.city=city; this.address=address; this.pincode=pincode; this.branch=branch;
}

public String toString(){
return "Location["+city+", "+branch+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Location)) return false;
Location l=(Location)o;
return id==l.id;
}

public int hashCode(){ return Objects.hash(id,city,address,pincode,branch); }
}

/* DRIVER */

class Driver{
int id; String name; String phone; int exp; double rating;

Driver(int id,String name,String phone,int exp,double rating){
this.id=id; this.name=name; this.phone=phone; this.exp=exp; this.rating=rating;
}

public String toString(){
return "Driver[name="+name+", rating="+rating+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Driver)) return false;
Driver d=(Driver)o;
return id==d.id;
}

public int hashCode(){ return Objects.hash(id,name,phone,exp,rating); }
}

/* INSURANCE */

class Insurance{
int id; int carId; String provider; double amount; String expiry;

Insurance(int id,int carId,String provider,double amount,String expiry){
this.id=id; this.carId=carId; this.provider=provider; this.amount=amount; this.expiry=expiry;
}

public String toString(){
return "Insurance["+provider+", coverage="+amount+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Insurance)) return false;
Insurance i=(Insurance)o;
return id==i.id;
}

public int hashCode(){ return Objects.hash(id,carId,provider,amount,expiry); }
}

/* MAINTENANCE */

class Maintenance{
int id; int carId; String date; String type; double cost;

Maintenance(int id,int carId,String date,String type,double cost){
this.id=id; this.carId=carId; this.date=date; this.type=type; this.cost=cost;
}

public String toString(){
return "Maintenance[type="+type+", cost="+cost+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Maintenance)) return false;
Maintenance m=(Maintenance)o;
return id==m.id;
}

public int hashCode(){ return Objects.hash(id,carId,date,type,cost); }
}

/* REVIEW */

class Review{
int id; int custId; int carId; int rating; String comment;

Review(int id,int custId,int carId,int rating,String comment){
this.id=id; this.custId=custId; this.carId=carId; this.rating=rating; this.comment=comment;
}

public String toString(){
return "Review[rating="+rating+", "+comment+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof Review)) return false;
Review r=(Review)o;
return id==r.id;
}

public int hashCode(){ return Objects.hash(id,custId,carId,rating,comment); }
}

/* CARTYPE */

class CarType{
int id; String name; int seats; String fuel; String transmission;

CarType(int id,String name,int seats,String fuel,String transmission){
this.id=id; this.name=name; this.seats=seats; this.fuel=fuel; this.transmission=transmission;
}

public String toString(){
return "CarType["+name+", seats="+seats+", fuel="+fuel+"]";
}

public boolean equals(Object o){
if(this==o) return true;
if(!(o instanceof CarType)) return false;
CarType c=(CarType)o;
return id==c.id;
}

public int hashCode(){ return Objects.hash(id,name,seats,fuel,transmission); }
}
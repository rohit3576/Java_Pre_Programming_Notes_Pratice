import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Raj", "CS", 85, "999");
        Student s2 = new Student(1, "Raj", "CS", 85, "999");
        
        System.out.println("Student: " + s1);
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Hash: " + s1.hashCode());
    }
}

class Student { int id; String name, dept, phone; int marks;
    Student(int id, String name, String dept, int marks, String phone) {
        this.id=id; this.name=name; this.dept=dept; this.marks=marks; this.phone=phone; }
    public String toString() { return id+"-"+name+"-"+dept+"-"+marks+"-"+phone; }
    public boolean equals(Object o) {
        if(!(o instanceof Student)) return false;
        Student s=(Student)o;
        return id==s.id && marks==s.marks && name.equals(s.name) && dept.equals(s.dept) && phone.equals(s.phone); }
    public int hashCode() { return Objects.hash(id,name,dept,marks,phone); }
}

class Employee { int id, salary, rating; String name, dept;
    Employee(int id, String name, String dept, int salary, int rating) {
        this.id=id; this.name=name; this.dept=dept; this.salary=salary; this.rating=rating; }
    public String toString() { return id+"-"+name+"-"+dept+"-"+salary+"-"+rating; }
    public boolean equals(Object o) {
        if(!(o instanceof Employee)) return false;
        Employee e=(Employee)o;
        return id==e.id && salary==e.salary && rating==e.rating && name.equals(e.name) && dept.equals(e.dept); }
    public int hashCode() { return Objects.hash(id,name,dept,salary,rating); }
}

class Product { int id, price, stock; String name, category;
    Product(int id, String name, String category, int price, int stock) {
        this.id=id; this.name=name; this.category=category; this.price=price; this.stock=stock; }
    public String toString() { return id+"-"+name+"-"+category+"-"+price+"-"+stock; }
    public boolean equals(Object o) {
        if(!(o instanceof Product)) return false;
        Product p=(Product)o;
        return id==p.id && price==p.price && stock==p.stock && name.equals(p.name) && category.equals(p.category); }
    public int hashCode() { return Objects.hash(id,name,category,price,stock); }
}

class Book { int id, price; String title, author, isbn;
    Book(int id, String title, String author, int price, String isbn) {
        this.id=id; this.title=title; this.author=author; this.price=price; this.isbn=isbn; }
    public String toString() { return id+"-"+title+"-"+author+"-"+price+"-"+isbn; }
    public boolean equals(Object o) {
        if(!(o instanceof Book)) return false;
        Book b=(Book)o;
        return id==b.id && price==b.price && title.equals(b.title) && author.equals(b.author) && isbn.equals(b.isbn); }
    public int hashCode() { return Objects.hash(id,title,author,price,isbn); }
}

class Movie { int id, year, rating; String title, director;
    Movie(int id, String title, String director, int year, int rating) {
        this.id=id; this.title=title; this.director=director; this.year=year; this.rating=rating; }
    public String toString() { return id+"-"+title+"-"+director+"-"+year+"-"+rating; }
    public boolean equals(Object o) {
        if(!(o instanceof Movie)) return false;
        Movie m=(Movie)o;
        return id==m.id && year==m.year && rating==m.rating && title.equals(m.title) && director.equals(m.director); }
    public int hashCode() { return Objects.hash(id,title,director,year,rating); }
}

class BankAccount { int accNo, balance; String holder, bank, type;
    BankAccount(int accNo, String holder, String bank, int balance, String type) {
        this.accNo=accNo; this.holder=holder; this.bank=bank; this.balance=balance; this.type=type; }
    public String toString() { return accNo+"-"+holder+"-"+bank+"-"+balance+"-"+type; }
    public boolean equals(Object o) {
        if(!(o instanceof BankAccount)) return false;
        BankAccount b=(BankAccount)o;
        return accNo==b.accNo && balance==b.balance && holder.equals(b.holder) && bank.equals(b.bank) && type.equals(b.type); }
    public int hashCode() { return Objects.hash(accNo,holder,bank,balance,type); }
}

class Patient { int id, age; String name, disease, blood;
    Patient(int id, String name, int age, String disease, String blood) {
        this.id=id; this.name=name; this.age=age; this.disease=disease; this.blood=blood; }
    public String toString() { return id+"-"+name+"-"+age+"-"+disease+"-"+blood; }
    public boolean equals(Object o) {
        if(!(o instanceof Patient)) return false;
        Patient p=(Patient)o;
        return id==p.id && age==p.age && name.equals(p.name) && disease.equals(p.disease) && blood.equals(p.blood); }
    public int hashCode() { return Objects.hash(id,name,age,disease,blood); }
}

class HotelRoom { int id, price, roomNo; String type; boolean available;
    HotelRoom(int id, String type, int price, boolean available, int roomNo) {
        this.id=id; this.type=type; this.price=price; this.available=available; this.roomNo=roomNo; }
    public String toString() { return id+"-"+type+"-"+price+"-"+available+"-"+roomNo; }
    public boolean equals(Object o) {
        if(!(o instanceof HotelRoom)) return false;
        HotelRoom h=(HotelRoom)o;
        return id==h.id && price==h.price && available==h.available && roomNo==h.roomNo && type.equals(h.type); }
    public int hashCode() { return Objects.hash(id,type,price,available,roomNo); }
}

class Course { int id, credits, duration; String name, dept;
    Course(int id, String name, String dept, int credits, int duration) {
        this.id=id; this.name=name; this.dept=dept; this.credits=credits; this.duration=duration; }
    public String toString() { return id+"-"+name+"-"+dept+"-"+credits+"-"+duration; }
    public boolean equals(Object o) {
        if(!(o instanceof Course)) return false;
        Course c=(Course)o;
        return id==c.id && credits==c.credits && duration==c.duration && name.equals(c.name) && dept.equals(c.dept); }
    public int hashCode() { return Objects.hash(id,name,dept,credits,duration); }
}

class LibraryMember { int id, books; String name, expiry, status;
    LibraryMember(int id, String name, String expiry, int books, String status) {
        this.id=id; this.name=name; this.expiry=expiry; this.books=books; this.status=status; }
    public String toString() { return id+"-"+name+"-"+expiry+"-"+books+"-"+status; }
    public boolean equals(Object o) {
        if(!(o instanceof LibraryMember)) return false;
        LibraryMember l=(LibraryMember)o;
        return id==l.id && books==l.books && name.equals(l.name) && expiry.equals(l.expiry) && status.equals(l.status); }
    public int hashCode() { return Objects.hash(id,name,expiry,books,status); }
}
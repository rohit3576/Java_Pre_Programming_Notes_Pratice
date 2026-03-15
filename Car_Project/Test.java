import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // Create objects for all 10 classes
        Student s1 = new Student(1, "Raj", "CS", 85, "999");
        Student s2 = new Student(1, "Raj", "CS", 85, "999");
        Employee e1 = new Employee(101, "Amit", "IT", 50000, 4);
        Product p1 = new Product(201, "Laptop", "Electronics", 55000, 10);
        Book b1 = new Book(301, "Java", "James", 500, "ISBN123");
        Movie m1 = new Movie(401, "Avatar", "Cameron", 2009, 9);
        BankAccount ba1 = new BankAccount(501, "Rahul", "SBI", 25000, "Savings");
        Patient pt1 = new Patient(601, "Sunita", 30, "Flu", "A+");
        HotelRoom hr1 = new HotelRoom(701, "Deluxe", 3000, true, 101);
        Course c1 = new Course(801, "DSA", "CS", 4, 6);
        LibraryMember lm1 = new LibraryMember(901, "Vikram", "2025", 3, "Active");

        // Print header
        System.out.println("========================================");
        System.out.println("    10 CLASSES DEMO WITH 5 PROPERTIES");
        System.out.println("========================================\n");

        // Display all objects
        System.out.println("1. STUDENT      : " + s1);
        System.out.println("2. EMPLOYEE     : " + e1);
        System.out.println("3. PRODUCT      : " + p1);
        System.out.println("4. BOOK         : " + b1);
        System.out.println("5. MOVIE        : " + m1);
        System.out.println("6. BANK ACCOUNT : " + ba1);
        System.out.println("7. PATIENT      : " + pt1);
        System.out.println("8. HOTEL ROOM   : " + hr1);
        System.out.println("9. COURSE       : " + c1);
        System.out.println("10. LIBRARY     : " + lm1);

        // Test equals and hashCode
        System.out.println("\n-------- EQUALS & HASHCODE TEST --------");
        System.out.println("Student1: " + s1);
        System.out.println("Student2: " + s2);
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.hashCode() : " + s1.hashCode());
        System.out.println("s2.hashCode() : " + s2.hashCode());
        System.out.println("========================================");
    }
}

// 1. STUDENT CLASS
class Student { 
    int id; 
    String name, dept, phone; 
    int marks;
    
    Student(int id, String name, String dept, int marks, String phone) {
        this.id = id; 
        this.name = name; 
        this.dept = dept; 
        this.marks = marks; 
        this.phone = phone; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + dept + "-" + marks + "-" + phone; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && marks == s.marks && 
               name.equals(s.name) && dept.equals(s.dept) && phone.equals(s.phone); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, dept, marks, phone); 
    }
}

// 2. EMPLOYEE CLASS
class Employee { 
    int id, salary, rating; 
    String name, dept;
    
    Employee(int id, String name, String dept, int salary, int rating) {
        this.id = id; 
        this.name = name; 
        this.dept = dept; 
        this.salary = salary; 
        this.rating = rating; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + dept + "-" + salary + "-" + rating; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return id == e.id && salary == e.salary && rating == e.rating && 
               name.equals(e.name) && dept.equals(e.dept); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, dept, salary, rating); 
    }
}

// 3. PRODUCT CLASS
class Product { 
    int id, price, stock; 
    String name, category;
    
    Product(int id, String name, String category, int price, int stock) {
        this.id = id; 
        this.name = name; 
        this.category = category; 
        this.price = price; 
        this.stock = stock; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + category + "-" + price + "-" + stock; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return id == p.id && price == p.price && stock == p.stock && 
               name.equals(p.name) && category.equals(p.category); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, category, price, stock); 
    }
}

// 4. BOOK CLASS
class Book { 
    int id, price; 
    String title, author, isbn;
    
    Book(int id, String title, String author, int price, String isbn) {
        this.id = id; 
        this.title = title; 
        this.author = author; 
        this.price = price; 
        this.isbn = isbn; 
    }
    
    public String toString() { 
        return id + "-" + title + "-" + author + "-" + price + "-" + isbn; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return id == b.id && price == b.price && 
               title.equals(b.title) && author.equals(b.author) && isbn.equals(b.isbn); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, title, author, price, isbn); 
    }
}

// 5. MOVIE CLASS
class Movie { 
    int id, year, rating; 
    String title, director;
    
    Movie(int id, String title, String director, int year, int rating) {
        this.id = id; 
        this.title = title; 
        this.director = director; 
        this.year = year; 
        this.rating = rating; 
    }
    
    public String toString() { 
        return id + "-" + title + "-" + director + "-" + year + "-" + rating; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Movie)) return false;
        Movie m = (Movie) o;
        return id == m.id && year == m.year && rating == m.rating && 
               title.equals(m.title) && director.equals(m.director); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, title, director, year, rating); 
    }
}

// 6. BANK ACCOUNT CLASS
class BankAccount { 
    int accNo, balance; 
    String holder, bank, type;
    
    BankAccount(int accNo, String holder, String bank, int balance, String type) {
        this.accNo = accNo; 
        this.holder = holder; 
        this.bank = bank; 
        this.balance = balance; 
        this.type = type; 
    }
    
    public String toString() { 
        return accNo + "-" + holder + "-" + bank + "-" + balance + "-" + type; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof BankAccount)) return false;
        BankAccount b = (BankAccount) o;
        return accNo == b.accNo && balance == b.balance && 
               holder.equals(b.holder) && bank.equals(b.bank) && type.equals(b.type); 
    }
    
    public int hashCode() { 
        return Objects.hash(accNo, holder, bank, balance, type); 
    }
}

// 7. PATIENT CLASS
class Patient { 
    int id, age; 
    String name, disease, blood;
    
    Patient(int id, String name, int age, String disease, String blood) {
        this.id = id; 
        this.name = name; 
        this.age = age; 
        this.disease = disease; 
        this.blood = blood; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + age + "-" + disease + "-" + blood; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id == p.id && age == p.age && 
               name.equals(p.name) && disease.equals(p.disease) && blood.equals(p.blood); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, age, disease, blood); 
    }
}

// 8. HOTEL ROOM CLASS
class HotelRoom { 
    int id, price, roomNo; 
    String type; 
    boolean available;
    
    HotelRoom(int id, String type, int price, boolean available, int roomNo) {
        this.id = id; 
        this.type = type; 
        this.price = price; 
        this.available = available; 
        this.roomNo = roomNo; 
    }
    
    public String toString() { 
        return id + "-" + type + "-" + price + "-" + available + "-" + roomNo; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof HotelRoom)) return false;
        HotelRoom h = (HotelRoom) o;
        return id == h.id && price == h.price && available == h.available && 
               roomNo == h.roomNo && type.equals(h.type); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, type, price, available, roomNo); 
    }
}

// 9. COURSE CLASS
class Course { 
    int id, credits, duration; 
    String name, dept;
    
    Course(int id, String name, String dept, int credits, int duration) {
        this.id = id; 
        this.name = name; 
        this.dept = dept; 
        this.credits = credits; 
        this.duration = duration; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + dept + "-" + credits + "-" + duration; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Course)) return false;
        Course c = (Course) o;
        return id == c.id && credits == c.credits && duration == c.duration && 
               name.equals(c.name) && dept.equals(c.dept); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, dept, credits, duration); 
    }
}

// 10. LIBRARY MEMBER CLASS
class LibraryMember { 
    int id, books; 
    String name, expiry, status;
    
    LibraryMember(int id, String name, String expiry, int books, String status) {
        this.id = id; 
        this.name = name; 
        this.expiry = expiry; 
        this.books = books; 
        this.status = status; 
    }
    
    public String toString() { 
        return id + "-" + name + "-" + expiry + "-" + books + "-" + status; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof LibraryMember)) return false;
        LibraryMember l = (LibraryMember) o;
        return id == l.id && books == l.books && 
               name.equals(l.name) && expiry.equals(l.expiry) && status.equals(l.status); 
    }
    
    public int hashCode() { 
        return Objects.hash(id, name, expiry, books, status); 
    }
}
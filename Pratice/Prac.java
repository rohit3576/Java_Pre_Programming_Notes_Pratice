class School{
    String name;
    int id;

}
class Student extends School{
    public void print(){
        System.out.println(name+"this was name and "+id+" this is id " );
    }
}

public class Prac{
    public static void main(String[] args) {
        System.out.println("This is pratice");
        Student s= new Student();
        s.id=1224;
        s.name="Rohit";
        s.print();
    }
}
class Abhay{
    String sname;
    Abhay(String sname){
        this.sname=sname;
        System.out.println("sname object created");
    }
}

public class Rohit {

    public static void main(String[] args) {
        System.out.println("This is my og name");
        Abhay a= new Abhay("Pawar");
    }
}
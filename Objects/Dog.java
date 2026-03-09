class Data{
    String name;

    public void bark(){
        System.out.println(name+" barks all the time");
    }

}

public class Dog {
    public static void main(String[] args) {
        Data d= new Data();
        d.name="Neo";
        d.bark();
    }
    
}

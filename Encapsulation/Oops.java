class Instagram{
    int id;
    String name;

     Instagram(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);


    }

    
}

public class Oops{
    public static void main(String[] args) {
        Instagram i1= new Instagram(739797,"Rohit" );

        i1.show();
        
    }

}
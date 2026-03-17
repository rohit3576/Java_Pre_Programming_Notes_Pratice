class College {
    int id;
    String name;
}

class VCET extends College{
    public void clgDetail(){
        System.out.println(id+" This is id ");
    }

    public VCET(int id, String name) {
        this.id=id;
        this.name=name;
    }

    
}



public class StringPrac {

    public static void main(String[] args) {
        VCET v= new VCET(231545, "VIdya");
        v.clgDetail();

    }
}
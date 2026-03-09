
class Engine{
    int id;
}
class Car extends Engine{
    Engine e= new Engine();
}
class Demo{
    private int id;
    private String name;

    public String getData(String name){
        return name;
    }
    public void setData(int id, String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        Car c= new Car();
        System.out.println(c.id); 

        
    }
}
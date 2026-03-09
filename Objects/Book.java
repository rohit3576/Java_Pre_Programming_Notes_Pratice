class Data{
    int price;
    String name;
    String author;
}
class Book{
    public static void main(String[] args) {
        Data b1= new Data();
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(b1.name);
        b1.author="ROhit";
        b1.name="Her Name";
        b1.price=100;
        
        System.out.println("name of the book is: "+b1.name);
    }
}
class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public Dog setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public Dog setAge(int age) {
        this.age = age;
        return this;
    }

    public Dog bark() {
        System.out.println(name + " says Woof Woof!");
        return this;
    }

    public void info() {
        System.out.println(breed + " " + age + " years old");
    }
}
class DogDriver{
    public static void main(String[] args) {
        Dog d = new Dog();
d.setName("Tommy").setBreed("Labrador").setAge(3).bark().info();



    }
}
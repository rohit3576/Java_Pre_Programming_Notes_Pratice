class Engine{
    private int hp;
    public int getHp(){
        return hp;

    }
    public void sethp(int hp){
        this.hp=hp;
    }

    public Engine(int hp) {
        sethp(hp);
        System.out.println("Enginer Object is created");

    }
    

}
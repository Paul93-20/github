public class Cat extends Animal {
    private Bowl bowl;

    int catAppetite;
    int catSatiety;
    public Cat (String name){
        super("Кот " + name);
        this.runLimit = 200;
        this.jumpLimit = 0.5;
        this.catAppetite = 0;
        this.catSatiety = 0;
        }

        public void swim(int distance){
            System.out.println("Кот " + name + " не умеет плавать!");
        }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсук");
    }
    public Bowl getBowl(){
        return bowl;
    }
    public void setBowl(Bowl bowl){
        this.bowl = bowl;
    }
}


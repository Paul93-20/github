public class Bowl {
    private Cat cat1;
    public String bowlTitle;
    public int bowlValue;
    public int eatInBowl;
    public Bowl(String _bowlTitle, int _bowlValue, int _eatInBowl) {
        this.bowlTitle = _bowlTitle;
        this.bowlValue = _bowlValue;
        this.eatInBowl = _eatInBowl;
    }
    public void fullUpBowl(){
        if(eatInBowl == 0){
            eatInBowl++;
        }
    }
    public void infoBowl(){
        if(eatInBowl >= 0) {
            System.out.println(eatInBowl);
        }
        else {
            System.out.println("В миске не может быть отрицательного количества еды");
        }
    }

    public static void main(String[] args) {
        Bowl bowl1 = new Bowl("Bowl1", 10, 10);
    }

    public Cat getCat() {
        return cat1;
    }
    public void setCat(Cat cat){
        this.cat1 = cat;
    }
    public void catEat (){
        if(eatInBowl > 0){
            int foodAfterEat = eatInBowl - cat1.catAppetite;
            System.out.println("Кот " + cat1.name  );
        }
    }
}



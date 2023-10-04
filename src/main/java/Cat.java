public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite < 1){
            this.appetite = 1;
        } else {
            this.appetite = appetite;
        }
        this.satiety = false;
    }

    public void catInfo () {
        System.out.printf("Имя котика: %s, аппетит: %d, ", name, appetite);
        if (!satiety){
            System.out.println("Котик голоден");
        } else {
            System.out.println("Котик сыт");
        }
    }

    public void eat() {
        Plate.setFood(Plate.getFood1() - appetite);
        satiety = true;
    }

}

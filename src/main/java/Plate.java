public class Plate {
    protected static int food = 50;

    public int getFood() {
        return food;
    }

    public static int getFood1() {
        return food;
    }

    public static void setFood(int food) {
        Plate.food = food;
    }

    public Plate(int food) {
        if (food < 20){
            this.food = 20;
        } else {
            this.food = food;
        }

    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void fillPlate() {
        Plate.food = 50;
    }
}

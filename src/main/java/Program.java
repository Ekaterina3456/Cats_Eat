import java.lang.reflect.Array;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 7);
        Cat cat2 = new Cat("Персик", 13);
        Cat cat3 = new Cat("Мурзик", 10);
        Cat cat4 = new Cat("Мася", 15);
        Cat cat5 = new Cat("Мурка", 8);
        Plate plate = new Plate(50);

        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        plate.info();

        for (Cat cat: cats) {
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat();
                cat.catInfo();
            } else {
                System.out.println("Котику не хватило корма");
                cat.catInfo();
            }
        }

//        plate.fillPlate();

//        plate.setFood(plate.getFood() - cat1.getAppetite());
        plate.info();


    }
}

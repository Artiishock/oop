import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Vasy", 15, false);
        allCats[1] = new Cat("Snezhok", 10, false);
        allCats[2] = new Cat("Ugolek", 35, false);
        allCats[3] = new Cat("Barsik", 25, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite <= plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Cat " + allCats[i].name + " ate!");
            } else {
                System.out.println("Cat " + allCats[i].name + " didn't eat!");
            }
        }
        plate.info();
        System.out.println("How many more grams of food should I add to the bowl?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
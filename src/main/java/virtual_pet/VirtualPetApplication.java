package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet pet1 = new VirtualPet("Diego");
        while (true) {
            System.out.println(pet1.getName());
            System.out.println("Hunger level: " + pet1.getHunger());
            System.out.println("Thirst level: " + pet1.getThirst());
            System.out.println("Waste level: " + pet1.getWaste());
            System.out.println("Boredom level: " + pet1.getBoredom());

            System.out.println("Action# " + pet1.getTick() + " - Press 1 to feed, press 2 to give a drink, press 3 to take pet out, and 4 to play with pet. ");
            Scanner scanner = new Scanner(System.in);
            int userSelection = scanner.nextInt();

            if (userSelection == 1) {
                pet1.feedPet();
            } else if (userSelection == 2) {
                pet1.givePetWater();
            } else if (userSelection == 3) {
                pet1.takePetOut();
            } else if (userSelection == 4) {
                pet1.playWithPet();
            }
            if (pet1.getHunger() == 10){
                System.out.println("Sorry, game over. You forgot to feed me.");
                break;
            }
            if (pet1.getThirst() == 10){
                System.out.println("Sorry, game over. You forgot to give me water.");
                break;
            }
            if (pet1.getWaste() == 10){
                System.out.println("Sorry, game over. You forgot to take me to the bathroom.");
                break;
            }
            if (pet1.getBoredom() == 10){
                System.out.println("Sorry, game over. You forgot to play with me.");
                break;
            }


        }

    }

}





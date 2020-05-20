package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int boredom;
    private int waste;
    private final String name;
    private int tick;

    public VirtualPet(String name) {
        this.name = name;
        this.tick = 1;
        this.boredom = 5;
        this.thirst = 5;
        this.hunger = 5;
        this.waste = 5;
    }

    public void playWithPet(){
        this.boredom--;
        this.thirst++;
        this.hunger++;
        System.out.println("Boredom level: "+this.getBoredom());
    }

    public void givePetWater(){
        this.thirst--;
        this.waste++;
        this.boredom++;
        this.tick++;
        System.out.println("Thirst level: "+this.getThirst());

    }
    public void feedPet(){
        this.hunger--;
        this.waste++;
        this.tick++;
        this.thirst++;
        System.out.println("Hunger level: "+this.getHunger());
    }
    public void takePetOut(){
        this.waste=0;
        this.tick++;
        System.out.println("Waste level: "+this.getWaste());

    }
    public int getTick(){
        return tick;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getWaste() {
        return waste;
    }

    public String getName() {
        return name;
    }


}


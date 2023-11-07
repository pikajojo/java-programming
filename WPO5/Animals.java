package WPO5;

import java.util.ArrayList;

public class Animals {

    private String food;
    private boolean isVegetarian;
    private int nrOfLegs;
    private String sound;
    private String name;

    public Animals(String food, boolean isVegetarian, int nrOfLegs , String sound, String name){
        this.food = food;
        this.isVegetarian = isVegetarian;
        this.nrOfLegs = nrOfLegs;
        this.sound = sound;
        this.name = name;

    }

    public void EatFood(){
        System.out.println( this.name+" eat "+this.food);
    }

    public void IsVegetarian(){
        if(this.isVegetarian == true){
        System.out.println( this.name + " are vegetarian");}
        else{
            System.out.println(this.name + " are not vegetarian");
        }
    }

    public void NumberOfLegs(){
        System.out.println(this.name + " have "+this.nrOfLegs+" legs");
    }

    public void makeSound(){
        System.out.println(this.name + " make "+ this.sound);
    }

    public String getFood() {
        return food;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("fish");
        Eagle eagle = new Eagle("meat");
        Elephant elephant = new Elephant("tree");
        Fish fish = new Fish("bug");
        Shark shark = new Shark("little fish");
        Grasshopper grasshopper = new Grasshopper("grass");
        ArrayList<Animals> animalsList = new ArrayList<>(6);
        animalsList.add(cat);
        animalsList.add(eagle);
        animalsList.add(elephant);
        animalsList.add(fish);
        animalsList.add(shark);
        animalsList.add(grasshopper);

        for(Animals animal: animalsList){
            animal.EatFood();
            animal.isVegetarian();
            animal.NumberOfLegs();
            animal.makeSound();
        }

    }
}

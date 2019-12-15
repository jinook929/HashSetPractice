package academy.learnprogramming;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> hs01 = new HashSet<>();
        HashSet<String> hs02 = new HashSet<>();

        hs01.add("Hong");
        hs01.add("Lee");
        System.out.println(hs01.add("Lim"));
        System.out.println(hs01.add("Lim"));
//        hs01.add("Tim");
//        System.out.println(hs01.add("Tim"));
//        System.out.println(hs01.add("Tim"));

        for(String e : hs01) {
            System.out.print(e + " ");
        }

        System.out.println("\n" + hs01.toString());

        hs02.add("Lim");
        hs02.add("Hong");
        hs02.add("Lee");
//        hs02.add("Ron");

        Iterator<String> iter02 = hs02.iterator();

        while(iter02.hasNext()) {
            System.out.print(iter02.next() + " ");
        }

        System.out.println("\nSize of the Array : " + hs02.size());

        HashSet<Animal> hs = new HashSet<>();

        hs.add(new Animal("Cat", "Land"));
        hs.add(new Animal("Cat", "Land"));
        hs.add(new Animal("Cat", "Land"));
        hs.add(new Animal("Shark", "Sea"));

        System.out.println("Number of Animals : " + hs.size());
    }
}

class Animal {
    String species;
    String habitat;

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public int hashCode() {
        return (species + habitat).hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal temp = (Animal) obj;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        } else {
            return false;
        }
    }
}

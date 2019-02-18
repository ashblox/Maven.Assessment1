package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    public String name;
    public Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets.length != 0) {
            this.pets = Arrays.copyOf(pets, pets.length);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (pets != null) {
            ArrayList<Pet> arrList = new ArrayList<>(Arrays.asList(pets));
            arrList.add(pet);
            pets = arrList.toArray(pets);
        } else {
            pets = new Pet[1];
            pets[0] = pet;
        }
}

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> arrList = new ArrayList<>(Arrays.asList(pets));
        arrList.remove(pet);
        pets = arrList.toArray(pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isOwnerOf = false;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == pet) {
                isOwnerOf = true;
            }
        }
        return isOwnerOf;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = pets[0].getAge();
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getAge() < youngestAge) {
                youngestAge = pets[i].getAge();
            }
        }
        return youngestAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = pets[0].getAge();
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getAge() > oldestAge) {
                oldestAge = pets[i].getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float averagePetAge = 0.0f;
        for (int i = 0; i < pets.length; i++) {
            averagePetAge += pets[i].getAge();
        }
        return averagePetAge/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}

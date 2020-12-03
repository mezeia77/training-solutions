package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void addPets(Pet pet) {
        for (Pet pet1:pets) {
            if (isExists(pet1, pet)){
                return;
            }
        }pets.add(pet);
    }

    public boolean isExists(Pet pet1, Pet pet2){
        return pet1.getId().equals(pet2.getId());
    }


}

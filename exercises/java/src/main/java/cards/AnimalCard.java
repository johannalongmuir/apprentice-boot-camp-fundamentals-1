package cards;

public class AnimalCard implements CardMethods {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }


    @Override
    public String toString() {
        return animal.toString();
    }


    @Override
    public boolean snap(CardMethods otherCard) {
        return false;
    }
}

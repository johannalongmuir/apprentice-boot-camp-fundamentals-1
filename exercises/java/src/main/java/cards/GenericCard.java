package cards;

public abstract class GenericCard implements CardMethods {

    protected String genericCardValue;

    public boolean snap;

    public abstract boolean snap(GenericCard previousCard);


}

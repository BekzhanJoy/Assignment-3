public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.50;
    }
}

public abstract class TemplateMethod {
    public String brewBeverage() {
        return boilWater() +
                putCaffeine() +
                putMilk() +
                putSugar() +
                pourToCup();
    }

    private String boilWater() {
        return "Boil the water.\n";
    }

    protected abstract String putCaffeine();

    protected abstract String putMilk();

    protected abstract String putSugar();

    private String pourToCup() {
        return "Pour the beverage into a cup.\n";
    }
}

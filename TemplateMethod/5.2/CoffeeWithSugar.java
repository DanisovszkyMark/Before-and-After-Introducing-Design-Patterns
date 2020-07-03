public class CoffeeWithSugar extends TemplateMethod {
    @Override
    protected String putCaffeine() {
        String whatToDo;
        whatToDo = "Put instant coffee powder into the hot water.";
        return whatToDo + "\n";
    }

    @Override
    protected String putMilk() {
        String whatToDo;
        whatToDo = "No milk this time.";
        return whatToDo + "\n";
    }

    @Override
    protected String putSugar() {
        String whatToDo;
        whatToDo = "Put some sugar.";
        return whatToDo + "\n";
    }
}

public class Tee extends TemplateMethod {
    @Override
    protected String putCaffeine() {
        String whatToDo;
        whatToDo = "Put teefilter into the hot water.";
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
        whatToDo = "No sugar this time.";
        return whatToDo + "\n";
    }
}

public class TemplateMethod {
    public static final int TEE = 1;
    public static final int TEE_WITH_MILK = 2;
    public static final int COFFEE = 3;
    public static final int COFFEE_WITH_SUGAR = 4;
    public static final int COFFEE_WITH_MILK_AND_SUGAR = 5;
    private int type;

    public void brewBeverage() {
        boilWater();
        putCaffeine();
        putMilk();
        putSugar();
        pourToCup();
    }

    private String boilWater() {
        return "Boil the water.\n";
    }

    private String putCaffeine() {
        String whatToDo;
        if (type == TEE) {
            whatToDo = "Put teefilter into the hot water.";
        }
        else if (type == TEE_WITH_MILK) {
            whatToDo = "Put teefilter into the hot water.";
        }
        else if (type == COFFEE) {
            whatToDo = "Put instant coffee powder into the hot water.";
        }
        else if (type == COFFEE_WITH_SUGAR) {
            whatToDo = "Put instant coffee powder into the hot water.";
        }
        else if (type == COFFEE_WITH_MILK_AND_SUGAR) {
            whatToDo = "Put instant coffee powder into the hot water.";
        }
        else {
            whatToDo = "Unknown beverage type!";
        }
        return whatToDo + "\n";
    }

    private String putMilk() {
        String whatToDo;
        if (type == TEE) {
            whatToDo = "No milk this time.";
        }
        else if (type == TEE_WITH_MILK) {
            whatToDo = "Put some milk.";
        }
        else if (type == COFFEE) {
            whatToDo = "No milk this time.";
        }
        else if (type == COFFEE_WITH_SUGAR) {
            whatToDo = "No milk this time.";
        }
        else if (type == COFFEE_WITH_MILK_AND_SUGAR) {
            whatToDo = "Put some milk.";
        }
        else {
            whatToDo = "Unknown beverage type!";
        }
        return whatToDo + "\n";
    }

    private String putSugar() {
        String whatToDo;
        if (type == TEE) {
            whatToDo = "No sugar this time.";
        }
        else if (type == TEE_WITH_MILK) {
            whatToDo = "No sugar this time.";
        }
        else if (type == COFFEE) {
            whatToDo = "No sugar this time.";
        }
        else if (type == COFFEE_WITH_SUGAR) {
            whatToDo = "Put some sugar.";
        }
        else if (type == COFFEE_WITH_MILK_AND_SUGAR) {
            whatToDo = "Put some sugar.";
        }
        else {
            whatToDo = "Unknown beverage type!";
        }
        return whatToDo + "\n";
    }

    private String pourToCup() {
        return "Pour the beverage into a cup.\n";
    }

    public TemplateMethod(int type) {
        this.type = type;
    }
}



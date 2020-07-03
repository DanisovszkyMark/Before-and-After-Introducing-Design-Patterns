public class Main {
    public static void main(String[] args){
        TemplateMethod tm1 =
                new TemplateMethod(TemplateMethod.TEE);
        String s = tm1.brewBeverage();
        System.out.print(s);
    }
}

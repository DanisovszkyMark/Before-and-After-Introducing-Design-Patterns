public class Main {
    public static void main(String[] args){
        TemplateMethod tm1 = new Tee();
        String s = tm1.brewBeverage();
        System.out.print(s);
    }
}

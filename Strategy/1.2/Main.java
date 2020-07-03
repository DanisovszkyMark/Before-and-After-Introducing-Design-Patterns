import calculator.Division;

public class Main {
    public static void main(String[] args){
        calculator.Calculator calculator = new calculator.Calculator();
        calculator.setA(10);
        calculator.setB(20);
        calculator.setOperationStrategy(new Division()); // A konstans alapjáni példány

        System.out.println("Result: " + calculator.calculate());
    }
}
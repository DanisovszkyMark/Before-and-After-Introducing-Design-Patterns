import calculator.Calculator;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setA(10);
        calculator.setB(20);
        calculator.setOperator('/');

        System.out.println("Result: " + calculator.calculate());
    }
}

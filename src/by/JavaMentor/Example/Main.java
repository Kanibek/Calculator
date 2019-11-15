package by.JavaMentor.Example;
public class Main {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        int num1 = calc.getInt();
        int num2 = calc.getInt();
        char operation = calc.getOperation();
        int result = calc.calcu(num1,num2,operation);
        System.out.println("Результат операции "+result);
    }
}

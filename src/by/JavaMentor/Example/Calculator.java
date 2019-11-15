package by.JavaMentor.Example;

import java.util.Scanner;

public class Calculator {
    static Scanner scn = new Scanner(System.in);
    public int getInt(){
        System.out.println("Введите число:");
        int num;
        if (scn.hasNextInt()){
            num = scn.nextInt();
        }
        else {
            System.out.println("Введите число еще раз.");
            scn.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char opertion;
        if (scn.hasNext()){
            opertion = scn.next().charAt(0);
        }
        else{
            System.out.println("Попробуйте операцию еще раз.");
            scn.next();
            opertion = getOperation();
        }
        return opertion;
    }
    public static int calcu (int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не выполнено! Повторите еще раз.");
                result = calcu(num1,num2,getOperation());
        }
            return result;
    }
}

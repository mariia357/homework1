package LambdaExpression;

//Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази
public class HomeWork4 {

    interface MathOperation {
        int operation(int a, int b);
    }
    public static void main(String[] args) {
        MathOperation addition = Integer::sum;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = ");
        calculate(10, 5, addition);

        System.out.println("10 - 5 = ");
        calculate(10, 5, subtraction);

        System.out.println("10 * 5 = ");
        calculate(10, 5, multiplication);

        System.out.println("10 / 5 = ");
        calculate(10, 5, division);

    }

    private static void calculate(int a, int b, MathOperation mathOperation){
        System.out.println(mathOperation.operation(a, b));
    }

}

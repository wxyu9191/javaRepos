package java8property;

/**
 * @Author: balabala
 * @Date: 2020/2/23 3:16 PM
 * @introduce: Lambda 表达式，也可称为闭包， 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * (parameters) -> expression
 * 或
 * (parameters) ->{ statements; }
 */

public class Java84Lambda {
    public static void main(String[] args) {

        Java84Lambda tester = new Java84Lambda();


        // 实现了MathOperation的接口， 隐式的重写了方法。
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface GreetingService {
        void sayMessage(String message);

    }


    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}




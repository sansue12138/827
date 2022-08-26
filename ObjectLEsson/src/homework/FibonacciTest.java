package homework;

/**
 * @author liuchang
 * @Create 2022-08-19-18:45
 */
public class FibonacciTest {
    public static void main(String[] args) {
        FibonacciTest fibonacciTest =new FibonacciTest();
        System.out.println(fibonacciTest.Fibonacci(10));
    }

    public int Fibonacci(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return Fibonacci(n-2)+Fibonacci(n-1);
        }
    }
}

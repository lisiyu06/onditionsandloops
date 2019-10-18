import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 输出一个整数的每一位
public class PrintEveryBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int num = scanner.nextInt();
        testPrintEveryInt(num);
    }

    private static void testPrintEveryInt(int num) {
        if (num > 9) {
            testPrintEveryInt(num / 10);
        }
        System.out.print(num % 10 + " ");
    }
}

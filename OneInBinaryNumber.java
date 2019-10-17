import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 写一个函数返回参数二进制中 1 的个数
// 比如： 15 : 0000 1111 4 个 1
public class OneInBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int num = scanner.nextInt();
        System.out.println(testOneInBinaryNumber1(num));
        System.out.println(testOneInBinaryNumber2(num));
        System.out.println(testOneInBinaryNumber3(num));
    }

    // 1. 按位与
    public static int testOneInBinaryNumber1(int num) {
        int count = 0;
        while(num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    // 2. 模2 除2
    public static int testOneInBinaryNumber2(int num) {
        int count = 0;
        while (num > 0) {
            if ((num % 2) == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
    // 3. n 与 n-1
    public static int testOneInBinaryNumber3(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}

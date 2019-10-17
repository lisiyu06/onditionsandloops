import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。
public class BinarySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int num = scanner.nextInt();
        testBinarySequence(num);
    }
    public static void testBinarySequence(int num) {
        System.out.println("偶数序列：");
        for (int i = 31; i > 0; i -= 2) {
            System.out.print((num >> i) & 1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print((num >> i) & 1);
        }
    }
}

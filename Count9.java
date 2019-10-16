/**
 * Author: lisiyu
 * Created: 2019/10/16
 */

// 编写程序数一下 1到 100 的所有整数中出现多少个数字 9
public class Count9 {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 10 == 9) {
                count++;
            }
            if (n / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}

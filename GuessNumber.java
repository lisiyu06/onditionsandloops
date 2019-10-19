import java.util.Random;
import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 猜数字游戏
public class GuessNumber {
    public static void main(String[] args) {

        System.out.println("游戏开始！");
        System.out.println("请输入一个1-100之间的数字：");

        // 生成随机数
        Random random = new Random();
        int rightNumber = random.nextInt(100) + 1;

        // 用户输入
        Scanner scanner = new Scanner(System.in);

        // 判断
        while (true) {
            int entered = scanner.nextInt();
            if (entered > rightNumber) {
                System.out.println("猜大了，请重新输入");
            } else if (entered < rightNumber) {
                System.out.println("猜小了，请重新输入");
            } else {
                System.out.println("恭喜您，猜对了！");
                System.out.println("游戏结束");
                break;
            }
        }

        scanner.close();
    }
}

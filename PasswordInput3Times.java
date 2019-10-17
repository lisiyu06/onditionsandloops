import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 编写代码模拟三次密码输入的场景。
// 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，最多输入三次。
// 三次均错，则提示退出程序
public class PasswordInput3Times {
    public static void main(String[] args) {
        String rightPassword = "123456";
        Scanner scanner = new Scanner(System.in);
        for (int count = 0; count < 3; count++) {
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            if (password.equals(rightPassword)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("密码错误，请重新输入");
            }
            if (count == 2) {
                System.out.println("密码错误，退出登录");
            }
        }
        scanner.close();
    }
}

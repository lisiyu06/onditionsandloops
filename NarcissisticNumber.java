/**
 * Author: lisiyu
 * Created: 2019/10/17
 */

// 求出0～999之间的所有“水仙花数”并输出。
// “水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如 153
public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int a = i % 10;
            int b = (i  / 10) % 10;
            int c = i / 100;
            if (i == a*a*a + b*b*b + c*c*c) {
                System.out.println(i);
            }
        }
    }
}

/**
 * Author: PING
 * Date: 2022/10/4
 */

public class Sum_oddnumber {
    public static void main(String[] args) {
        int i;
        int j = 100;
        int sum = 0;
        for (i = 0; i <= j; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("100以内的奇数和是" + sum);
    }
}

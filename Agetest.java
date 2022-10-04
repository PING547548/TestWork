import java.util.Scanner;

public class Agetest {
    public static void main(String[] args) {
        Scanner myage = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = myage.nextInt();
        if (age < 18) {
            System.out.println("年龄" + age + "岁是少年");
        } else if (age >= 18 && age < 30) {
            System.out.println("年龄" + age + "岁是青年");
        } else if (age >= 30 && age < 60) {
            System.out.println("年龄" + age + "岁是中年");
        } else if (age >= 60 && age < 110) {
            System.out.println("年龄" + age + "岁是老年");
        } else
            System.out.println("年龄超出正常范围，请重新输入");
    }
}

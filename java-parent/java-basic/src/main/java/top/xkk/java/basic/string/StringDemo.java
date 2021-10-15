package top.xkk.java.basic.string;

import java.util.Scanner;

/**
 * 字符串练习
 */
public class StringDemo {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("给字符串a赋值：");
        String a = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.print("给字符串b赋值：");
        String b = input2.nextLine();
        System.out.println("字符串a：" + a);
        System.out.println("字符串b：" + b);

        // 比较两个字符串是否相同
        System.out.println("两字符串是否相同：" + a.equals(b));
        // 比较两个字符串是否同一个对象
        System.out.println("两字符串是否同一个对象：" + a == b);
        // 比较两个字符串
        System.out.println(a.equalsIgnoreCase(b));
        // 合并字符串
        String c = a + b;
        System.out.println("合并后的字符串" + c);
        // 查找子串是否在此字符串中，如在，包含多少次？
        Scanner input3 = new Scanner(System.in);
        System.out.print("请输入子字符串：");
        String d = input3.nextLine();
        // 判断是否包含
        System.out.println("子字符串是否被包含：" + c.contains(d));
        // 求包含次数
        System.out.println("包含次数：" + repetitions(c,d));
        // 把子字符串替换为新的字符串
        Scanner s4 = new Scanner(System.in);
        System.out.println("请选择是否替换字符串：确定（1）/ 拒绝（2）");
        int e = s4.nextInt();
        switch (e) {
            case 1:
                Scanner s5 = new Scanner(System.in);
                System.out.print("请输入想要替换的原字符串：");
                String f = s5.nextLine();
                Scanner s6 = new Scanner(System.in);
                System.out.print("请输入想要替换的新字符串：");
                String g = s6.nextLine();
                // 将f替换为g
                String z = c.replace(f,g);
                System.out.println("替换前：" + c);
                System.out.println("替换后：" + z);
                break;
            case 2:
                System.out.println("最终的字符串内容为：" + c);
                break;
            default:
                System.out.println("该字符串有误");
                break;
        }
    }

    // 求包含次数
    public static int repetitions(String c,String d) {
        // 统计次数
        int count = 0;
        while (c.indexOf(d) != -1) {
            c = c.substring(c.indexOf(d) + 1,c.length());
            count++;
        }
        return count;
    }
}

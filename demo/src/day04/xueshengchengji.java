package demo.src.day04;

import java.util.Scanner;

public class xueshengchengji {
    public static void main(String[] args) {
        input();
    }
//    录入学生成绩
    // 定义数组，存储学生成绩
    //测试git1231
    public static void input(){
        double[] scores = {123.45, 678.90, 234.56, 789.01, 345.67, 890.12, 456.78, 901.23, 567.89, 999.99};
//        double[] scores = new double[8];
//        //录入学生成绩存入数组
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0;i < scores.length; i++){
//            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
//            scores[i] = sc.nextDouble();
//        }
        //遍历数组，统计总分，输出平均分
        double num = 0.0;
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            num += score;
        }
        //求出最大值
        double max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }
        //求出最大值
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println("平均分" + num / scores.length);
        System.out.println("最高分" + max);
        System.out.println("最低分" + min);

    }
}

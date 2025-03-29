package demo.src.day04;

public class zuizhi {
    //    入口
    public static void main(String[] args) {
    //求最值
        double[] arr = {1.2, 3.4, 5.6, 7.8, 9.0};

        double max = getMax(arr);
        System.out.println("最大值为：" + max);
    }
    public static double getMax(double[] arr){

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
    return max;
    }


}

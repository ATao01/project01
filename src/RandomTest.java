import java.util.Scanner;

/**
 * ClassName: RandomTest
 * Description:
 *
 * @Author A-Tao
 * @Create 2023/9/13 14:21
 * @Version 1.0
 */
public class RandomTest {
        //猜数字游戏
        public static void main(String[] args) {
            int frequency;
            //定义随机数字变量
            int num = (int) (Math.random() * 10);
            System.out.println("请输入你所猜的数字(0-9)");
            //通过Scanner从键盘获取数字
            Scanner scan = new Scanner(System.in);
            for (frequency = 3; frequency >= 1; frequency--) {
                System.out.println("你有现在有:" + frequency + "次机会");
                int num0 = scan.nextInt();
                if (num0 > 9 || num0 < 0){
                    System.out.println("对不起，请输入正确的数字(0-9)");
                    frequency++;
                } else if (num > num0) {
                    System.out.println("对不起，你猜的数字较小");
                }else if (num < num0){
                    System.out.println("对不起，你猜的数字较大");
                }else {
                    System.out.println("恭喜你猜对了！！！");break;
                }
            }
            if (frequency == 0){
                System.out.println("很遗憾，你的机会用完了，正确答案是: " + num);
            }
            scan.close();
            //System.out.println(num);
        }
}

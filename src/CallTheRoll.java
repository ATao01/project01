import java.util.Scanner;

/**
 * ClassName: CallTheRoll
 * Description:
 *
 * @Author A-Tao
 * @Create 2023/9/20 19:32
 * @Version 1.0
 */
public class CallTheRoll {
    public void add(String[] strings){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.print("请输入学生姓名:");
            strings[i] = scan.next();
        }
    }

    public void print(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println("第" + (i + 1) +"个同学:" + strings[i]);
        }
    }

    public void random(String[] strings){
        int index = (int) (Math.random() * 4);
        System.out.println("被点到的学生姓名是:" + strings[index]);
    }
}

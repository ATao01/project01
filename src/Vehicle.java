/**
 * ClassName: Vehicle
 * Description:
 *
 * @Author A-Tao
 * @Create 2023/9/20 14:25
 * @Version 1.0
 */
public class Vehicle {
    private double speed;
    private int power;

    public void speedUp(int i){
        System.out.println("速度提升" + i);
    }
    public void speedDown(int i){
        System.out.println("速度降低" + i);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }
}

package zyf.abstructfactory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午1:19
 */
public abstract class BenzCar implements ICar {

    public String getBrand() {
        return "Benz";
    }

    public abstract String getColor();

}

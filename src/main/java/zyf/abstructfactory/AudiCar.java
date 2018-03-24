package zyf.abstructfactory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午1:17
 */
public abstract class AudiCar implements ICar {

    public String getBrand() {
        return "Audi";
    }

    public abstract String getColor();

}

package zyf.abstructfactory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午1:25
 */
public class RedCarFactory implements IFactory {
    public BenzCar createBenz() {
        return new RedBenzCar();
    }

    public BMWCar createBMW() {
        return new RedBMWCar();
    }

    public AudiCar createAudi() {
        return new RedAudiCar();
    }
}

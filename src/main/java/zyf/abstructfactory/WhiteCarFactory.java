package zyf.abstructfactory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午1:26
 */
public class WhiteCarFactory implements IFactory {

    public BenzCar createBenz() {
        return new WhiteBenzCar();
    }

    public BMWCar createBMW() {
        return new WhiteBMWCar();
    }

    public AudiCar createAudi() {
        return new WhiteAudiCar();
    }
}

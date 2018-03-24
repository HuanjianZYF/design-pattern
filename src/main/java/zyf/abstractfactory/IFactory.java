package zyf.abstractfactory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午1:23
 * 抽象工厂模式感觉就是把一个大工厂拆分成了生产不同类别产品的子工厂，关键在于产品种类
 */
public interface IFactory {
    BenzCar createBenz();
    BMWCar createBMW();
    AudiCar createAudi();
}

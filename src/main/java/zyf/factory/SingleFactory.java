package zyf.factory;

import java.lang.reflect.Constructor;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午10:33
 * 单例工厂
 */
public class SingleFactory {

    public static ProductLonely createProduct() {
        ProductLonely productLonely = null;
        try {
            Class clazz = productLonely.getClass();
            Constructor condtructor = clazz.getDeclaredConstructor();
            condtructor.setAccessible(true);
            productLonely = (ProductLonely) clazz.newInstance();
        } catch (Exception e) {
            throw new ProductCreateException("创建productLonely实例失败");
        }

        return productLonely;
    }
}

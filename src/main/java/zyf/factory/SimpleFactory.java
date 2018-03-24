package zyf.factory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午10:31
 * 简单工厂/静态工厂
 */
public class SimpleFactory {

    public static <T extends IProduct> T createProduct(Class<T> clazz) {
        IProduct product = null;
        try {
            product = (IProduct) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            throw new ProductCreateException("创建" + clazz.getName() + "实例失败");
        }

        return (T)product;
    }
}

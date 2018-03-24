package zyf.factory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午10:17
 * 工厂接口
 */
public interface IFactory {
    <T extends IProduct> T createProduct(Class<T> clazz);
}

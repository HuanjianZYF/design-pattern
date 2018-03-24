package zyf.factory;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午10:25
 */
public class ProductCreateException extends RuntimeException {

    public ProductCreateException() {
        super();
    }

    public ProductCreateException(String msg) {
        super(msg);
    }
}

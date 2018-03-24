package zyf.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午10:07
 * 动态代理类,感觉值得更好的设计
 */
public class DynamicProxy<T> {

    //暂时想不到更好的注入通知的设计
    private static BeforeAdvice beforeAdvice;

    //为一个接口的实现类生成代理
    public static <T> T newDynamicProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        if (beforeAdvice != null) {
            beforeAdvice.before();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

    public static void setBeforeAdvice(BeforeAdvice beforeAdvice) {
        DynamicProxy.beforeAdvice = beforeAdvice;
    }

    //这个接口定义了 代理实际执行的方法
    static class MyInvocationHandler implements InvocationHandler {

        private Object obj;

        public MyInvocationHandler(Object obj) {
            this.obj = obj;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(obj, args);
        }
    }
}

package zyf.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午10:30
 */
public class Main {

    public static void main(String[] args) {
        IWork work = new Work();
        
        InvocationHandler handler = new DynamicProxy.MyInvocationHandler(work);
        ClassLoader classLoader = work.getClass().getClassLoader();
        Class<?>[] interfaces = work.getClass().getInterfaces();

        DynamicProxy.setBeforeAdvice(new BeforeAdviceImpl());
        IWork proxy = DynamicProxy.newDynamicProxyInstance(classLoader, interfaces, handler);
        proxy.doSomeThing();
    }
}

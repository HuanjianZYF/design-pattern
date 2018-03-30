package zyf.visiter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/30 下午11:43
 */
public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();

        list.add(new Benz());
        list.add(new Benz());
        list.add(new BMW());

        IVisiter visiter = new Visiter();
        for (Car car : list) {
            car.accept(visiter);
        }
    }
}

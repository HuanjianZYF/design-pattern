package zyf.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 上午12:04
 * 被观察者抽象类
 */
public abstract class Observable {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        if (observerList != null && observerList.size() != 0) {
            for (Observer observer : observerList) {
                observer.update();
            }
        }
    }
}

package zyf.visiter;

/**
 * @Author zyf
 * @CreateAt 2018/3/30 下午11:34
 */
public abstract class Car {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void accept(IVisiter visiter); //被遍历到要执行的方法
}

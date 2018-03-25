package zyf.responsibilitychain;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午8:00
 * 请求，带一个等级
 **/
public class Request {

    private Integer level;

    public Request(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }
}

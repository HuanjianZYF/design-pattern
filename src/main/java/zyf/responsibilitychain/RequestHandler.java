package zyf.responsibilitychain;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午7:57
 * 责任链模式，为每个处理器定义一个处理等级，将处理先交由第一个处理器处理，
 * 当处理请求合适时，处理，不合适时交由下一个处理器
 */
public abstract class RequestHandler {

    private RequestHandler next; //下一个转发点
    private Integer requestLevel; //请求等级

    public RequestHandler(Integer level) {
        this.requestLevel = level;
    }

    public final void handleRequest(Request request) {
        if (request.getLevel() != null && request.getLevel().equals(requestLevel)) {
            doRealWork();
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            //不能处理
        }
    }

    public abstract void doRealWork();

    public void setNext(RequestHandler handler) {
        this.next = handler;
    }
}

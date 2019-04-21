package com.restep.chainofresp;

/**
 * 抽象类
 *
 * @author restep
 * @date 2019/4/18
 */
public abstract class Leader {
    protected String name;
    /**
     * 责任链上的后继对象
     */
    protected Leader nextLeader;

    public Leader(String name) {
        super();
        this.name = name;
    }

    /**
     * 设定责任链上的后继对象
     *
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }


    /**
     * 处理请求的核心的业务方法
     *
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}

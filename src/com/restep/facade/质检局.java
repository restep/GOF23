package com.restep.facade;

/**
 * @author restep
 * @date 2019/4/21
 */
public interface 质检局 {
    void orgCodeCertificate();
}

class 海淀质检局 implements 质检局 {
    @Override
    public void orgCodeCertificate() {
        System.out.println("在海淀区质检局办理组织机构代码证！");
    }
}

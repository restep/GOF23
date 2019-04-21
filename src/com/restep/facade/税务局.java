package com.restep.facade;

/**
 * @author restep
 * @date 2019/4/21
 */
public interface 税务局 {
    void taxCertificate();
}


class 海淀税务局 implements 税务局 {
    @Override
    public void taxCertificate() {
        System.out.println("在海淀税务局办理税务登记证！");
    }

}

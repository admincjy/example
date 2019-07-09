package com.maybe.springbootweb.springbootweb.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Title: AsyncService
 * @Description:
 * @Auther:maybe
 * @create 2019/6/27 15:35
 */
@Service
public class AsyncService {
    //批量新增操作
    @Async
    public void batchAdd() {
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("批量保存数据中....");
    }
}

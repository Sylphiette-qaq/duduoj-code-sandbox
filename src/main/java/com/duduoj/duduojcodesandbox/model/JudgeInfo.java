package com.duduoj.duduojcodesandbox.model;

import lombok.Data;

/**
 * 判题信息
 *
 * @author yupi
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */

    private String message;

    /**
     * 消耗内存(KB)
     */

    private long memory;

    /**
     * 消耗时间(MS)
     */

    private long time;
}


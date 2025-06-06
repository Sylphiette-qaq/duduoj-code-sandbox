package com.duduoj.duduojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 */
@Data
public class ExecuteMessage {

    private int exitValue;

    private String message;

    private String errorMessage;

    private Long time;
}

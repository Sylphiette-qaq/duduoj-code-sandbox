package com.duduoj.duduojcodesandbox;


import com.duduoj.duduojcodesandbox.model.ExecuteCodeRequest;
import com.duduoj.duduojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

package com.duduoj.duduojcodesandbox.model;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExecuteCodeRequest {

    private List<String> inputList;

    private String code;

    private String language;
}

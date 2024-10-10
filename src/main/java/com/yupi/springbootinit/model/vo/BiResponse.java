package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * BI 返回结果
 * @author Lenovo
 */
@Data
public class BiResponse {
    /**
     * AI 生成的图表
     */
    private String genChart;

    /**
     * AI 生成的分析结果
     */
    private String genResult;

    /**
     * 创建人ID
     */
    private Long chartId;
}

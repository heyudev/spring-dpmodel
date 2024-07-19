package com.heyudev.dpmodel.strategy.example2;

public enum Type {
    A(1, "策略A"),
    B(2, "策略B");
    private Integer value;
    private String desc;

    Type(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}

package com.aplicationfx.demo.model;

public class Calculator {
    private Double num;

    private Double percent;
    private Double res;

    private Double rs1;

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double calc() {
        res = (num / 100) * percent ;
        rs1 = num - res;
        return rs1;
    }
}

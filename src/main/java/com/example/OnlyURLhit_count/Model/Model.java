package com.example.OnlyURLhit_count.Model;

public class Model {
    private int count;

    public Model(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Model{" +
                "count=" + count +
                '}';
    }
}

package com.example.nestedrecyclerview;

import java.util.List;

public class DataModel {
    private List<String> list;
    private String text;
    private boolean isExandable;

    public DataModel(List<String> list, String text) {
        this.list = list;
        this.text = text;
        isExandable = false;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isExandable() {
        return isExandable;
    }

    public void setExandable(boolean exandable) {
        isExandable = exandable;
    }
}

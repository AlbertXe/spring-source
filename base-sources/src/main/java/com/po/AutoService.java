package com.po;

import com.annotation.MyService;

/**
 * 86150
 * AutoService
 * 2020/7/30 0:05
 */
@MyService
public class AutoService {
    private String name = "jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

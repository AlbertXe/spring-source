package com.po;

import com.annotation.MyService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 86150
 * AutoService
 * 2020/7/30 0:05
 */
@MyService
@Service
@Scope(scopeName = "customer")
public class AutoService {
    private String name = "jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.po;

import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {
    @Override
    public void aop() {
        System.out.println("test aop");
    }
}

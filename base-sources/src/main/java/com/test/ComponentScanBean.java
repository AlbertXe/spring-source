package com.test;

import com.po.OriginClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Import(OriginClass.class)
@Service
@ComponentScan(basePackages = "com")
public class ComponentScanBean {
}

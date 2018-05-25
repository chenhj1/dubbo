package com.chj.service;

import com.chj.SayHello;

/**
 * Created by chenhaojie on 2018/05/25.
 */
public class SayHelloImpl implements SayHello {
    public String sayHello(String name) {
        return "Hello "+name;
    }
}

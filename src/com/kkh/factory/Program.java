package com.kkh.factory;

import java.util.ArrayList;
import java.util.Collection;

public class Program {
    public static void main(String[] args) {
    	//Factory pattern입니다.
    	
        iPhoneFactory factory = new iPhoneFactory();
        
        factory.registeriPhone(() -> new iPhone("iPhone 13", "Blue", 128));
        factory.registeriPhone(() -> new iPhone("iPhone 13 Pro", "Gold", 256));
        factory.registeriPhone(() -> new iPhone("iPhone 13 Pro Max", "Graphite", 512));
        factory.registeriPhone(() -> new iPhone("iPhone SE", "White", 64));
        // 람다식은 iPhoneCreator 오퍼레이터의 바디를 구현
        
        String[] iPhoneModels = {"iPhone SE", "iPhone 13", "iPhone 13 Pro", "iPhone 13 Pro Max"};
        
        Collection<iPhone> iPhones = new ArrayList<>();
        // List나 ArrayList도 가능하겠지만 최상위 인터페이스인 Collection을 사용헤 보았습니다.
        
        for (String model : iPhoneModels) {
            iPhone iPhone = factory.createiPhone(model);
            iPhones.add(iPhone);
        }

        for (iPhone iPhone : iPhones) {
            System.out.println(iPhone);
        }
    }
} 
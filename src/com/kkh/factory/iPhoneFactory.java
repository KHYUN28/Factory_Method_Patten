package com.kkh.factory;

import java.util.ArrayList;
import java.util.Collection;

class iPhoneFactory {
	
    private Collection<iPhoneCreator<iPhone>> iPhones = new ArrayList<>();

    public void registeriPhone(iPhoneCreator<iPhone> creator) {
        iPhones.add(creator);
    }

    public iPhone createiPhone(String model) {
        for (iPhoneCreator<iPhone> creator : iPhones) {
            iPhone iPhone = creator.create();
            
            if (iPhone.getModel().equals(model)) {
                return iPhone;
            }
        }
        throw new IllegalArgumentException("iPhone model '" + model + "' not found");
        // iPhoneModels의 값이 add한 리스트 안에 없으면 예외를 던짐.
    }
}
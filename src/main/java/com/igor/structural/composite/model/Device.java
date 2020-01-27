package com.igor.structural.composite.model;

import com.igor.structural.composite.model.Detail;

import java.util.ArrayList;
import java.util.List;

public class Device implements Detail {
    private List<Detail> details;

    public Device(){
        details = new ArrayList<>();
    }

    public void addDetail(Detail detail){
        details.add(detail);
    }

    public void removeDetail(Detail detail){
        details.remove(detail);
    }

    @Override
    public boolean isOn() {
        for (Detail detail : details) {
            if(!detail.isOn())
                return false;
        }
        return true;
    }
}

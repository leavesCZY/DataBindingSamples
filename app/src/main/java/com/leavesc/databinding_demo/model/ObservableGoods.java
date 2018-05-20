package com.leavesc.databinding_demo.model;

import android.databinding.ObservableField;
import android.databinding.ObservableFloat;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 22:04
 * 描述：
 */
public class ObservableGoods {

    private ObservableField<String> name;

    private ObservableField<String> details;

    private ObservableFloat price;

    public ObservableGoods(String name, String details, float price) {
        this.name = new ObservableField<>(name);
        this.details = new ObservableField<>(details);
        this.price = new ObservableFloat(price);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getDetails() {
        return details;
    }

    public void setDetails(ObservableField<String> details) {
        this.details = details;
    }

    public ObservableFloat getPrice() {
        return price;
    }

    public void setPrice(ObservableFloat price) {
        this.price = price;
    }

}
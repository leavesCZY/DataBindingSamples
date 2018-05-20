package com.leavesc.databinding_demo.model;

import android.databinding.ObservableField;

/**
 * 作者：叶应是叶
 * 时间：2018/5/20 13:40
 * 描述：
 */
public class Image {

    private ObservableField<String> url;

    public Image(String url) {
        this.url = new ObservableField<>(url);
    }

    public ObservableField<String> getUrl() {
        return url;
    }

    public void setUrl(ObservableField<String> url) {
        this.url = url;
    }
}

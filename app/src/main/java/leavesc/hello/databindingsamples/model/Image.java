package leavesc.hello.databindingsamples.model;

import android.databinding.ObservableField;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
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
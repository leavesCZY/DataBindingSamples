package github.leavesc.databindingsamples.model;

import androidx.databinding.ObservableField;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:00
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
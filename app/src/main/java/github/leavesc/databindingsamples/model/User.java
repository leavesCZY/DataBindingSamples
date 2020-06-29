package github.leavesc.databindingsamples.model;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:01
 * 描述：
 */
public class User {

    private String name;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

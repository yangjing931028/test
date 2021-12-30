package pojo;

public class UserTable {
    int user_id;
    String user_name;
    String user_pwd;
    int user_age;

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_age=" + user_age +
                '}';
    }
}

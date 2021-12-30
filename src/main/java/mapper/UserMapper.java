package mapper;

import pojo.UserTable;

import java.util.List;

public interface UserMapper {
    public void insert(UserTable userTable);
    public void delete(int id);
    public void update(UserTable userTable);
    public UserTable findbyid(int id);
    public List<UserTable> findbyname(String name);
}

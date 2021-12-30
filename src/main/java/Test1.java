import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.UserTable;

import javax.crypto.MacSpi;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws  IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatistest.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=factory.openSession(true);
//        UserTable user= session.selectOne("test.findbyid",43);

//        List<UserTable> list = session.selectList("test.findbyname", "丽");

        UserTable user1=new UserTable();
        user1.setUser_name("杨婧");
        user1.setUser_pwd("123456");
        user1.setUser_age(22);
//        session.insert("test.insert1",user1);
//        System.out.println(user1);

//        session.delete("test.delete",62);
//
//        UserTable user2=new UserTable();
//        user2.setUser_id(64);
//        user2.setUser_name("杨婧");
//
//        session.update("test.update",user2);

        UserMapper mapper=session.getMapper(UserMapper.class);
        System.out.println(mapper.findbyid(64));
//        mapper.insert(user1);
        System.out.println(mapper.findbyname("婧"));
    }
}

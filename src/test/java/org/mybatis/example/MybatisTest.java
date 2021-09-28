package org.mybatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class MybatisTest {

  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    Reader reader = Resources.getResourceAsReader(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, "online");

    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
//      HashMap<String, Object> userMap = (HashMap<String, Object>) session.selectOne(
//        "org.mybatis.example.UserMapper.getByAccount", "admin");
//      System.out.println(userMap);
//
//      System.out.println("-----------------------");

      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      HashMap<String, Object> map = new HashMap<>();
      map.put("sex", 2);
//      map.put("deletedFlag", "0");
      List<HashMap<String, Object>> user1 = userMapper.getByMapList(map);
//      HashMap<String, Object> user1 = userMapper.getByMap(map);
//      User user1 = userMapper.getById("1");
//      User user1 = userMapper.getDefautUser();
      Stream.of(user1).forEach(System.out::println);

      sqlSession.commit();
//      User user = (User) session.selectOne("org.mybatis.example.UserMapper.getById", "1");
//      Stream.of(user).forEach(System.out::println);
//
//      Stream stream = Stream.of(user.getName(), user.getPhone(), user.getAccount());
//      System.out.println(stream.collect(Collectors.joining(","))) ;
    } finally {
      sqlSession.close();
    }

  }
}

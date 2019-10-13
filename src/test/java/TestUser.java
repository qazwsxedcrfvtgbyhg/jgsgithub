import cn.kgc.bean.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TestUser {

    SqlSession sqlSession=null;
    @Before
    public void before(){
        InputStream inputStream = TestUser.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
    }


    @Test
    public void test(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getAll());
    }
    @Test
    public void test1(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.wjx().size());
    }

    @After
    public void after(){
        sqlSession.close();
    }



}

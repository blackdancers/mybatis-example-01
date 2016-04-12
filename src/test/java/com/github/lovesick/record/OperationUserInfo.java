package com.github.lovesick.record;

import com.github.lovesick.domain.Userinfo;
import com.github.lovesick.util.SqlSessionFactoryGen;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * CRUD
 * Created by dujiang on 2016/4/12.
 */
public class OperationUserInfo {
    private SqlSessionFactory factory ;
    @Before
    public void setUp(){
        factory = SqlSessionFactoryGen.getFactory();
    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = factory.openSession(true);
        Userinfo userinfo = new Userinfo(null,"王小二","255");
        sqlSession.insert("insert",userinfo);
        sqlSession.close();
    }
}






















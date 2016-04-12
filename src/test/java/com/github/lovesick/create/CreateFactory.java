package com.github.lovesick.create;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * 创建SqlSessionFactory对象
 * Created by dujiang on 2016/4/12.
 */
public class CreateFactory {
    //1.配置文件mybatis-config.xml
    @Test
    public void testCreateInstance() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        System.out.println(sqlSessionFactory);
    }
}
























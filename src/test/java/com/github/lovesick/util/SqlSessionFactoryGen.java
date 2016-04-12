package com.github.lovesick.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 实例工厂
 * Created by dujiang on 2016/4/12.
 */
public class SqlSessionFactoryGen {
    private static SqlSessionFactory factory ;
    private static Reader reader;
    static {
        String resource = "mybatis-config.xml";
        try {
            reader = Resources.getResourceAsReader(resource);
            factory =new  SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getFactory(){
        return factory;
    }
}

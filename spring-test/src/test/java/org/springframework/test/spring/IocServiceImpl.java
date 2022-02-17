package org.springframework.test.spring;

/**
 * Class Name is com.lijun.example.spring.IocServiceImpl
 *
 * @author LiJun
 * Created on 2022/2/9 11:50
 */
public class IocServiceImpl implements IocService {

    @Override
    public String hello() {
        return "hello";
    }

}

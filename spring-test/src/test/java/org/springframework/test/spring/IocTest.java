package org.springframework.test.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class Name is IocTest
 *
 * @author LiJun
 * Created on 2022/2/9 11:52
 */
public class IocTest {

	private static final String PATH = "/org/springframework/test/spring/";

	@Test
	public void testIoc() {
		ApplicationContext context = new ClassPathXmlApplicationContext(PATH + "application-ioc.xml");
		IocService iocService = context.getBean(IocService.class);
		System.out.println(iocService.hello());
	}
}

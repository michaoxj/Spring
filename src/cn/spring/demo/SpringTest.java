package cn.spring.demo;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yd.oa.model.Product;

// 编写一个可以返回任何对象的工厂
public class SpringTest {

	public static void main(String[] args) {
//		Object obj = SpringTest.getObject("cn.spring.demo.SpringTest");
//		System.out.println(obj);
		// 1: 加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		System.out.println("----配置文件的已经被加载----");
		// 2: 通过spring来创建bean(类),因为spring可以解决：类型、数量、时间的问题
		System.out.println(context.getBean("p"));
		System.out.println(context.getBean("p"));
	}
	
	
	public static Object getObject(String className) {
		// 根据className名称去加载Class文件
		try {
			Class clazz=Class.forName(className);
			// 返回一个当前类的对象
			return clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

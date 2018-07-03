package cn.spring.demo;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yd.oa.model.Product;

// ��дһ�����Է����κζ���Ĺ���
public class SpringTest {

	public static void main(String[] args) {
//		Object obj = SpringTest.getObject("cn.spring.demo.SpringTest");
//		System.out.println(obj);
		// 1: ����spring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		System.out.println("----�����ļ����Ѿ�������----");
		// 2: ͨ��spring������bean(��),��Ϊspring���Խ�������͡�������ʱ�������
		System.out.println(context.getBean("p"));
		System.out.println(context.getBean("p"));
	}
	
	
	public static Object getObject(String className) {
		// ����className����ȥ����Class�ļ�
		try {
			Class clazz=Class.forName(className);
			// ����һ����ǰ��Ķ���
			return clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

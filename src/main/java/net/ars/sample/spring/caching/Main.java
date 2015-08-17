package net.ars.sample.spring.caching;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext APP_CONTEXT = null;
	private static final String[] CONTEXT_CONFIG_PATHS = {"classpath:/spring/applicationContext_caching.xml"};
	
	private static void initSpringContext() throws Exception {
        APP_CONTEXT = new ClassPathXmlApplicationContext(CONTEXT_CONFIG_PATHS);
    }	

	public static void main(final String[] args) throws Exception {
		initSpringContext();

		IfDao1 d1 = APP_CONTEXT.getBean(IfDao1.class);
		IfDao2 d2 = APP_CONTEXT.getBean(IfDao2.class);
		
		Entity1 o1 = new Entity1();
		o1.setId1(42L);
		Entity2 o2 = new Entity2();
		o2.setId2(84L);
		
		d1.save(o1);
		d2.save(o2);

	}
}

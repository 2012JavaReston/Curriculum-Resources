package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImplButBetter;
import com.revature.service.PlanetService;
import com.revature.service.PlanetServiceImpl;

public class MainDriver {
	
	/*
	 * 
	 * What is Spring? 
	 * 	Spring is a module based, open source, JavaAOP framework. 
	 * 		It provides support for enterprise level applications. 
	 * 		It provides infrastructure so that we can focus on business logic. 
	 * 
	 * What is a module?
	 * 	A grouping of librarires that work together to achieve some goals using reusable abstracted code. 
	 * 	In Springe, modules look like a Maven dependency. 
	 * 
	 * What are modules in Spring?
	 * 	Core, Context, ORM, AOP, WebMVC, Beans, Security, Test, etc. 
	 * 
	 * 
	 * How does Spring achieve it's goals - i.e. what feature does Spring have? 
	 * 	IoC Container 
	 * 	AOP
	 * 	Model View Controller Deisng Pattern (MVC)
	 * 	A LOT of abstracted APIs.
	 * 
	 * What is the ApplicationContext?
	 * 		ApplicaitonContext is a type of BeanFactory (Beanfactory is Spring's IoC container)
	 * 		Beanfactory contains information regarding the beans you have defined in your project. 
	 * 		A bean is an object that is instantiated and managed by a Spring container -
	 * 			We are no longer responsible for creating and managing our objects.
	 * 
	 * Why do we not create a normal Beanfactory?
	 * 		We use ApplicationContext in almost every scenario, if performance REALLY REALLY matters, then 
	 * 		we can use BeanFactory. Otherwise ApplicationContext has a lot of quality of life feature that help us, 
	 * 		an example being AOP. (AppContext provides postBeanprocessing)
	 * 		https://docs.spring.io/spring-framework/docs/2.5.x/reference/beans.html#context-introduction-ctx-vs-beanfactory
	 * 
	 * Exceptions that you get in Spring.
	 * 		BeanCreationException
	 * 		NoSuchBeanDefinitionException
	 * 		UnsatisfiedDependencyException
	 * 		XmlBeanDefinitionStoreException
	 * 		NoUniqueBeanDefinitionException
	 * 
	 * 
	 */
	
	//Let's go ahead and create Spring's IOC container. 
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-manual.xml");
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
	
	/*
	 * Our main method has a dependency, 
	 * the dependcy is the service class. 
	 * 
	 * main -> service -> dao
	 */
	
	//The new keyword is an example of tight coupling.
	//This is the old way. 
//	private static PlanetService pService = new PlanetServiceImpl(new PlanetDaoImpl()); //this states that our MainDriver needs a dependency of type PlanetService
	
	
	private static PlanetService pService;

	public static void main(String[] args) {
		
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
//		pService = appContext.getBean("PlanetServiceButBetter", PlanetService.class);
		
		
//		pService = appContext.getBean("PlanetServiceSetter", PlanetService.class);
		
		//AUTOWIRE INSTANTION PART
//		pService = appContext.getBean("PlanetServiceAutoConstruct", PlanetService.class);
		
		//ANNOTATION PART
		pService = appContext.getBean("PlanetServiceFullAnno", PlanetService.class);
		
		System.out.println(pService.getTheSolarSystem());
		System.out.println(pService.GodPrivelleges());
		
		
	}
	

}

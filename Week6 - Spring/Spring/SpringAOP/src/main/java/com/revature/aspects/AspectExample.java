package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/*
 * What is an aspect?
 * 		An aspect is a modularization of cross cutting concerns. 
 * 		Inside Java, it takes the form of a class. You can ALSO think of an aspect as a collection of advice
 */

@Component("myAspect")
@Aspect
public class AspectExample {
	
	static int numberOfMethods = 0;
	
	/*
	 * What is an advice?
	 * 		An advice is an action taken by an aspect. In Spring AOP, an advice is triggered by a method invocation. 
	 * 		In Java, an advice takes the form of a method itself.
	 * 
	 * Types of advice: 
	 * 		@Before
	 * 		@After
	 * 		@AfterReturning
	 * 		@AfterThrowing
	 * 		@Around
	 * 
	 * JoinPoints:
	 * 		JP are the possible points in the runtime of the program WHERE an advice can be invoked. 
	 * 		JP take the form of an object injected into an advice by Spring AOP. This object contains information baout 
	 * 		the current states of the runtime. (Remember, in SPring AOP, advices are themsevles triggered by method invocation). 
	 * 
	 * PointCut:
	 * 		Are expressions taht are used to select SPECIFIC joinpoints. In otherwords, pointcuts targets are a subset of
	 * 		all joinpoints. 
	 * 		Pointcuts take the form of a expression ( a string that uses regex). 
	 * 		
	 */

	
//	@Before("execution(* *())") //This  is targetting all methods (regardless of method name or return type) that have no parameters
//	@Before("execution(* *(*))") //This  is targetting all methods (regardless of method name or return type) that have 1 parameter
//	@Before("execution(* *(..))") //This will target every method invocation
//	@Before("execution(int *(..))")//This will target any method that returns an int
//	@Before("execution(int *(*,*))") //This will target any method, that returns int and has 2 argumetns inside of it. 
//	@Before("execution(int *(int,int))")
//	@Before("execution(* *play*(..))") // This will target any method, with any parameters, that has "play" inside of the name
//	@Before("execution(* playGuitar(..))")
//	public void setUp(JoinPoint jp) {
//		System.out.println("PUTTING ON PADS BEFORE!");
//		System.out.println((String) jp.getArgs()[0]);
//	}
//	
//	
//	@After("execution(* *(..))")
//	public void countTheInocations() {
//		numberOfMethods++;
//		System.out.println("THIS IS THE AFTER METHOD " + numberOfMethods);
//	}
	
	/*
	 * Around example
	 * 
	 * 		Around is the most powerful advice. It can control variables inside the method AND choose how to act 
	 * 		based on that information. 
	 * 		It can also halt methods form ever executing their logic. 
	 */
	
	
	@Around("execution(* *(..))")
	public void allAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(".........................");
		System.out.println("Before enverything");
		
		pjp.proceed(); //The target method doesn't execute its logic until the .proceed() is called
		
		
		System.out.println("After everything!");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
	
	/*
	 * ASPECT?
	 * 
	 * ADVICE?
	 * 
	 * POINTCUT EXPRESSION?
	 * 
	 * JOINPOINT?
	 * 
	 * CROSS CUTTING CONCERN? 
	 * 
	 */
}

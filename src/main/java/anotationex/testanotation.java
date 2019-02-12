package anotationex;

import java.lang.reflect.Method;

public class testanotation 
{
	@singlevalue(value = 10)
	public void sayHello()
	{
		System.out.println("hello annotation");
	}  
	public static void main(String args[])throws Exception
	{  
		  
		testanotation h=new testanotation();  
		Method m=h.getClass().getMethod("sayHello");  
		  
		singlevalue manno=m.getAnnotation(singlevalue.class);  
		System.out.println("value is: "+manno.value());  
	}
}

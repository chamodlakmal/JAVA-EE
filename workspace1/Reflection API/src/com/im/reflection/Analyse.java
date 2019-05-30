package com.im.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Analyse {
	public static void anlize(Object obj )
	{
		Class c=obj.getClass();
		String name=c.getName();
		
		System.out.println(name);
		String simpleName=c.getSimpleName();
		System.out.println(simpleName);
		Class superName=c.getSuperclass();
		
		String supername=superName.getName();
		System.out.println("Super name = " +supername);
		Field[] fields=c.getDeclaredFields();
		
		for(Field var:fields)
		{
			String varName=var.getName();
			System.out.println(varName);
			Class type=var.getType();
			System.out.println(type.getName());
		}
		Method[] method=c.getDeclaredMethods();
		for(Method met:method)
		{
			String methodName=met.getName();
			System.out.println(methodName);
			Class reString=met.getReturnType();
			System.out.println(reString.getName());
			int modifiers=met.getModifiers();
			//System.out.println(modifiers);
			
			boolean ispublic=Modifier.isPublic(modifiers);
			if(ispublic)
			{
				System.out.println("Method is public");
			}else
			{
				System.out.println("Method is not public");
			}
			
		}
		
		
	}

}

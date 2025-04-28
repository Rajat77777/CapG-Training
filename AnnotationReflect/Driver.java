package AnnotationReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter role");
		String role = sc.next();
		System.out.println("Enter the method that you want to call");
		String method_name=sc.next();
		Task task = new Task();
		
		}
	
	public static void userValidityCheck(String role_by_user, String method_name,Task t) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Class<Task> c = Task.class;
		Method m = c.getMethod(method_name);
		if(m.isAnnotationPresent(Role.class)) {
			Role role = m.getAnnotation(Role.class);
			if(role.value().equals(role_by_user)) {
				m.invoke(t);
			}else {
				System.out.println("Role nor valid...Don't have access");
			}
		}
		
		
	
	}
	}


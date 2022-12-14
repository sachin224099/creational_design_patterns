package creational.design.singleton_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		LazySingletonWithDoubleChecking ins1 = LazySingletonWithDoubleChecking.getInstance();
		LazySingletonWithDoubleChecking ins2 = null;

		Constructor constructor = LazySingletonWithDoubleChecking.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		ins2 = (LazySingletonWithDoubleChecking) constructor.newInstance();

		System.out.println("Hashcode of Object 1 - " + ins1.hashCode());
		System.out.println("Hashcode of Object 2 - " + ins2.hashCode());
	}

}

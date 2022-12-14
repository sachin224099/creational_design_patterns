package creational.design.singleton_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
}

final class LazySingletonWithoutDoubleChecking {
    private static volatile LazySingletonWithoutDoubleChecking instance = null;

    // private constructor
    private LazySingletonWithoutDoubleChecking() {
    }

	/*
	 * But, this method also has its own drawbacks. Let�s see how. Suppose there are
	 * two threads T1 and T2. Both come to create the instance and check if
	 * �instance==null�. Now both threads have identified instance variable as null
	 * thus they both assume they must create an instance. They sequentially go into
	 * a synchronized block and create the instances. In the end, we have two
	 * instances in our application.
	 * 
	 * This error can be solved using double-checked locking. This principle tells
	 * us to recheck the instance variable again in a synchronized block as given
	 * below:
	 */
    public static LazySingletonWithoutDoubleChecking getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithoutDoubleChecking.class) {
                instance = new LazySingletonWithoutDoubleChecking();
            }
        }
        return instance;
    }
}



class LazySingletonWithDoubleChecking {
    private static volatile LazySingletonWithDoubleChecking instance = null;
 
    // private constructor
    private LazySingletonWithDoubleChecking() {
    	if(instance != null)
    		throw new RuntimeException("Can not create instance");
    }
 
    public static LazySingletonWithDoubleChecking getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithDoubleChecking.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingletonWithDoubleChecking();
                }
            }
        }
        return instance;
    }
}



//Singleton with bill pugh solution

/*
 * As you can see, until we need an instance, the LazyHolder class will not be
 * initialized until required and you can still use other static members of
 * BillPughSingleton class.
 */
class BillPughSingleton {
    private BillPughSingleton() {
    }
 
    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
 
    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
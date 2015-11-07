import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A{
	private int a =10;
	private int getX(Object obj, int y) {
		return a;
	}
}

public class Examples {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*Class a = Class.forName("A");
        System.out.println(a.getName() + " " +
		                   a.isPrimitive() + " ");
        for(Field f: a.getDeclaredFields()) {
        	System.out.print(f);
        }*/
        Class clazz = A.class;
        Object a =  clazz.newInstance();
        Object o = Object.class.newInstance();
        Method method = clazz.getDeclaredMethod("getX", Object.class, int.class);
        method.setAccessible(true);
        System.out.println(method.invoke(a, o, 1));
	}

}

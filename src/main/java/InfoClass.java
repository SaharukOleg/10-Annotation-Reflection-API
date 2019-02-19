import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class InfoClass {


    public static void showInfo(Object object) {
        Class aClass = object.getClass();


        System.out.println("Class name - " + aClass.getSimpleName());
        System.out.println("Modifier - " + Modifier.toString(aClass.getModifiers()));
        System.out.println("Super class - " + aClass.getSuperclass().getSimpleName());
        System.out.println("Is annotation - " + aClass.isAnnotation());
        System.out.println("Is anonymous class - " + aClass.isAnonymousClass());
        System.out.println("Is enum - " + aClass.isEnum());
        System.out.println("Is interface - " + aClass.isInterface());


        System.out.println("Declared methods : ");
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.print(method.getName() + " | ");
        }
        System.out.println();

        System.out.println("Declared fields : ");
        for (Field field : aClass.getDeclaredFields()) {
            System.out.print(field.getName() + " | ");
        }
    }
}

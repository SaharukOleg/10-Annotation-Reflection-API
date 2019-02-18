
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {

    public static void main(String[] args) {
        AnyClass anyClass = new AnyClass();
        Class reflection = anyClass.getClass();

        for (Field field : reflection.getFields()) {
            if (field.isAnnotationPresent(MyAnnotation.class)) { // прохожуся по полях класу де я моя анотація
                System.out.println(field.getName());
                //task3 Print annotation value into console (e.g. @Annotation(name = "111"))
                System.out.println(field.getAnnotation(MyAnnotation.class).toString());
            }
        }

        // task4 Invoke method (three method with different parameters and return types)
        Method method;
        try {
            method = reflection.getDeclaredMethod("method3"); //я дістаю метод під назвою method3 з мого обєкту anyClass
            method.setAccessible(true); // мій метод method3 приватний і цей метод setAccessible його відкриває щоб витягнути значення
            System.out.println(method.invoke(anyClass));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            method = reflection.getDeclaredMethod("setAccessible"); // тут метод setAccessible непотрібно робити так як метод setAccessible публічний
            method.invoke(anyClass);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            method = reflection.getDeclaredMethod("method1", int.class);
            method.setAccessible(true);

            System.out.println("method" + method.invoke(anyClass, 1));

        } catch (Exception e) {
            e.printStackTrace();
        }


        //5 task = Set value into field not knowing its type.
        try {
            Field field = reflection.getDeclaredField("field");
            field.setAccessible(true);
            if (field.getType().equals(String.class))
                field.set(anyClass, "task5");
            System.out.println(anyClass.getField());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}


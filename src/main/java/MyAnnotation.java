import java.lang.annotation.*;

@Documented

@Target({ElementType.FIELD, ElementType.METHOD})
// обмеження для аннотації  //тільки для атрибутів (змінних) класу, тільки для методів;

@Inherited

@Retention(RetentionPolicy.RUNTIME)
        //@Retention – эта аннотация позволит позволит сохранять нашу аннотацию JVM во время выполнения,
        // что даст возможность использовать отображение(reflection).
@interface MyAnnotation {
    int age() default 24;

    String name() default "Oleg";

    boolean run() default true;
}

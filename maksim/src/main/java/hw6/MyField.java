package hw6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by User on 14/12/2016.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface MyField {
    String firstname()default "";
    String lastname() default ""  ;
    int age() default 0;
    int salary () default 0;
}

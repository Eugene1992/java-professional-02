package annotation_tka4;

import java.lang.annotation.*;

/**
 * Created by User on 15/12/2016.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Init {

    boolean suppressException() default false;
}

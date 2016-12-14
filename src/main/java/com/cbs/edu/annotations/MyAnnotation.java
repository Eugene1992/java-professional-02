
package com.cbs.edu.annotations;

import javafx.scene.shape.CullFace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {

    String value(); // required

    int num() default 777; // non required

//    Override over();

//    Class<?> clazz();

//    CullFace face();

//    double[] nums();
}

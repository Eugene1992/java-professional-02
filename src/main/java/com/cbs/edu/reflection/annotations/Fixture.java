package com.cbs.edu.reflection.annotations;


import java.lang.annotation.*;
import java.time.Month;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fixture {

    // в качестве атрибута может выступать примитив
    public int intArg();

    //  отсутствие модификатора области видимости автоматически означает public
    boolean longArg();

    // в качестве атрибута может выступать строка
    String stringArg() default "Hello world";

    // в качестве атрибута может выступать также другая аннотация
    Override over();

    // в качестве атрибута может выступать Enum
    Month enumArg() default Month.DECEMBER;

    // в качестве атрибута может выступать Class
    Class<?> classArg();

    // в качестве атрибута может выступать массив любого вышеперечисленного типа
    // если не указано default значение - атрибут становиться обязательным
    String[] arrayArg();

//    Object objectArg(); // ошибка компиляции
}

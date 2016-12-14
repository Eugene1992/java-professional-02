package hw6;

/**
 * Created by User on 14/12/2016.
 */
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Ivanov",1,10000);
        Employee max = new Employee("Max", "Maximov",2,20000);

        Class<? extends Employee> aClass = ivan.getClass();


        if (aClass.isAnnotationPresent(MyJson.class)) {
            MyJson annotation = aClass.getAnnotation(MyJson.class);

            System.out.println(annotation.title());

        }

       Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(MyField.class)) {
               MyField annotation = declaredField.getAnnotation(MyField.class);
                System.out.print(declaredField.getName() + " : ");
                System.out.println(annotation.firstname());
                System.out.println(annotation.lastname());
                System.out.println(annotation.age());

            }
        }
    }


}

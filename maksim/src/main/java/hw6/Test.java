package hw6;

/**
 * Created by User on 14/12/2016.
 */
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Employee ivan = new Employee("Ivan", "Ivanov",30,10000);
        Class<? extends Employee> aClass = ivan.getClass();
        if (!aClass.isAnnotationPresent(MyJson.class)) {
            throw new Exception();
        }
        System.out.println("{ ");

       Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
             declaredField.setAccessible(true);
            StringBuilder stringBuilder = new StringBuilder();
           if (declaredField.isAnnotationPresent(MyField.class)) {
                stringBuilder.append("\t").append(String.format("\"%s\" : \"%s\" ,", declaredField.getName(), declaredField.get(ivan))).append("\n");
            }
            System.out.print(stringBuilder);
        }
        System.out.println("}");
    }


}

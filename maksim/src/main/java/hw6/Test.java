package hw6;

/**
 * Created by User on 14/12/2016.
 */

import java.lang.reflect.Field;


public class Test {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Ivanov", 30, 10000);



            try {
                  System.out.println(myMetod(ivan));

            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    public static String myMetod(Object obj) throws Exception {

        Class<?> aClass = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder();
        if (!aClass.isAnnotationPresent(MyJson.class)) {
            throw new Exception();
        }
        stringBuilder.append("{ \n");

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(MyField.class)) {
                stringBuilder.append("\t").append(String.format("\"%s\" : ", declaredField.getName()));
                if (declaredField.getType().isPrimitive()) {
                    stringBuilder.append(String.format("%s,", declaredField.get(obj)));
                } else stringBuilder.append(String.format("\"%s\",", declaredField.get(obj)));
                stringBuilder.append("\n");

            }

        }

        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }



}

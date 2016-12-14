package com.cbs.edu.reflection.json_conv;

import java.lang.reflect.Field;

public final class JsonConverter {

    private JsonConverter() {}

    public static String convertToJson(Object obj) throws IllegalConvertTypeException, IllegalAccessException {

        Class<?> clazz = obj.getClass();
        checkEntityClass(clazz);

        StringBuilder builder = new StringBuilder().append("{\n");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            JsonField annotation = field.getAnnotation(JsonField.class);
            if (annotation != null) {
                field.setAccessible(true);
                String property = annotation.name().isEmpty() ? field.getName() : annotation.name();
                builder.append(String.format("\t\"%s\": ", property));
                Class<?> fieldType = field.getType();
                String value = fieldType.isPrimitive() ?
                        field.get(obj).toString() : String.format("\"%s\"", field.get(obj).toString());
                builder.append(value).append(",\n");
            }
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        return builder.append("}").toString();
    }

    private static void checkEntityClass(Class<?> clazz) throws IllegalConvertTypeException {
        if (!clazz.isAnnotationPresent(JsonEntity.class)) {
            throw new IllegalConvertTypeException(
                    "Illegal type for convert: " + clazz.getName());
        }
    }
}

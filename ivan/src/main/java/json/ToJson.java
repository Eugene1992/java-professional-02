package json;

import java.lang.reflect.Field;

public final class ToJson {

    public static String getJson(Object o) throws UnsupportedOperationException, IllegalAccessException {
        StringBuilder result = new StringBuilder();
        StringBuilder body   = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        if (!o.getClass().isAnnotationPresent(Json.class)) {
            throw new UnsupportedOperationException();
        }
        result.append(o.getClass().getCanonicalName()).append(" ");
        result.append("{\n");
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            JsonField annotation = field.getAnnotation(JsonField.class);
            if (annotation != null) {
                if (body.length() > 0) {
                    body.append(",\n");
                }
                field.setAccessible(true);
                String name = annotation.name().isEmpty() ? field.getName() : annotation.name();
                String data = field.get(o).toString();
                body.append("    ");
                body.append(name).append(" : ").append(data);
            }
        }
        result.append(body);
        result.append("\n}");
        return result.toString();
    }
}

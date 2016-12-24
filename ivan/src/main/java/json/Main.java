package json;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee(1, "2", "3", 4L);
        System.out.printf(ToJson.getJson(employee));
    }
}

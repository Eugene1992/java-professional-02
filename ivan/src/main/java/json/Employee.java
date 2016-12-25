package json;

@Json
public class Employee {

    @JsonField
    private int id;

    @JsonField(name = "name")
    private String firstName;

    @JsonField
    private String lastName;

    @JsonField(name = "old")
    private long age;

    public Employee(int id, String firstName, String lastName, long age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}

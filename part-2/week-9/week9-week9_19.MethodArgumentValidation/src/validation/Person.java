package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        assertName(name);
        assertAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void assertName(String name) {
        if (null == name || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException();
        }
    }

    private void assertAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException();
        }
    }
}

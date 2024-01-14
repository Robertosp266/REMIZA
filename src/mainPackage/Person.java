package mainPackage;

public abstract class Person implements Firefighterable {
    private final String name;
    private final String surname;
    private final String TheFunction;
    protected Person(String name, String surname, String theFunction) {
        this.name = name;
        this.surname = surname;
        this.TheFunction = theFunction;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", TheFunction='" + TheFunction + '\'' +
                '}';
    }
}

package Hw24;

public class CustomerWithId {
    private String name;
    private String surname;
    private final Integer id;
    private static Integer UniqueID = 100;

    CustomerWithId(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = UniqueID++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "CustomerWithId{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

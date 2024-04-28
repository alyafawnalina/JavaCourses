package Hw13;

public class Hw13Main {

    public static void main(String[] args) {
        Person person1 = new Person("Lily", 2000);
        Person person2 = new Person("Ann", 2002);
        Person person3 = new Person("Jennifer", 1995);
        Person person4 = new Person("Roseanna", 1990);
        Person person5 = new Person("Sara", 2004);
        Person person6 = new Person("Jieun", 2001);
        Person person7 = new Person("Yuju", 2002);
        Person person8 = new Person("Eunha", 2005);
        Person person9 = new Person("SinB", 2004);
        Person person10 = new Person("Nayeon", 2000);
        Person person11 = new Person("Soojin", 2001);

        PersonList persons = new PersonList();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.printArray();

        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
        persons.printArray();

        persons.add(person11);
        persons.printArray();
    }
}

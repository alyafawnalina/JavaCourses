package Hw17;

import java.util.ArrayList;

public class InMemoryContacts {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getAll(){
        return contacts;
    }

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(int index){
        contacts.remove(index);
    }
}

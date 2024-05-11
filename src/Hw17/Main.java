package Hw17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact("Nikita","+380950001122");
        Contact contact2 = new Contact("Ivan","+30684302211");
        InMemoryContacts contacts = new InMemoryContacts();
        contacts.add(contact1);
        contacts.add(contact2);

        MenuAction exitMenuAction = new ExitMenuAction();
        ShowContactsMenuAction showContactsMenuAction = new ShowContactsMenuAction(contacts);
        AddContactMenuAction addContactMenuAction = new AddContactMenuAction(contacts,scanner);
        RemoveContactMenuAction removeContactMenuAction = new RemoveContactMenuAction(scanner, contacts);
        EditContactMenuAction editContactMenuAction = new EditContactMenuAction(scanner, contacts);
        Menu menu = new Menu(scanner);
        menu.addAction(showContactsMenuAction);
        menu.addAction(addContactMenuAction);
        menu.addAction(exitMenuAction);
        menu.addAction(removeContactMenuAction);
        menu.addAction(editContactMenuAction);

        menu.run();

    }

}

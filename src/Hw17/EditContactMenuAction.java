package Hw17;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContactMenuAction implements MenuAction{

    private Scanner scanner;
    private InMemoryContacts contacts;

    public EditContactMenuAction(Scanner scanner, InMemoryContacts contacts) {
        this.scanner = scanner;
        this.contacts = contacts;
    }

    @Override
    public String getName() {
        return "Редагувати номер телефону контакту";
    }

    @Override
    public void execute() {
        System.out.println("Оберіть контакт для редагування");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Contact> contacts = this.contacts.getAll();
        int index = userChoice - 1;
        if(index < 0 || index >= contacts.size()){
            System.out.println("Ви обрали неправильний пункт меню");
        }

        System.out.println("Введіть новий номер телефону");
        String newPhoneNumber = scanner.nextLine();
        contacts.get(index).setPhoneNumber(newPhoneNumber);



    }

    @Override
    public boolean closeAfter() {return false;}
}

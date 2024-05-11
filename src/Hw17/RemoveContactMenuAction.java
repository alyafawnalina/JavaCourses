package Hw17;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction{

    private Scanner scanner;
    private InMemoryContacts contacts;

    public RemoveContactMenuAction(Scanner scanner, InMemoryContacts contacts){
        this.scanner = scanner;
        this.contacts = contacts;
    }

    @Override
    public String getName() {
        return "Видалити контакт";
    }

    @Override
    public void execute() {
        System.out.println("Оберіть контакт для видалення");
        int userChoice = scanner.nextInt();
        ArrayList<Contact> contacts = this.contacts.getAll();
        int index = userChoice - 1;
        if(index < 0 || index >= contacts.size()){
            System.out.println("Ви обрали неправильний пункт меню");
        }
        contacts.remove(userChoice - 1);
    }

    @Override
    public boolean closeAfter() {return false;}
}

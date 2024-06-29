package Hw20;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHw20 {

    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) throws InvalidYearException, DuplicateBookException, BookNotFoundException {

        // 1
        //correct
        addBook("Heaven Official's Blessing", "Mo Xiang Tong Xiu", 2018);
        // DuplicateBookException
        addBook("Heaven Official's Blessing", "Mo Xiang Tong Xiu", 2018);
        // correct
        addBook("Grandmaster of Demonic Cultivation", "Mo Xiang Tong Xiu", 2018);
        // correct
        addBook("Scum Villain's Self-Saving System", "Mo Xiang Tong Xiu", 2021);
        // InvalidYearException
        addBook("Scum Villain's Self-Saving System", "Mo Xiang Tong Xiu", 2067);
        // correct
        addBook("Husky and His White Cat Shizun", "Rou Bao Chi Rou", 2018);
        // InvalidYearException
        addBook("Husky and His White Cat Shizun", "Rou Bao Chi Rou", -457);
        System.out.println("========");

        for (Book book : books) {
            System.out.println(book.toString());}
        System.out.println("========");

        //2
        // correct
        removeBook("Rou Bao Chi Rou", "Husky and His White Cat Shizun");
        // BookNotFoundException
        removeBook("Someone", "Something");
        System.out.println("========");

        for (Book book : books) {
            System.out.println(book.toString());}
        System.out.println("========");

        //3
        // correct
        for (Book book : findBooksByAuthor("Mo Xiang Tong Xiu")) {
            System.out.println(book.toString());
        }
        // there is no books with this author
        System.out.println(findBooksByAuthor("Rou Bao Chi Rou"));
        System.out.println("========");

        //4
        // correct
        for (Book book : findBooksByYear(2018)){
            System.out.println(book.toString());
        }
        // there is no books with this year
        System.out.println(findBooksByYear(2000));
    }

    static void addBook(String title, String author, int year) throws DuplicateBookException, InvalidYearException {

        Book book = new Book(title, author, year);
        int thisYear = Year.now().getValue();

        if(books.contains(book)){
            throw new DuplicateBookException("Duplicate book can't be added");
        }

        if (thisYear < book.getYear() || book.getYear() < 0){
            throw new InvalidYearException("Book with invalid year cant be added");
        }

        books.add(book);
        System.out.println("Book added");

    }

    static void removeBook(String author, String title) throws BookNotFoundException{

        List<Book> booksCopy = books.stream()
                .filter(temp -> !(temp.getTitle().equals(title) && temp.getAuthor().equals(author)))
                .collect(Collectors.toList());

        if (books.size() == booksCopy.size()){

            throw new BookNotFoundException("Book not found");

        } else {
            books = (ArrayList<Book>) booksCopy;
            System.out.println("Book removed");
        }
    }

    static List<Book> findBooksByAuthor(String author){

        return books.stream()
                .filter(el -> el.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    static List<Book> findBooksByYear(int year){

        return books.stream()
                .filter(el -> el.getYear() == year)
                .collect(Collectors.toList());
    }

    public static class DuplicateBookException extends Exception{

        public DuplicateBookException(String errorMessage){
            super(errorMessage);
        }
    }

    public static class InvalidYearException extends Exception{
        public InvalidYearException(String errorMessage){
            super(errorMessage);
        }
    }

    public static class BookNotFoundException extends Exception{
        public BookNotFoundException(String errorMessage){
            super(errorMessage);
        }
    }
}

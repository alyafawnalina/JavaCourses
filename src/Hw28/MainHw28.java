package Hw28;

import java.io.*;
import java.util.Scanner;

public class MainHw28 {

    public static void main(String[] args) throws Exception{
        //1
        //Запитайте у користувача рядок тексту.     +
        //Запишіть цей рядок у файл на ім'я output.txt.     +
        //Прочитайте вміст файлу output.txt.    +
        //Виведіть вміст файлу на екран.    +

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input here one line of the text: ");
        String res = sc.nextLine();
        sc.close();

        FileWriter fw1 = new FileWriter("src/Hw28/output.txt");
        fw1.write(res);
        fw1.close();

        StringBuilder result1 = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Hw28/output.txt"))) {
            String line1;
            while((line1 = br.readLine()) != null) {
                result1.append(line1).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result1);

        //2
        //Створіть файл із ім'ям source.txt та заповніть його будь-яким текстом.    +
        //Прочитайте вміст файлу source.txt.    +
        //Запишіть вміст файлу source.txt у новий файл destination.txt.     +

        String text = "After a moment of consideration, Xie Lian came to a conclusion, “... Forgive me.” \n" + "He cupped Hua Cheng’s face and voluntarily covered the other’s lips with his own, gently guiding \n" +
                "the turbulent flow of heat into his own body, helping to ease the pain and suffering of the other. \n" + "Instinctively, Hua Cheng looped his arm around Xie Lian’s waist, making Xie Lian shiver just the slightest. \n" +
                "In the next second, the two were tumbling on top of the altar. \n" + "It really wasn’t fair. Xie Lian wouldn’t dare touch anywhere on Hua Cheng that’s even slightly dangerous. \n" +
                "Yet, because of his cloudy state of mind, Hua Cheng’s fingers were roaming across every inch of his body \n" + "shamelessly, making Xie Lian suffer in silent torment. This altar was originally a place where one would \n" +
                "make offerings to a god, but it now resided a ghost and a god who were entangled in a heated battle of tongues. \n" + "Although preposterous, the scene was beyond breathtaking. \n";

        new File("src/Hw28/source.txt");

        FileWriter fw = new FileWriter("src/Hw28/source.txt");
        fw.write(text);
        fw.close();

        StringBuilder result2 = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Hw28/source.txt"))) {
            String line2;
            while((line2 = br.readLine()) != null) {
                result2.append(line2).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fw2 = new FileWriter("src/Hw28/destination.txt");
        fw2.write(result2.toString());
        fw2.close();

        //3
        //Створіть будь який клас   +
        //Серіалізуйте його до файлу    +
        //Десеріалізуйте цей обект з файлу    +
        //Виведіть до консолі десеріалізований обєект за допомогою методу toString()    +

        IceCreamOneScoop iceCream = new IceCreamOneScoop("Strawberry", "Waffle");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/Hw28/file.txt"))){
            objectOutputStream.writeObject(iceCream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/Hw28/file.txt"))){
            IceCreamOneScoop iceCreamOS = (IceCreamOneScoop) inputStream.readObject();
            System.out.println(iceCreamOS.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

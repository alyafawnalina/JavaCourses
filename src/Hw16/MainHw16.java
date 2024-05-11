package Hw16;

public class MainHw16 {
/*
Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet() +

Зробіть класи, які його імплементують: Androids, iPhones. +

Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS +

Створіть екземпляри кожного виду у мейн-класі +

Інтерфейс також можно просто створити, і він може бути пустим без методів, для того щоб
просто можно було імлементувати його у класі, і потім звести до якогось одного типу
*/

    public static void main(String[] args) {

        Androids samsung = new Androids();
        IPhones iPhone = new IPhones();
        samsung.call();
        samsung.sms();
        samsung.internet();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }

}

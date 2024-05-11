package Hw16;

public class IPhones implements Smartphones, IOS{

    @Override
    public void call() {
        System.out.println("Phone is calling");
    }

    @Override
    public void sms() {
        System.out.println("Sms is sent");
    }

    @Override
    public void internet() {
        System.out.println("Internet connected");
    }

}

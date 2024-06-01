package Adapter;

public class Adapter {
    public static void main(String[] args) {

        // 1 способ наследование
        MassageSender massageSender = new MassageSenderAdapterFromMassageSenderImpl();
        massageSender.sendEmail();
        massageSender.sendSms();



        // 2 способ композиция

        MassageSender massageSender1 = new MassageSenderAdapterFromMassageSenderImpl2(new MassageSanderImpl());

        massageSender1.sendSms();
        massageSender1.sendEmail();
    }
}

package Adapter;

public class MassageSenderAdapterFromMassageSenderImpl2 implements MassageSender{

    MassageSanderImpl massageSander;

    public MassageSenderAdapterFromMassageSenderImpl2(MassageSanderImpl massageSander) {
        this.massageSander = massageSander;
    }

    @Override
    public void sendSms() {
        massageSander.massageSenderSms();

    }

    @Override
    public void sendEmail() {
        massageSander.massageSenderEmail();

    }
}

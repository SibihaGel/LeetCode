package Adapter;

public class MassageSenderAdapterFromMassageSenderImpl extends MassageSanderImpl implements MassageSender{
    @Override
    public void sendSms() {
        massageSenderSms();
    }

    @Override
    public void sendEmail() {
        massageSenderEmail();
    }
}

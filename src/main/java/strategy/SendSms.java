package strategy;

public class SendSms implements SendMessege{
    private static String name = "SMS";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void test() {
        System.out.println("SMS has been sended");
    }
}

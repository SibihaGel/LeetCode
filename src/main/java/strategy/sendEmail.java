package strategy;

public class sendEmail implements SendMessege{

    private static String name = "Email";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void test() {
        System.out.println("Email has been sended");
    }
}

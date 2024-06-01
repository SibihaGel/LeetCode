package FabricMethod;

public class Main {
    public static void main(String[] args) {
        Massage massage = new SendMassageFabrikaMethod().sendMassage("SMS");
        System.out.println(massage.getName());
    }
}

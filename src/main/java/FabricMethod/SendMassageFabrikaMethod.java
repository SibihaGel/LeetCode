package FabricMethod;

public class SendMassageFabrikaMethod {

    public Massage sendMassage(String massage){
        if(massage.contains("SMS")) {
            return new SendMassageSms();
        } else {
            return new SendMassageEmail();
        }
    }
}

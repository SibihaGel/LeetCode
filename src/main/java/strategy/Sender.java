package strategy;

import java.util.*;

public class Sender {
    public static void main(String[] args) {

        List<SendMessege> list = new ArrayList<>();
        list.add(new SendSms());
        list.add(new sendEmail());

        for (SendMessege l : list) {
            if(l.getName().equalsIgnoreCase("sms")) {
                l.test();
            }
        }
    }

    Map<Integer, Integer> map = new LinkedHashMap<>();


}

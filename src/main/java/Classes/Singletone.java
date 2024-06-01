package Classes;

import java.util.ArrayList;
import java.util.List;

public class Singletone {



    private static Singletone singletone;

    private Singletone() {
    }

    public static Singletone getSingletone() {



        if (singletone == null) {
            synchronized (Singletone.class) {
             return singletone = new Singletone();
            }
        }
        return singletone;
    }


}

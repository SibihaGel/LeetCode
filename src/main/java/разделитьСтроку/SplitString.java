package разделитьСтроку;

import java.util.Arrays;

public class SplitString {

        public static void main(String[] args) {
            String str = "bla123";
          /*  String[] strings = str.split("");

            for (String s : strings) {
              System.out.print(s);
               System.out.println();
*/

                Arrays.stream(str.split("")).forEach(System.out::print);
            }
        }





import java.util.ArrayList;
import java.util.List;

public class Geeky {

    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();
        letters.add("AA");
        letters.add("BB");
        letters.add("CC");
        letters.add("DD");

        letters.add("AA");
        letters.add("EE");
        letters.add("FF");

        letters.add("AA");
        letters.add("AA");

        /*int len = letters.size();
        for (int i = 0; i < len; i++) {
            if (letters.get(i).equals("AA")) {
                letters.remove(i);
            }
        }*/
        System.out.println(letters);

       /* for (int i = 0; i < letters.size(); i++) {
            System.out.println(i + "|" + letters.get(i) + "|" + letters.size());
            if (letters.get(i).equals("AA")) {
                String str = letters.remove(i--);
                //i--; //
                System.out.println("removed: " + str);
            }
        }*/
        System.out.println(letters);

        for (String str : letters) {
            if (str.equals("AA")){
                letters.remove(str);
            }
        }
        System.out.println(letters);

    }
}

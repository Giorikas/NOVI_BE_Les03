import java.util.HashMap;

public class Translator {

    HashMap<Integer, String> numNumWritten = new HashMap<Integer, String>();

    public Translator(Integer[] arrNum, String[] arrStr) {
        for (int i = 0; i < arrNum.length; i++) {
            numNumWritten.put(arrNum[i], arrStr[i]);
            System.out.println(numNumWritten.get(i));
        }
    }

    public String numDictionary(Integer num){
        String str = numNumWritten.get(num);
        System.out.println(str);
        return str;
    }
}

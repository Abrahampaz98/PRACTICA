import java.util.HashMap;
import java.util.Map;

public class practica49 {
    public static void main(String[] args) {
        System.out.println(convertToMorse("abraham"));
    }

    static String convertToMorse(String text) {
        String result = "";
        Map<String, String> alphabet = new HashMap<String, String>();
        String characters = "A|B|C|CH|D|E|F|G|H|I|J|K|L|M|N|Ñ|O|P|Q|R|S|T|U|V|W|X|Y|Z|0|1|2|3|4|5|6|7|8|9|.|,|?|\"|/";
        String morseChars = "·-|-···|-·-·|----|-··|·|··-·|--·|····|··|·---|-·-|·-··|--|-·|--·--|---|·--·|--·-|·-·|···|-|··-|···-|·--|-··-|-·--|--··|-----|·----|··---|···--|····-|·····|-····|--···|---··|----·|·-·-·-|--··--|··--··|·-··-·|-··-·";
        String charArray[] = characters.split("[|]");
        String morseArray[] = morseChars.split("[|]");
        for (int i = 0; i < morseArray.length; i++) {
            alphabet.put(charArray[i], morseArray[i]);
        }
        for (String letter : text.split("")) {
            if (letter.equalsIgnoreCase(" ")) {
                result += "  ";
            } else {
                result += alphabet.get(letter.toUpperCase()) + " ";
            }
        }
        return result;
    }
} 
package WPO2;


import java.util.Arrays;
public class TextManipulation {

    // Map dataSet = new HashMap();
    //dataSet = {"0":1,"1":2,"2":3,"3":4,"4":5,"5":6,"6":7,"7":8,"8":9,"9":10,"a":11,"b":12,"c":13,"d":14,"e":15,"f":16,"g":17,"h":18,"i":19,"j":20,"k":21,"l":22,"m":23,"n":24,"o":25,"p":26,"q":27,"r":28,"s":29,"t":30,"u":31,"v":32,"w":33,"x":34,"y":35,"z":36};
    private final String CipherDataset = "abcdefghijklmnopqrstuvwxyz0123456789";

    //A given string should be converted into a string with only upper case letters with the method
    public String convertToUpperCase(String text) {
        String textUpper;
        textUpper = text.toUpperCase();
        return textUpper;

    }

    public String convertToLowerCase(String text) {
        String textLower;
        textLower = text.toLowerCase();
        return textLower;

    }

    public boolean isAnagram(String a, String b) {
        if (a == b) {
            return false;
        } else if (a.length() != b.length()) {
            return false;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] aCharArray = a.toCharArray();
            char[] bCharArray = b.toCharArray();
            Arrays.sort(aCharArray);
            Arrays.sort(bCharArray);

            return Arrays.equals(aCharArray, bCharArray);
        }
    }

    //Write a method that reverses the string in reverseString(String a)

    public String reversString(String a) {
        int num = a.length();
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = new char[num];

        for (int i = 0; i < num; i++) {
            bCharArray[num - i - 1] = aCharArray[i];
        }

        aCharArray = bCharArray;
        return new String(aCharArray);
    }


    public String caesarCipherCode(String input, int cipherShift) {
        int num = CipherDataset.length();
        input = input.toLowerCase();
        StringBuilder inputCoded = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);

            if(originalChar >= '0' & originalChar <= '9' || originalChar <= 'z' & originalChar >= 'a'){
                inputCoded.append(CipherDataset.charAt((CipherDataset.indexOf(originalChar) + cipherShift) % num));
            }else{
                inputCoded.append(originalChar);
            }

        }
        return convertToLowerCase(inputCoded.toString());
    }


    public String caesarCipherDecode(String input, int cipherShift) {
        int num = CipherDataset.length();
        input = input.toLowerCase();
        StringBuilder inputDecoded = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);

            if (originalChar >= '0' & originalChar <= '9' || originalChar <= 'z' & originalChar >= 'a') {
                inputDecoded.append(CipherDataset.charAt((CipherDataset.indexOf(originalChar) - cipherShift) % num));
            }else{
                inputDecoded.append(originalChar);
            }

        }
        return convertToLowerCase(inputDecoded.toString());
    }

}
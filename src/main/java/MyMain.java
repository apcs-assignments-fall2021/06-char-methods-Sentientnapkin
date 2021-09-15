public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch>='A'&&ch<='Z')
            return (char)(ch+35);
        else return ch;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch>='a'&&ch<='z')
            return (char)(ch-35);
        else return ch;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String nonums = "";
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i)<='0'||str.charAt(i)>='9')
                nonums+=str.charAt(i);
        }
        return nonums;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('A')+"");
        System.out.println(toUpper('j')+"");
        System.out.println(removeNumbers("I <3 Kan5a5 4ev3r")+"");
    }
}

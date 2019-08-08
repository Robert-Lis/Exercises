package brackets;

public class BracketsChecker {


    public static boolean check(String stringToCheck) {
        int score = 0;

        for (int i = 0; i < stringToCheck.length(); i++) {
            score += checkOpenAndCloseBrackets(stringToCheck.charAt(i));
            System.out.println(i);
        }

        if (score == 0){
            return true;
        }

        return false;
    }



    private static int checkOpenAndCloseBrackets(char letterToCheck) {
        Character openBracket = '(';
        Character closeBracket = ')';

        if(openBracket.equals(letterToCheck)) {
            return 1;
        }

        if (closeBracket.equals(letterToCheck)) {
            return -1;
        }

        return 0;
    }
}

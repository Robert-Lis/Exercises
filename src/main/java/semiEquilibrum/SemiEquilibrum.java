package semiEquilibrum;

public class SemiEquilibrum {


    public static int check(int[] ints) {
        int inflectionPoint = 0;
        int left = ints[0];
        int right = calculateRightSite(ints);

        while(left < right){
            inflectionPoint += 1;
            int numberToMove = ints[inflectionPoint];
            left += numberToMove;
            right -= numberToMove;
        }
        return inflectionPoint;
    }

    private static int calculateRightSite(int[] ints) {
        int right = 0;
        for (int i = 1; i < ints.length; i++) {
            right += ints[i];
        }
        return right;
    }


}
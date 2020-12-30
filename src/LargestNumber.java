
import java.util.*;

public class LargestNumber {
    private static String largestNumber(String[] a) {
        String result= "";
        int count = a.length;
        String  max = "-1";
        while(count>0){
            int maxPosition = -1;
            for ( int i =0 ; i<a.length; i++ ){
                if ( a[i]!=null){

                    if( IsGreaterOrEqual(a[i],max) ){
                        max = a[i];
                        maxPosition =i;
                    }
                }
            }
            result+= max;
            // remove the item at maxPosition;
            a[maxPosition]= null;
            max= "-1";
            count --;
        }
        return result;
    }
    private static boolean IsGreaterOrEqual( String digit, String maxDigit){

        if( maxDigit.equals("-1"))return true;

        int a = Integer.parseInt(digit+maxDigit);
        int b = Integer.parseInt(maxDigit+digit);
        if( a>=b) return true ;
        return false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}


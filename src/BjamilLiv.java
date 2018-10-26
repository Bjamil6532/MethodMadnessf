public class BjamilLiv {
    public static boolean palindrome(String str1){
            int i = str1.length();
            String str2=0
        if(str2.length() != str1.length() )
            str2 = 
                if(str2.compareTo(str1)==0)
                    return true;
                else
                    return false;
    }
}
public static String dateStr(String input){
        String m = input.substring(0,2);
        String d = input.substring(3,5);
        String y = input.substring(6);
        return d + " - " + m + " - " + y;
}
public static int sumUpTo(int input){
        int sum = 0;
        for(int i=0; i <= input; i++){
            sum += i;
        }
        return sum;
}

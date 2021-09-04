package Easy;

public class ValidPallindrome {
    /*
        Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

    */

    static boolean isPallindrome(String s)
    {
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");

        int high = str.length() - 1;
        int low = 0;

        while(low <= high)
        {
            if(str.charAt(low) != str.charAt(high))
                return false;

            low++;
            high--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPallindrome(s));

    }
}

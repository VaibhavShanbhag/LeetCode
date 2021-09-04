package Easy;

public class AddDigits {
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
    Input: num = 38
    Output: 2
    Explanation: The process is
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2
    Since 2 has only one digit, return it.
    */

    public static void main(String[] args) {

        int num = 38;

        while (num >= 10){
            int num_curr = num;
            for (num = 0; num_curr != 0; num_curr /= 10) {
                num += num_curr % 10;
            }
        }
        System.out.println(num);
    }
}

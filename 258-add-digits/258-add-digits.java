class Solution {
    public int addDigits(int num) {
        int sum = 0;
        
//         if(num == 0)
//             return 0;
        
//         else if(num % 9 == 0)
//             return 9;
        
//         else
//             return num % 9;
        
//         while(num > 9){
//             while(num != 0){
//                 sum += num % 10;
//                 num /= 10;
//             }
            
//             num = sum;
//             sum = 0;
//         }
        
//         return num;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
            
        }
            
            if(sum <= 9){
                return sum;
            }
            
            else{
                return addDigits(sum);
            }
        
    }
}
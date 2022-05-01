class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        ArrayList<String> digits = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            char ch = number.charAt(i);
            if(ch == digit){
                String withoutDigit = number.substring(0,i) + number.substring(i+1);
                digits.add(withoutDigit);
            }
        }
        
        Collections.sort(digits);
        
        return digits.get(digits.size() - 1);
    }
}
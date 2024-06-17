class Solution {

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        // Find potential divisors
        for (int i = Math.min(len1, len2); i >= 1; i--) {
            if (len1 % i == 0 && len2 % i == 0) {
                String candidate = str1.substring(0, i);
                if (isDivisor(candidate, str1) && isDivisor(candidate, str2)) {
                    return candidate;
                }
            }
        }
        
        return "";
    }

    private boolean isDivisor(String candidate, String str) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < str.length()) {
            sb.append(candidate);
        }
        return sb.toString().equals(str);
    }

}

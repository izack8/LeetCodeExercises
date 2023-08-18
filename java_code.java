class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }
        
        return merged.toString();
    }
    // python code
    // merged=[]
    // for i in range(max(len(word1),len(word2))):
    //     if i < len(word1):
    //         merged.append(word1[i])
    //     if i < len(word2):
    //         merged.append(word2[i])
    // concatenated = "".join(merged)
    // return concatenated


}

system.out.println("hello world");
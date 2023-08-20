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

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
    
    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }
        
        int goodCount = 0;
        if (node.val >= maxVal) {
            goodCount++;
        }
        
        maxVal = Math.max(maxVal, node.val);
        goodCount += dfs(node.left, maxVal);
        goodCount += dfs(node.right, maxVal);
        
        return goodCount;
    }


}

system.out.println("hello world");
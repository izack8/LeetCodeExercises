class Solution{

    // 20 Aug 2023
    func goodNodes(_ root: TreeNode?) -> Int {
        return dfs(root, Int.min)
    }
    
    private func dfs(_ node: TreeNode?, _ maxVal: Int) -> Int {
        guard let node = node else {
            return 0
        }
        
        var goodCount = 0
        if node.val >= maxVal {
            goodCount += 1
        }
        
        let newMaxVal = max(maxVal, node.val)
        goodCount += dfs(node.left, newMaxVal)
        goodCount += dfs(node.right, newMaxVal)
        
        return goodCount
    }


}
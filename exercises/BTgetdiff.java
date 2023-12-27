//return the difference between the sum of all node values at odd levels and sum of all node values at even levels. Define the root node to be at level 1.
public int BTgetdiff(BinNode root)
{
    if (root == null) {
        return 0;
    }
    return root.value()-BTgetdiff(root.left())-BTgetdiff(root.right());
    
}

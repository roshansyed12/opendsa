/*Write a recursive function int BTleaf(BinNode root) to count the number of leaf nodes in the binary tree pointed at by root*/
public int BTleaf(BinNode root)
{
    if(root == null) return 0;
    if(root.isLeaf()) return 1;
    return BTleaf(root.left())+BTleaf(root.right());
}

//The height of a binary tree is the length of the path to the deepest node. An empty tree has a height of 0, a tree with one node has a height of 1, and so on.
public int BTheight(BinNode root)
{
    if(root == null) return 0;
    return 1+Math.max(BTheight(root.left()),BTheight(root.right()));
}

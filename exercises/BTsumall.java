//Write a recursive function int BTsumall(BinNode root) that returns the sum of the values for all of the nodes of the binary tree with root.
public int BTsumall(BinNode root)
{
 if(root == null) return 0;
 return root.value()+BTsumall(root.left())+BTsumall(root.right());
}

//Write a recursive function that returns true if there is a node in the given binary tree with the given value, and false otherwise. Note that this tree is not a Binary Search Tree.
public boolean BTcheckval(BinNode root, int value)
{
    if(root==null) return false;
    else if (root.value()==value) return true;
    else return BTcheckval(root.left(),value) || BTcheckval(root.right(), value);   
}

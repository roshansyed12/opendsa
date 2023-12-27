/*
Given a binary tree, check if the tree satisfies the property that for each node, the sum of the values of its left and right children are equal to the node's value. 
If a node has only one child, then the node should have the same value as that child. Leaf nodes automatically satisfy the property.
*/
public boolean BTchecksum(BinNode root)
{
    if (root == null || root.right()==null && root.left()==null) {
        return true;
    }
    if (root.right() == null) {
        return (root.left().value() == root.value()) 
            && BTchecksum(root.left());
    } else if (root.left() == null) {
        return (root.right().value() == root.value()) 
            && BTchecksum(root.right());
    } else {
        return (root.value() == root.left().value() + root.right().value()) 
            && BTchecksum(root.left()) && BTchecksum(root.right());
    }
}

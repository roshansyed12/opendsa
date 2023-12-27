/*We define a "root-to-node path" to be any sequence of nodes in a tree starting with the root and proceeding downward to a given node. 
The "root-to-node path sum" for that path is the sum of the values for all the nodes (including the root and the given node) along that path. 
Define an empty tree to contain no root-to-node paths (and so its sum is zero). 
Define a tree with one node (equivalently, the path to the root) to have a root-to-node path consisting of just the root (and so its sum is the value of the root). 
Given a binary tree and a value sum, return true if the tree has some root-to-node path such that adding up all the values along the path equals sum. 
Return false if no such path exists.*/
public  boolean BTpathsum(BinNode root, int sum)
{
    if(root!=null)
    {
        if(root.value() == sum)
            return true;
        else
            return BTpathsum(root.left, sum - root.value()) || BTpathsum(root.right, sum - root.value());
    }
    else if(sum == 0)
        return true;
    else
        return false;
}

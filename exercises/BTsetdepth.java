//Write a recursive function to set the value for each node in a binary tree to be its depth then return the modified tree. 
//Assume that nodes store integer values. On the initial call to BTsetdepth, depth is 0.
public BinNode BTsetdepth(BinNode root, int depth)
{
	if(root!=null){
     root.setValue((depth++));
     BTsetdepth(root.left(),depth);
     BTsetdepth(root.right(),depth);
    }
    return root;
}

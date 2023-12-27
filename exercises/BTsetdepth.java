public BinNode BTsetdepth(BinNode root, int depth)
{
	if(root!=null){
     root.setValue((depth++));
     BTsetdepth(root.left(),depth);
     BTsetdepth(root.right(),depth);
    }
    return root;
}

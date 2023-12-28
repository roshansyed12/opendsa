//Given two binary trees, return true if and only if they are structurally identical (they have the same shape, but their nodes can have different values).
public  boolean MBTstructure(BinNode root1, BinNode root2)
{
     if(root1==null && root2==null) return true;
    if((root1==null && root2!=null) ||
        (root1!=null && root2==null)) return false;
    else{
        return MBTstructure(root1.left(),root2.left()) &&
        			MBTstructure(root1.right(),root2.right());
    }
}

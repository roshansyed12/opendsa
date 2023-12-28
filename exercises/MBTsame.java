//Given two binary trees, return true if they are identical (they have nodes with the same values, arranged in the same way).
public  boolean MBTsame(BinNode root1, BinNode root2)
{
     if(root1==null && root2==null) return true;
    if((root1==null && root2!=null) ||
        (root1!=null && root2==null) ||
      		root1.value()!=root2.value()) return false;
    else{
        return MBTsame(root1.left(),root2.left()) &&
        			MBTsame(root1.right(),root2.right());
    }
}

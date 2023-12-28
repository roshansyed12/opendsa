//Given two binary trees, return true if and only if they are mirror images of each other. Note that two empty trees are considered mirror images.
public  boolean MBTmirror(BinNode root1, BinNode root2)
{
    if(root1==null && root2==null) return true;
    if((root1==null && root2!=null) ||
        (root1!=null && root2==null) ||
      		root1.value()!=root2.value()) return false;
    else{
        MBTmirror(root1.left(),root2.right());
        MBTmirror(root1.right(),root2.left());
        return true;
    }
}


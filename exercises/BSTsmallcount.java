/*Write a recursive function BSTsmallcount that, given a BST and a value key, returns the number of nodes having values less than key. 
Your function should visit as few nodes in the BST as possible.*/
public int BSTsmallcount(BinNode root, int key)
{
    if(root == null) return 0;

    if (root.value()<key){
        return 1+ BSTsmallcount(root.left(),key)+BSTsmallcount(root.right(),key);
    
    }

    else{
        return BSTsmallcount(root.left(),key);
    }
}

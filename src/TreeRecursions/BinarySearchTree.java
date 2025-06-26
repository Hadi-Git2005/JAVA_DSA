package TreeRecursions;
class BinaryTreeNode2{
	int val;
	BinaryTreeNode2 left,right;
	BinaryTreeNode2(int val)
	{
		this.val = val;
		left = right = null;
	}
}
public class BinarySearchTree {
	BinaryTreeNode2 root;
	BinarySearchTree()
	{
		root = null;
	}
	void preOrder(BinaryTreeNode2 node) {
	     if (node != null) {
	         System.out.print(node.val + " ");
	         preOrder(node.left);
	         preOrder(node.right);
	     }
	 }
	public void create(int val)
	{
		BinaryTreeNode2 newNode = new BinaryTreeNode2(val);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			BinaryTreeNode2 current = root;
			while(true)
			{
				if(current.val<val)
				{
					if(current.right == null)
					{
						current.right = newNode;
						break;
					}
					else
					{
						current = current.right;
					}
				}
				if(current.val>val)
				{
					if(current.left == null)
					{
						current.left = newNode;
						break;
					}
					else
					{
						current = current.left;
					}
				}
			}
		}
	}
	BinaryTreeNode2 search(int data)
	{
		BinaryTreeNode2 current = root;
		while(current != null)
		{
			if(current.val == data)
			{
				return current;
			}
			else if(data>current.val)
			{
				current = current.right;
			}
			else 
			{
				current = current.left;
			}	
		}
		return null;
	}
	public static void main(String[] args)
	{
		BinarySearchTree Bt = new BinarySearchTree();
		Bt.create(4);
		Bt.create(3);
		Bt.create(5);
		Bt.create(2);
		Bt.create(6);
		System.out.println(Bt.search(7));
		Bt.preOrder(Bt.root);
	}
}

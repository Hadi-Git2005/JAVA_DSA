package TreeRecursions;
import java.util.LinkedList;
import java.util.Queue;
class BinaryTreeNode1{
	int val;
	BinaryTreeNode1 left,right;
	BinaryTreeNode1(int val)
	{
		this.val = val;
		left = right = null;
	}
}
public class BinaryTree {
	BinaryTreeNode1 root;
	BinaryTree()
	{
		root = null;
	}
	public void preorder(BinaryTreeNode1 Node)
	{
		if(Node!=null)
		{
			System.out.println(Node.val);
			preorder(Node.left);
			preorder(Node.right);
		}
	}
	public void inorder(BinaryTreeNode1 Node)
	{
		if(Node!=null)
		{
			inorder(Node.left);
			System.out.println(Node.val);
			inorder(Node.right);
		}
	}
	public void postorder(BinaryTreeNode1 Node)
	{
		if(Node!=null)
		{
			postorder(Node.left);
			postorder(Node.right);
			System.out.println(Node.val);
		}
	}
	public void create(int val)
	{
		BinaryTreeNode1 newNode = new BinaryTreeNode1(val);
		if(root == null)
		{
			root = newNode;
		}
		else 
		{
		Queue<BinaryTreeNode1> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode1 current = queue.poll();
			if(current.left == null)
				{
					current.left = newNode;
					break;
				}
				else
				{
					queue.offer(current.left);
				}
				if(current.right == null)
				{
					current.right = newNode;
					break;
				}
				else
				{
					queue.offer(current.right);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		BinaryTree Bt = new BinaryTree();
		Bt.create(1);
		Bt.create(2);
		Bt.create(3);
		Bt.create(4);
		Bt.create(5);
		Bt.create(6);
		Bt.create(7);
		System.out.println("Preorder traversal");
		Bt.preorder(Bt.root);
		System.out.println("Inorder traversal");
		Bt.inorder(Bt.root);
		System.out.println("Postorder traversal");
		Bt.postorder(Bt.root);
	}
}

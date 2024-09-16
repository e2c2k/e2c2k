package As1;
/**
	Represents a node to be used in a binary tree.
 */
 
public class BinaryTreeNode {
	
	// instance variables
	private int num;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	/** 
		Creates a new BinaryTreeNode with a given idNumber
		@param idNumber Number to be associated with the BinaryTreeNode
	*/
	public BinaryTreeNode(int num){	
		this.num = num;
		left = null;
		right = null;
	} // end Constructor
		
	/**
		Mutator method for idNumber. Method is set to private in order 
		to provide encapsulation. Enabling modifications outside the class could 
		lead to numbers being linked in the wrong place in the tree.
		@param idNumber The new number to be associated with the 
		BinaryTreeNode.
		
	*/	
	private void setNum(int num){	
		this.num = num;
	} 
	
	/**
		Accessor method for idNumber
		@return The idNumber associated with the BinaryTreeNode
	*/	
	public int getNum(){	
		return num;
	} 

	/**
		Accessor method for left
		@return The BinaryTreeNode that is attached to the left reference
		of the current BinaryTreeNode
	*/	
	public BinaryTreeNode getLeft(){
		return left;
	} 
	
	/**
		Accessor method for right
		@return The BinaryTreeNode that is attached to the right reference
		of the current BinaryTreeNode
	*/
	public BinaryTreeNode getRight(){
		return right;
	}
	
	// No mutator methods are provided for right and left.

	
	/** Inserts a given BinaryTreeNode into the subtree rooted at this.
		Maintains the basic property of a binary tree, which is that 
		all smaller values go into the left subtree, and all larger 
		values go into the right subtree.
		@param newNumber new number to be inserted in the tree
		@throw IllegalArgumentException if the number being added is already in the tree

	*/
	public void insert(int newNumber){
	
		if (newNumber == num){
			// Do not insert a number if it is already in the tree.
			throw new IllegalArgumentException("Duplicate found: Number " + newNumber + 
										" is already in the tree.");
			
		} else if (newNumber < this.num){	
			// Insert into the left subtree.
			// First check to see if the insertion should happen right here.
			if (left == null)
				left = new BinaryTreeNode(newNumber);
			else
				left.insert(newNumber);
		
		} else {	
			// Otherwise insert into the right subtree.
			// First check to see if the insertion should happen right here.
			if (right == null)
				right = new BinaryTreeNode(newNumber);
			else
				right.insert(newNumber);
		} // end if 
		
		
	} // end insert()
	
} // end class


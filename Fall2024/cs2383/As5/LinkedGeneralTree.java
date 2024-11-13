public class LinkedGeneralTree<E> 
{ 
  // Constructor
  /** Constructs a new empty list. */
  public LinkedGeneralTree(){
    
  }

  /**
   * Returns the number of TreeNodes in the tree.
   * @return number of TreeNodes in the tree
   */
  public int getSize()

  /**
   * Tests whether the tree is empty.
   * @return true if the tree is empty, false otherwise
   */
  public boolean isEmpty()

  /**
   * Returns a reference to the tree's root TreeNode.
   *
   * @return the tree's root TreeNode (or null, if root is null)
   */
  public TreeNode<E> getRoot() 

  /**
   * Returns a String representing the elements in each 
   * node for the entire tree, one per line, in preorder sequence.
   * Calls the toStringPreorder() method for the root node to 
   * accomplish this.
   *
   * @return a String representing the elements in each 
             TreeNode, one per line, in preorder sequence
   */
  public String toStringPreorder()

  /**
   * Returns a String representing the elements in each 
   * node for the entire tree, one per line, in postorder sequence
   * Calls the toStringPostorder() method for the root node to 
   * accomplish this.
   *
   * @return a String representing the elements in each 
             TreeNode, one per line, in postorder sequence
   */
  public String toStringPostorder() 

  /**
   * Returns a String representing the elements in each 
   * node for the entire tree, one per line, in breadth first sequence
   * Calls the toStringBreadthFirst() method for the root node to 
   * accomplish this.
   *
   * @return a String representing the elements in each 
             TreeNode, one per line, in breadth first sequence
   */
  
  public String toStringBreadthFirst() 


  /**
   * Adds the first node (as the root) to a currently 
   * empty tree. No change is made if the tree is not empty.
   *
   * @return true if v was added as the root, otherwise false
   */
  public boolean addRoot(TreeNode<E> v)
  


  /**
   * Adds newNode to the tree as a child of existingNode.
   *
   * @return true if newNode was added, otherwise false
   */
  @SuppressWarnings("unchecked")
  public boolean addChildOf(TreeNode existingNode,
                            TreeNode newNode)


} // end LinkedGeneralTree class

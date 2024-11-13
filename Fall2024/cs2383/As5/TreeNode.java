  /**
   * A node of a general linked tree, which stores a reference to its
   * element, to the parent TreeNode, and an array of references for
   * a limited number of child TreeNodes.
   */
  public class TreeNode<E>
  {

    private TreeNode<E>[] child;
    private int numChild= 0;
    private E element;
    private TreeNode<E> parent;
    private int MAX_CHILD_QUANTITY = 5;
    /**
     * Constructs a TreeNode that initially has zero children. 
     *
     * @param e  the element to be stored
     * @param p  reference to a parent TreeNode, or null
     */
    @SuppressWarnings("unchecked")
    public TreeNode(E e, TreeNode<E> p){
      child = new TreeNode[MAX_CHILD_QUANTITY];
      parent = p;
      element =e;
    }
    
    /**
     * Returns the element stored in the TreeNode.
     * @return the stored element
     * @throws IllegalStateException if TreeNode is missing
     */
    public E getElement() {
      if (element == null){
        throw new IllegalStateException("tree is null");
      }
      return element;
    }

    /**
     * Returns the parent TreeNode (or null if no such TreeNode, which
     * should be the case if 'this' is the root TreeNode)
     * @return the parent TreeNode
     */
    public TreeNode<E> getParent(){
      return parent;
    }

    /**
     * Returns the current number of child TreeNodes for which
     * this TreeNode is the parent.
     * @return The number of children for this node
     */
    public int getNumChildren(){
      return numChild;
    }
    
    /**
     * Returns the child TreeNode at index i
     * @param i The index of the desired child element
     * @return the child TreeNode at index i
     */
    public TreeNode<E> getChild(int i) throws NoSuchElementException{
      if(i<numChild && i>=0){
        return child[i];
      }else{
        throw new NoSuchElementException("child does not exist");
      }
    }

    /**
     * Tests whether this TreeNode is the root of the tree
     * @return true if this TreeNode is the root, otherwise false
     */
    public boolean isRoot(){
      if(parent ==null){
        return true;
      }

      return false;
    }


  /**
   * Returns a String representation of this node
   *
   * @return A String representation of this node
   */
  public String toString(){
    
  }
  

  /**
   * Returns a String representing the elements in each 
   * TreeNode for the subtree rooted at this, one per line, 
   * in preorder sequence
   *
   * @return  a String representing the elements in each 
     TreeNode for the subtree rooted at TreeNode v, one per line, 
     in preorder sequence
   */
  public String toStringPreorder() 

  /**
   * Returns a String representing the elements in each 
   * TreeNode for the subtree rooted at this, one per line, 
   * in postorder sequence
   *
   * @return  a String representing the elements in each 
     TreeNode for the subtree rooted at TreeNode v, one per line, 
     in postorder sequence
   */
  public String toStringPostorder() 

  /**
   * Returns a String representing the elements in each 
   * TreeNode for the subtree rooted at this, one per line, 
   * in breadth first sequence
   
   * @param treeSize The number of nodes in the subtree. This is
            used to size the array representing a queue. You may
            omit this parameter if you use a linked queue, which
            means you can manage the queue without knowing in
            advance how many nodes are involved.
   *
   * @return  a String representing the elements in each 
     TreeNode for the subtree rooted at TreeNode v, one per line, 
     in breadth first sequence
   */
  @SuppressWarnings("unchecked")
  public String toStringBreadthFirst(int treeSize) 
  
    /**
     * Sets the TreeNode's element to the given element e.
     * @param e    the TreeNode's new element
     */
    public void setElement(E e){
      element = e;
    } 

    /**
     * Sets the TreeNode's parent reference to the given TreeNode v.
     * @param v    this TreeNode's new parent
     */
    public void setParent(TreeNode<E> v){
      parent = v;
    } 


    /**
     * Adds the given TreeNode as a child of this TreeNode.
     * @param v  The new child of this TreeNode.
     * @return true if a child TreeNode is added, or false if
               this TreeNode already has the maximum number of
               child TreeNodes.
     */
    public boolean addChild(TreeNode<E> v){
      if(numChild ==MAX_CHILD_QUANTITY){
       return false;
      }else{
       child[numChild] = v;
        numChild++;
        return true;
      }
  }

  } //----------- end of TreeNode class -----------

/**
* This is the TreeNode<T> class
*
*
* @author Fatima Mancia
*
*/
public class TreeNode<T> {
  protected T data;
  protected TreeNode<T> right;
  protected TreeNode<T> left;
  protected TreeNode<T> root;
  public TreeNode(T dataNode) {
    this.data = dataNode;
    this.right = null;
    this.left = null;
  }
  
  public TreeNode(TreeNode<T> node) {
    TreeNode<T> tree = new TreeNode<>(node);
  }
  /**
	 * getData gets the data
   * 
	 * @return data
	 */
  public T getData() {
    return data;
  }
}
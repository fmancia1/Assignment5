/**
* This is the MorseCodeTree class
*
*
* @author Fatima Mancia
*
*/
import java.util.ArrayList;
public class MorseCodeTree implements 
LinkedConverterTreeInterface<String> {
  private TreeNode<String> root = null;
  MorseCodeTree() {
    root = new TreeNode<String>("");
    buildTree();
   
  }
  /**
	 * getRoot gets the root
	 * @return root
	 */
  public TreeNode<String> getRoot() {
    return root;
  }
  /**
	 * setRoot sets the newNode
   * @param newNode
	 * @return root
	 */
  public void setRoot(TreeNode<String> newNode) {
    this.root = newNode;
  }
  /**
	 * insert calls addNode method
   * @param code
   * @param result
	 * @return this
	 */
  public MorseCodeTree insert(String code, String result) {
    addNode(root, code, result);
    return this;
  }
  /**
	 * addNode adds the new node
   * @param root
   * @param code
   * @param letter
	 *
	 */
  public void addNode(TreeNode<String> root, String code, String letter) {
    if (code.length() == 1) {
      if (code.charAt(0) == '.') {
        root.left = new TreeNode<String>(letter);
      }
      else {
        root.right = new TreeNode<String>(letter);
      }
    }
    else {
      TreeNode<String> aux = null;
      if (code.charAt(0) == '.') {
        aux = root.left;
      }
      else {
        aux = root.right;
      }
      // System.out.println("Long code");
      addNode(aux, code.substring(1), letter);
    }
  }
  /**
	 * fetch creates a String
   * @param code
   * 
	 * @return letter
	 */
  public String fetch(String code) {
    String letter = fetchNode(root, code);
    return letter;
  }
  /**
	 * fetchNode creates a string
   * @param node
   * @param code
	 * @return letter
	 */
  public String fetchNode(TreeNode<String> node, String code) {
    String letter;
    if (code.length() == 0)
      return "";
    else if (code.length() == 1) {
      if (code.equals(".")) {
        letter = node.left.getData();
      }
      else {
        letter = node.right.getData();
      }
    }
    else {
      if (code.charAt(0) == '.') {
        letter = fetchNode(node.left, code.substring(1));
      }
      else {
        letter = fetchNode(node.right, code.substring(1));
      }
    }
    return letter;
  }
  /**
	 * delete deletes the data
   * @param data
	 * @return this
	 */
  public MorseCodeTree delete(String data) throws UnsupportedOperationException {
    return this;
  }
  /**
	 * update updates the code
   * 
	 * @return this
	 */
  public MorseCodeTree update() throws UnsupportedOperationException {
    return this;
  }
  /**
	 * buildTree builds the tree
   * 
	 */
  public void buildTree() {
    // System.out.println("Level 0 completed");
    insert(".", "e");
    insert("-", "t");
    // System.out.println("Level 1 completed");
    insert("..", "i");
    insert(".-", "a");
    insert("-.", "n");
    insert("--", "m");
    // System.out.println("Level 2 completed");
    insert("...", "s");
    insert("..-", "u");
    insert(".-.", "r");
    insert(".--", "w");
    insert("-..", "d");
    insert("-.-", "k");
    insert("--.", "g");
    insert("---", "o");
    // System.out.println("Level 3 completed");
    insert("....", "h");
    insert("...-", "v");
    insert("..-.", "f");
    insert(".-..", "l");
    insert(".--.", "p");
    insert(".---", "j");
    insert("-...", "b");
    insert("-..-", "x");
    insert("-.-.", "c");
    insert("-.--", "y");
    insert("--..", "z");
    insert("--.-", "q");
    // System.out.println("Level 4 completed");
  }
  /**
	 * toArrayList creates the ArrayList
   * 
	 * @return tree
	 */
  public ArrayList<String> toArrayList() {
    ArrayList<String> tree = new ArrayList<String>();
    LNRoutputTraversal(root, tree);
    return tree;
  }
  /**
	 * LNRoutputTraversal creates a list
   * @param node
   * @param list
	 * 
	 */
  public void LNRoutputTraversal(TreeNode<String> node, ArrayList<String> list) {
    if (node != null) {
      LNRoutputTraversal(node.left, list);
      list.add(node.getData());
      LNRoutputTraversal(node.right, list);
    }
  }
}
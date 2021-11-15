/**
* This is the MorseCodeConverter class
*
*
* @author Fatima Mancia
*
*/
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class MorseCodeConverter {
  MorseCodeConverter() {
  }
  /**
	 * printTree() prints the tree
	 * @return ret
	 */
  public static String printTree() {
    ArrayList<String> list = new ArrayList<String>();
    MorseCodeTree mct = new MorseCodeTree();
    TreeNode<String> root = mct.getRoot();
    mct.LNRoutputTraversal(root, list);
    String ret = String.join(" ", list);
    // System.out.println(ret);
    return ret;
  }
  /**
	 * convertToEnglish converts the morse code to English
   * @param code
	 * @return ret
	 */
  public static String convertToEnglish(String code) {
    String ret = "";
    MorseCodeTree tempMCT = new MorseCodeTree();
    String[] tokens = code.split("/");
    for (int i = 0; i < tokens.length; i++) {
      String[] letters = tokens[i].split(" ");
      for (String letter : letters) {
        ret += tempMCT.fetch(letter);
      }
      if (i != tokens.length - 1) {
        ret += " ";
      }
    }
    return ret;
  }
  /**
	 * convertToEnglish converts the morse code to English
   * @param codeFile
	 * @return s
	 */
  public static String convertToEnglish(File codeFile) throws FileNotFoundException {
    String s = "";
    try {
      Scanner reader = new Scanner(codeFile);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        s += convertToEnglish(data);
      }
    }
    catch (Exception e) {
      throw new FileNotFoundException("File was not found");
    }
    return s;
  }
}
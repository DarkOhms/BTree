
public class Stub {
  public static void main(String[] args){
	  
	  BTree<String> myTree = new BTree<String>("m");
	  
	  myTree.insert("p");
	  myTree.insert("b");
	  myTree.insert("a");
	  myTree.insert("c");
	  myTree.insert("d");
	  myTree.insert("n");
	  
	  myTree.leftInOrderTraversal();
	  
	  String value = "n";
	  
	  if(myTree.search(value)){
		  System.out.println(value + " In the tree");
	  }else{
		  System.out.println(value + " NOT in the tree");
	  } 
	  
	  //delete and check
	  myTree.delete("m");
	  
	  myTree.leftInOrderTraversal();
	  
	  myTree.delete("b");
	  
	  myTree.leftInOrderTraversal();
  }
}

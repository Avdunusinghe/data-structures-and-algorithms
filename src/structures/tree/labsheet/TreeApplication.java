package structures.tree.labsheet;

import java.util.Scanner;

public class TreeApplication {

	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		
		t1.insert(149 , "Anusha");
		t1.insert(167, "Kosala");
		t1.insert(047, "Dinusha");
		t1.insert(066, "Mihiri");
		t1.insert(159, "Jayani");
		t1.insert(118, "Nimal");
		t1.insert(195, "Nishantha");
		t1.insert(034, "Avodya");
		t1.insert(105, "Bimali");
		t1.insert(133, "Sampath");
		
		System.out.println("InOrder (left, root, right )");
		t1.TraverseInOder();
		
		System.out.println("PreOrder (root, left, right )");
		t1.TraversePreOder();
		
		//error occured in progress
		/*System.out.println("PostOrder (left, root, right )");
		t1.TraversePostOrder();*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the Value");
		int value = sc.nextInt();
		
		t1.callRecursive(value); 
		t1.find(value);
		
		t1.delteAll();
		t1.TraverseInOder();
	}

}

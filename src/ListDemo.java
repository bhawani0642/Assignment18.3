import java.util.ArrayList;
import java.util.List;
/*
 * Created a class named as ListDemo
 */
public class ListDemo {
	//Main method of the class
	public static void main(String[] args) {
//created an ArrayList
		List<String> list = new ArrayList<String>();
		//adding elements in ArrayList by using list.add
		list.add("sam");
		list.add("Mohan");
		list.add("rohan");
		list.add("shalu");
		//Printing all the elements of the ArrayList
		System.out.println("Number of elements present in ArrayList is= " + list.size());
		//Checking weather an element is present or not
		System.out.println(list.contains("sam"));
		//Here we are converting the Arraylist to Array
		String[] str = new String[list.size()];
		list.toArray(str);
		for (String s : str) {
			//print line
			System.out.println(s);
		}
		//Here we are replacing the third element of the ArrayList i.e rohan with bhawani
			list.set(2, "bhawani");
			//Printing the result
			System.out.println("replaced"+list);
			
			

		}
	}


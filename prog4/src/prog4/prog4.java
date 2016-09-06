import java.io.*;
import java.util.*;

public class prog4 {
	public static ArrayList<Integer> list = new ArrayList<Integer>(); //creates an array named list
	public static int index;
	public static ArrayList<Integer> addOne(){ 
		if(list.get(index) == 9){    //gets last index in array -->listsize -1; using .get gets the element at that index; if element at last index == 9 return zero
			list.set((index), 0); //sets last element of arraylist to zero
			if(index == 0)
				{ 
				list.add(index, 1);
				return list;
				}
			index--;
			return addOne(); //return list			
		}else{
			list.set(index, list.get(index)+1); //sets last element of arraylist to whatever it was +1; it says 0 right now bc im just trying to test it
			return list; //return list
		}
	}
	public static void main(String[] args){	
		try{ 
			File inputFile = new File("listOfNumbers.txt");
			Scanner scanner = new Scanner(inputFile);
			while(scanner.hasNextInt()){
				list.add(scanner.nextInt());	
			}
			scanner.close();
			index = list.size()-1;
			System.out.print(addOne());
		}catch(FileNotFoundException e){}
	}
}

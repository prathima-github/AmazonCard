package arraysandstrings;

import java.util.Arrays;

import arraysandstrings.Computer.Com;

class Computer{
	private int id = 0;
	private String name = "prathima";
	private Com comObject;
	
	class Com{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}		
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Com getComObject() {
		return comObject;
	}
	public void setComObject(Com comObject) {
		this.comObject = comObject;
	}	
	
	
}

class CustomException extends w

public class Siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] results = sibling(9, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 9);
		System.out.println(Arrays.toString(results));
		
		Computer computer = new Computer();
		Com com1= (Computer.class).getComObject();
		Com com2 = computer.getComObject();
		if(com1==com2)
		System.out.println("equal objects");
		else
			System.out.println("different objects");
			
		
		
	}
	
	
	static int[] sibling(int input1, int[] input2, int input3) {
		if (input2.length == 0 || input1 == 0)
			return new int[] { -1 };

		if (input1 != input2.length)
			return new int[] { -1 };
		int index = -1;
		for (int i = 0; i < input2.length; i++) {
			if (input3 == input2[i]) {
				if (i == 0)
					return new int[] { -1 };
				index = i + 1;
			}
		}
		if (index == -1)
			return new int[] { -1 };
		System.out.println("index is " + index);
		int level = Integer.highestOneBit(index);
		System.out.println(level + "..is the level");

		int start = level == 1 ? level : level - 1;
		int end = level * 2 - 2;
		if (end >= input1)
			end = input1 - 1;
		System.out.println("Start and end are - " + start + ".." + end);
		int[] results = new int[end - start];
		for (int i = start, j = 0; i <= end; i++) {
			if (input2[i] != input3) {
				results[j] = input2[i];
				j++;
			}

		}

		return results;

	}

}

package main;

public class T3_Exercitiul_3 {

	public static void main(String[] args) {
		int[] array = new int[] {54,122,90,2,-9,0,3,7};
		for(int i = 0; i < array.length; i++) {
			if(array[i]<0)
				System.out.print("Numarul negativa se afla pe pozitia "+(i+1)+" in array.");
		}

	}

}

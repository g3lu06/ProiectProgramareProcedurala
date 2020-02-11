package main;

public class T3_Exercitiul_6 {

	public static void main(String[] args) {
		int[] intArray = new int[] {1,22,333,4444,55555,666666};
		double[] doubleArray = new double[intArray.length];
		double aux = 1;
		
		for(int i = 0; i < intArray.length; i++)
			doubleArray[i] = intArray[i] + aux;
		
		System.out.print("Vectorul nou: ");
		for(int i = 0; i < doubleArray.length; i++)
			System.out.print(doubleArray[i] + ", ");
	}

}
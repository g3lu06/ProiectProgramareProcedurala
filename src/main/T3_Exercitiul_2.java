package main;

public class T3_Exercitiul_2 {

		public static void main(String[] args) {
		
		int[] array = new int[] {-1,15,20,25,30,35,40,45,50,55};
		int minim=array[0];
		int maxim=array[0];
		for(int i = 0; i < 10; i++) {
			if(array[i]<minim)
				minim=array[i];
			if(array[i]>maxim)
				maxim=array[i];
		}
		System.out.println("Minimul este: "+minim);
		System.out.println("Maximul este: "+maxim);
		
	}

}
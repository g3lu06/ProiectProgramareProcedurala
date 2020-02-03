package main;

public class Exercitiul5 {

	public static void main(String[] args) {
		int n=5; //numarul pentru care executam calculul
		int random= 1; // valoarea numarului ales
		if (n<13) // daca n <13 se executa
			for (int i=2; i<=n; i++)
			{
				random = random*1;
			}
		System.out.println(n+"!="+random);
		
	}

}

package main;

public class T3_Exercitiul_5 {

	public static void main(String[] args) {
		String sentence = "ProiectProgramareProcedurala";
		for(int i = 0; i < sentence.length(); i++) {
			if(i%2==1) 
				sentence = sentence.substring(0,i) + sentence.substring(i,i+1).toUpperCase() + sentence.substring(i+1,sentence.length());
			else 
				sentence = sentence.substring(0,i) + sentence.substring(i,i+1).toLowerCase() + sentence.substring(i+1,sentence.length());
		}
		System.out.println(sentence);
	}
}
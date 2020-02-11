package main;

public class T3_Exercitiul_4 {

	public static void main(String[] args) {
			String cuvant = "ProiectProgramareProcedurala";
			int len = cuvant.length();
			char[] charArray = new char[len];
			for(int i = 0; i < len; i++) {
				charArray[i]=cuvant.charAt(i);
				System.out.println("charArray["+i+"]= "+charArray[i]);
			}	
		}
	}
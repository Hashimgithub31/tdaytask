package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("Tamilnadu, Andhra, Kerala, Karnataka");
		
	}
	
	public void northIndia() {
		System.out.println("Bihar, up, mp, etc");
	}
	
//<<<<<<< HEAD
	private void chennai() {
		System.out.println("capital of tamilnadu");
	}
	
	
//=======
	private void capitalCity() {
		System.out.println("capital city is Delhi");
	}
	
//>>>>>>> a3ebd477803d95a770a9e1cc21fe8953235dd78c
	public static void main(String[] args) {
		StateDetails s=new StateDetails();
		s.southIndia();
		s.northIndia();
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
	}

}

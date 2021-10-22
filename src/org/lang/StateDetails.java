package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("Tamilnadu, Andhra, Kerala, Karnataka");
		
	}
	
	public void northIndia() {
		System.out.println("Bihar, up, mp, etc");
	}
	
	private void capitalCity() {
		System.out.println("capital city is Delhi");
	}
	
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

package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("Tamilnadu, Andhra, Kerala, Karnataka");
		
	}
	
	public void northIndia() {
		System.out.println("Bihar, up, mp, etc");
	}
	
	private void chennai() {
		System.out.println("capital of tamilnadu");
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

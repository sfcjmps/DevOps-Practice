package com.ex.day3;

public class Roman {
	public String convert(int inp){
		String strf = new String();
		String[] str1 = new String[]{"V","X","L","C"};
		String[] str2 = new String[]{"I","II","III",
				"IV","V","VI","VII","VIII","IX"};
		
		while(inp!=0){
			if(inp<10){
				for(int i=1;i<10;i++){
					strf = strf + str2[i-1];
					return strf;
					
				}
			}
			if(inp>=10){
				int div=inp/10;
				int remain = inp%10;
				inp = inp/10;
				
			}
			
			
		
		
		
	}
	public static void main(String[] args) {
		
	}
}

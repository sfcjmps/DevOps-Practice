package com.hcl.boxing;

public class TimeCorrect {
	int hrs;
	int mins;
	
	public TimeCorrect(){
		
	}

	public TimeCorrect(int hrs, int mins) {
		super();
		this.hrs = hrs;
		this.mins = mins;
	}
	public TimeCorrect add(TimeCorrect t1,TimeCorrect t2){
		TimeCorrect t3 = new TimeCorrect();
		t3.hrs=t1.hrs+t2.hrs;
		t3.mins=t1.mins+t2.mins;
		if(t3.mins>60){
			t3.hrs++;
			t3.mins=t3.mins%60;
		}
		return t3;
	}

	@Override
	public String toString() {
		return "TimeCorrect [hrs=" + hrs + ", mins=" + mins + "]";
	}
 public static void main(String[] args) {
	TimeCorrect t1=new TimeCorrect(3,40);
	TimeCorrect t2=new TimeCorrect(3,35);
	TimeCorrect t3 =new TimeCorrect().add(t1,t2);
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	
}	
	

}

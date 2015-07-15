package com.porkgame.card;

public class Assordment {
	private Integer iNum;
	private String sDisplay;
	
	public Integer getiNum() {
		return iNum;
	}
	
	public Assordment(Integer iNum) {
		this.iNum = iNum;
		
		switch(this.iNum.intValue()){
		case 0:
			sDisplay = "方块";
			break;
		case 1:
			sDisplay = "梅花";
			break;
		case 2:
			sDisplay = "红桃";
			break;
		case 3:
			sDisplay = "黑桃";
			break;
		default:
			System.out.println("花色值赋值错误！");
		}
	}
	
	public String getsDisplay(){
		return sDisplay;
	}

	
}

package com.porkgame.card;

public class CardNumber {
	private Integer iNum;
	private String sDisplay;
	
	public Integer getiNum() {
		return iNum;
	}
	public CardNumber(int iNum) {
		this.iNum = iNum;
		
		switch(this.iNum){
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			this.sDisplay = String.valueOf(iNum);
			break;
		case 11:
			this.sDisplay = "J";
			break;
		case 12:
			this.sDisplay = "Q";
			break;
		case 13:
			this.sDisplay = "K";
			break;
		case 14:
			this.sDisplay = "A";
			break;
		default:
			System.out.println("ÅÆÖµ¸³Öµ´íÎó£¡");
		}
	}
	public String getsDisplay() {
		return sDisplay;
	}
	
	
}

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
			sDisplay = "����";
			break;
		case 1:
			sDisplay = "÷��";
			break;
		case 2:
			sDisplay = "����";
			break;
		case 3:
			sDisplay = "����";
			break;
		default:
			System.out.println("��ɫֵ��ֵ����");
		}
	}
	
	public String getsDisplay(){
		return sDisplay;
	}

	
}

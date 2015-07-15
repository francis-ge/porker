package com.porkgame;

import com.porkgame.card.Assordment;
import com.porkgame.card.CardNumber;

public class Card implements Comparable<Card>{
	private Assordment as;
	private CardNumber cn;
	
	public Card(){
		
	}
	
	public Card(Integer assordment, Integer cardNumber) {
		as = new Assordment(assordment);	
		cn = new CardNumber(cardNumber);
		
		System.out.println("生成了："+as.getsDisplay()+cn.getsDisplay());;
	}
	
	public Assordment getAs() {
		return as;
	}
	
	public CardNumber getCn() {
		return cn;
	}

	
	public String show(){
		return as.getsDisplay()+cn.getsDisplay();
	}

	@Override
	public int compareTo(Card o) {
		// TODO 自动生成的方法存根
		if (this.cn.getiNum().compareTo(o.cn.getiNum())!=0){
			return this.cn.getiNum().compareTo(o.cn.getiNum());
		}else{
			return this.as.getiNum().compareTo(o.as.getiNum());
		}
		
	}
	
}

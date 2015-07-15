package com.porkgame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pork {
	private Set<Card> porkSet;

	public Pork(){
		this.porkSet = new HashSet<Card>();
		
	}
	
	public void shuffleCards(){
		porkSet.clear();
		
		for(int i=0;i<4;i++){
			for(int j=2;j<15;j++){
				Card card = new Card(Integer.valueOf(i),Integer.valueOf(j));
				porkSet.add(card);
			}
		}	
		
		System.out.println("洗牌完毕！");

	}
	
	public Card dealCard(){
		
		Iterator<Card> it = porkSet.iterator();
		
		if(it.hasNext()){
			Card card = it.next();
			it.remove();
			return card;
		}else{
			System.out.println("牌发完了，请重新洗牌！");
			return null;		
		}
		
	}
	
}

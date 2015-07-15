package com.porkgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Player implements Comparable<Player>{
	private List<Card> cardsList;
	private String sName;
	
	public Player(String name){
		this.sName = name;
		
		cardsList = new ArrayList<Card>();
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void getCard(Card card){
		cardsList.add(card);
	}
	public void showCard(){
		System.out.println(sName+"的手牌:");
		String sCard="";
		
		for(Card o: cardsList){
			sCard = sCard + o.show()+";";
		}
		
		System.out.println(sCard);
	}
	
	public Card maxCard(){
		Collections.sort(cardsList);
		Collections.reverse(cardsList);
		
		return cardsList.get(0);
	
	}
	
	public void restart(){
		cardsList.clear();
	}
	
	@Override
	public int compareTo(Player o) {
		// TODO 自动生成的方法存根
		
		return this.maxCard().compareTo(o.maxCard());
	}
	
}

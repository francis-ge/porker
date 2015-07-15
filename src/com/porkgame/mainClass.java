package com.porkgame;

import java.util.Scanner;

public class mainClass {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Pork pork = new Pork();

		Scanner console = new Scanner(System.in);
		
		System.out.println("请输入玩家1姓名：");
		
		String name = console.next();
		Player player1 = new Player(name); 
		
		System.out.println("请输入玩家2姓名：");
		
		name = console.next();
		Player player2 = new Player(name);
		
		System.out.println("输入任意键开始游戏...");
		
		String str = console.next(); 
				
		do{
			player1.restart();
			player2.restart();
			
			pork.shuffleCards();
			player1.getCard(pork.dealCard());
			player2.getCard(pork.dealCard());
			player1.getCard(pork.dealCard());
			player2.getCard(pork.dealCard());
			
			if (player1.compareTo(player2)>0){
				System.out.println(player1.getsName() + "获胜,各自手牌是："  );
				player1.showCard();
				player2.showCard();
			}else{
				System.out.println(player2.getsName() + "获胜,各自手牌是："  );
				player1.showCard();
				player2.showCard();
			}

			
			do{
				System.out.println("输入”y“继续，”n“退出。");
				 str = console.next();
			}while((str.equals("y") || str.equals("n"))==false);
			
		}while(str.equals("y"));
	}

}

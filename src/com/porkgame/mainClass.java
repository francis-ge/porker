package com.porkgame;

import java.util.Scanner;

public class mainClass {

	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Pork pork = new Pork();

		Scanner console = new Scanner(System.in);
		
		System.out.println("���������1������");
		
		String name = console.next();
		Player player1 = new Player(name); 
		
		System.out.println("���������2������");
		
		name = console.next();
		Player player2 = new Player(name);
		
		System.out.println("�����������ʼ��Ϸ...");
		
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
				System.out.println(player1.getsName() + "��ʤ,���������ǣ�"  );
				player1.showCard();
				player2.showCard();
			}else{
				System.out.println(player2.getsName() + "��ʤ,���������ǣ�"  );
				player1.showCard();
				player2.showCard();
			}

			
			do{
				System.out.println("���롱y����������n���˳���");
				 str = console.next();
			}while((str.equals("y") || str.equals("n"))==false);
			
		}while(str.equals("y"));
	}

}

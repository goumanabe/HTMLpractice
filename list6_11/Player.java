package list6_11;

import java.util.Random;
import java.util.Scanner;

public class Player {

		private int jankenHand;
		private int playerId;

		public Player(int Hand,int Id) {
			this.jankenHand = Hand;
			this.playerId = Id;
		}

		void choiceHand(int Hand){
			Scanner std = new Scanner(System.in);
			do{
				System.out.println("あなたの手を選んでください。グー=0、チョキ=1、パー=2");
				jankenHand = std.nextInt();
				}while(jankenHand!=0&&jankenHand!=1&&jankenHand!=2);
		}

		void choiceHand(){
			Random rand = new Random();
			jankenHand = rand.nextInt(3);
		}

		int getHand(){
			return jankenHand;
		}

}

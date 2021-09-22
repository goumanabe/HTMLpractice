package list6_11;
import java.util.Scanner;

public class Referee {
	void janKenPon(Player player,Player com){
		System.out.println("じゃん、けん、ぽん！！");
		String[] hand = {"グー","チョキ","パー"};
		System.out.println("私の手は、"+hand[com.getHand()]+"です。あなたの手は"+hand[player.getHand()]+"です");
	}

	void judgement(Player player,Player com){
		int judge = (player.getHand()-com.getHand()+3)%3;
		switch (judge) {
		case 0:System.out.println("--------------"); System.out.println("引き分けです。またやりましょう。");System.out.println("--------------");  break;
		case 1:System.out.println("--------------"); System.out.println("あなたの負けです。ざまあ");System.out.println("--------------");  break;
		case 2:System.out.println("--------------"); System.out.println("あなたの勝ちです。まあまぐれですが。"); System.out.println("--------------"); break;
		}
	}

	boolean isRetry() {
		System.out.println("もう一度やりますか？？YES=1/NO=以外");
		Scanner std = new Scanner(System.in);
		int r = std.nextInt();
		if(r==1)return true;
		else return false;
	}

}

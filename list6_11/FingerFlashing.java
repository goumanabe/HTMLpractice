package list6_11;

public class FingerFlashing {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player manabe = new Player(0,0);
		Player com = new Player(0,1);
		Referee ref = new Referee();

		do {
		manabe.choiceHand(0);
		com.choiceHand();

		ref.janKenPon(manabe,com);
		ref.judgement(manabe, com);
		if(ref.isRetry()==true)continue;
		else break;

		}while(true);
		System.out.println("終わりです、さようなら！");
	}

}

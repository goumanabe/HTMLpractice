package firstmarubatu;
import java.util.Scanner;

public class marutobatu {
	static void setumei() {
		System.out.println("~~~~~OXゲーム~~~~~\r\n" +"（１）３×３の碁盤がある\r\n" +"（２）O側が先行、X側が後攻とする。\r\n" +"（３）碁盤に対して、交互にOあるいはXを置く\r\n" +"（４）タテ・ヨコ・ナナメの方向に対して、先に３つOあるいはXを置くことができれば勝ち\r\n" +"\r\n" +"　それでは早速、ゲームスタート\r\n");
	}

	static void masu(String[][] retu) {
		for(int i =0; i < 3;i++) {
			for(int j =0; j < 3;j++) {
				if(retu[i][j]== null) {
					retu[i][j]= "";
				}
			}
		}

		System.out.println("  | 1 | 2 | 3 |");
		System.out.println("--+---+---+---+");
		System.out.println("1 | "+retu[0][0] +" | "+retu[1][0] +"  | "+retu[2][0] +"  |");
		System.out.println("--+---+---+---+");
		System.out.println("2 | "+retu[0][1] +" | "+retu[1][1] +"  | "+retu[2][1] +"  |");
		System.out.println("--+---+---+---+");
		System.out.println("3 | "+retu[0][2] +" | "+retu[1][2] +"  | "+retu[2][2] +"  |");
		System.out.println("--+---+---+---+");
	}

	static int addX(int x) {
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("X方向>");
			x = stdIn.nextInt();
		}while(x<1 || x>3);

		return x;
	}
	static int addY(int y) {
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("y方向>");
			y = stdIn.nextInt();
		}while(y<1 || y>3);

		return y;
	}

	static int syouhai(String[][] retu) {
		int x =0;
		for(int i =0; i < 3;i++) {
//			if(retu[i][0] =="o" &&retu[i][1] =="o" &&retu[i][2] =="o" ||retu[0][i] =="o" &&retu[1][i] =="o" &&retu[2][i] =="o" ||retu[i][i] =="o" &&retu[i+1][i+1] =="o" &&retu[i+2][i+2] =="o" )
//			{System.out.println("O様！あなたの勝ちです");x =1;break;}
//
//			if(retu[i][0] =="x" &&retu[i][1] =="x" &&retu[i][2] =="x" ||retu[0][i] =="x" &&retu[1][i] =="x" &&retu[2][i] =="x" ||retu[i][i] =="x" &&retu[i+1][i+1] =="x" &&retu[i+2][i+2] =="x")
//			{System.out.println("x様！あなたの勝ちです");x =1;break;}
			if(retu[i][0].equals("o") &&retu[i][1].equals("o") &&retu[i][2].equals("o") ||retu[0][i].equals("o") &&retu[1][i].equals("o") &&retu[2][i].equals("o") ||retu[i][i].equals("o") &&retu[i+1][i+1].equals("o") &&retu[i+2][i+2].equals("o") )
			{System.out.println("O様！あなたの勝ちです");x =1;break;}

			if(retu[i][0].equals("x") &&retu[i][1].equals("x")  &&retu[i][2].equals("x")  ||retu[0][i].equals("x")  &&retu[1][i].equals("x")  &&retu[2][i].equals("x")  ||retu[i][i].equals("x")  &&retu[i+1][i+1].equals("x")  &&retu[i+2][i+2].equals("x") )
			{System.out.println("x様！あなたの勝ちです");x =1;break;}
			if(retu[i][0] !="" &&retu[i][1] !="" &&retu[i][2] !=""&&retu[0][i] !="" &&retu[1][i] !="" &&retu[2][i] !=""&&retu[i][i] !="" &&retu[i+1][i+1] !="" &&retu[i+2][i+2] !=""){
				System.out.println("引き分けです");x =1;break;
				}
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
//		Random rand = new Random();
		String [][] retu= new String[3][3];
		setumei();
		masu(retu);
		int a=0;
		int b=0;


		do {
			do {
				System.out.println("Oのターン");
				int x= addX(a)-1;
				int y =addY(b)-1;
				if(retu[x][y] == null || retu[x][y] !="x" && retu[x][y] !="o" ) {
					System.out.println("(x,y)=("+(x+1)+","+(y+1)+")"+":こちらでよろしいですか？ YES=1//NO=0");
					retu[x][y] ="#";
					masu(retu);
				int t = stdIn.nextInt();
					if(t==1) {
						retu[x][y] ="o";
						masu(retu);
						break;
					}
				}
				System.out.println("別の場所を選んでください！");
			}while(true);
			int q =syouhai(retu);
			if(q==1) {break;}

			do {
				System.out.println("xのターン");
				int x= addX(a)-1;
				int y =addY(b)-1;
				if(retu[x][y] == null ||  retu[x][y] !="o" && retu[x][y] !="x") {
					System.out.println("(x,y)=("+(x+1)+","+(y+1)+")"+":こちらでよろしいですか？ YES=1//NO=0");
					retu[x][y] ="#";
					masu(retu);
					int t = stdIn.nextInt();
					if(t==1) {
						retu[x][y] ="x";
						masu(retu);
						break;
					}
				}
				System.out.println("別の場所を選んでください！");
			}while(true);
			int p =syouhai(retu);
			if(p==1) {break;}
		}while(true);
	}

}

package com.original_game.janken;
 
public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand,int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if (playerHand == computerHand) {
			Panel.headerLabel.setText("あいこ！（" + point + "）");
		}
		else if ((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			point+=1;
			Panel.headerLabel.setText("勝ち！（" + point + "）");
		}			
		else {
			point=0;
			Panel.headerLabel.setText("負け！（" + point + "）");
		}
	}
}
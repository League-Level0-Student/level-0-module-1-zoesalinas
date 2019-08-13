package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog("I am tall when I am young and short when I am old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equalsIgnoreCase("a candle")) {
	JOptionPane.showMessageDialog(null, "correct, you are a genius");
	score+= 1_000_000;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is a candle");
}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "This is your score"+ score);
	}
}


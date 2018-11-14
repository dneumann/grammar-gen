package dn;

import java.util.List;

public class Sentence {

	public String beginning = "";
	public AkkuDativ akkuDativ;
	public String ending = "";
	
	public Sentence(List<Word> wordList) {
		boolean passedAkkuDativ = false;
		for (Word word : wordList) {
			if (word instanceof AkkuDativ) {
				akkuDativ = (AkkuDativ) word;
				passedAkkuDativ = true;
			} else if (!passedAkkuDativ) {
				beginning += word.w + " ";
			} else if (passedAkkuDativ) {
				ending += word.w + " ";
			}
		}
	}
}

package dn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SentenceGenerator {
	
	private List<Word> definiteArticlesNomi = new ArrayList<>();
	private List<Word> nounsMasc = new ArrayList<>();
	private List<Word> nounsFem = new ArrayList<>();
	
	public SentenceGenerator() {
		definiteArticlesNomi.add(new Word("Der", nounsMasc));
		definiteArticlesNomi.add(new Word("Die", nounsFem));
		nounsMasc.add(new Word("Mensch", null));
		nounsMasc.add(new Word("Hund", null));
		nounsFem.add(new Word("Frau", null));
		nounsFem.add(new Word("Katze", null));
	}

	public List<Word> getAkkuSentence() {
		randomize();
		List<Word> sentence = new ArrayList<>();
		addWord(definiteArticlesNomi.get(0), sentence);
		return sentence;
	}

	private void randomize() {
		Collections.shuffle(definiteArticlesNomi);
		Collections.shuffle(nounsMasc);
		Collections.shuffle(nounsFem);
	}
	
	private void addWord(Word word, List<Word> sentence) {
		sentence.add(word);
		if (word.nextList != null) {
			addWord(word.nextList.get(0), sentence);
		}
	}

}

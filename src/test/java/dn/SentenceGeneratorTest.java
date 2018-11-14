package dn;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SentenceGeneratorTest {

	private SentenceGenerator gen = new SentenceGenerator();

	@Test
	public void test() {
		for (int i = 0; i <= 30; i++) {
			List<Word> sentence = gen.getSentence();

			System.out.println(getHint(sentence));
			System.out.println();
			for (Word w : sentence) {
				if (w instanceof AkkuDativ) {
					System.out.print("______ ");
				} else {
					System.out.print(w.w + " ");
				}
			}
			System.out.println("\t\t\t" + getAkkuDativ(sentence));
			System.out.println();
			System.out.println();
		}
	}

	private String getHint(List<Word> sentence) {
		for (Word w : sentence) {
			if (w instanceof AkkuDativ) {
				return ((AkkuDativ) w).hint;
			}
		}
		return null;
	}

	private String getAkkuDativ(List<Word> sentence) {
		for (Word w : sentence) {
			if (w instanceof AkkuDativ) {
				return w.w;
			}
		}
		return null;
	}

}

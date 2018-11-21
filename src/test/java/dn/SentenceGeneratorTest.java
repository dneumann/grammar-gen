package dn;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceGeneratorTest {

	private SentenceGenerator gen = new SentenceGenerator();

	@Test
	public void test() {
		for (int i = 0; i <= 30; i++) {
			Sentence sentence = gen.getSentence();

			System.out.println(sentence.akkuDativ.hint);
			System.out.println();
			System.out.print(sentence.beginning);
			System.out.print("_______ ");
			System.out.print(sentence.ending);
			System.out.println("\t\t\t" + sentence.akkuDativ.w);
			System.out.println();
			System.out.println();
		}
	}

	@Test
	public void dativ() {
		for (int i = 0; i <= 30; i++) {
			Sentence sentence = gen.getDativSentence();

			System.out.println(sentence.akkuDativ.hint);
			System.out.println();
			System.out.print(sentence.beginning);
			System.out.print("_______ ");
			System.out.print(sentence.ending);
			System.out.println("\t\t\t" + sentence.akkuDativ.w);
			System.out.println();
			System.out.println();
		}
	}

}

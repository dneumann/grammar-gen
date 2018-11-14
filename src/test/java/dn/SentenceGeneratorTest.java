package dn;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceGeneratorTest {

	private SentenceGenerator gen = new SentenceGenerator();
	
	@Test
	public void test() {
		for (Word w : gen.getAkkuSentence()) {
			System.out.print(w.w + " ");
		}
	}

}

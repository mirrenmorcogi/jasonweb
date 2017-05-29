package MathPhraseParser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathPhraseParserTest {

	@Test
	public void testMathPhraseParserBasic() {
		assertEquals(75.0, Double.parseDouble(new MathPhraseParser("5+(9+1)*7)").getResult()),0.0);
	}
	@Test
	public void testMathPhraseParser() {
		assertEquals(120.1, Double.parseDouble(new MathPhraseParser("5! + abs(6-7*7) / ((9+1)*7)").getResult()),0.0);
	}

}

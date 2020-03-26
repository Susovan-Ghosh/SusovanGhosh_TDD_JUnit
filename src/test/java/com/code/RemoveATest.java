package com.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class RemoveATest {
	/*
	 *TODO List:-
	 *1. Character 1 : ""->""
	 *2. Character 1 : "A"->""
	 *3. Character 1 : "B"->"B"
	 *4. Character 2 : "AA"->""
	 *5. Character 2 : "AB"->"B"
	 *6. Character 2 : "BA"->"B"
	 *7. Character 4 : "ABCD"->"BCD"
	 *8. Character 4 : "AACD"->"CD"
	 *9. Character 4 : "BACD"->"BCD"
	 *10. Character 4 : "BBAA"->"BBAA"
	 *11. Character 5 : "AABAA"->"BAA"
	 *12. Character 5 : "ABBAA"->"BBAA" 
	 */
	RemoveA obj;
	@BeforeEach
	void objectFactory() {
		obj=new RemoveA();
	}
	@Test
	void test1char1() {
		assertEquals("",obj.remove(""));
	}
	@Test
	void test2char1() {
		assertEquals("",obj.remove("A"));
	}
	@Test
	void test3char1() {
		assertEquals("B",obj.remove("B"));
	}
	@Test
	void test4char2() {
		assertEquals("",obj.remove("AA"));
	}
	@Test
	void test5char2() {
		assertEquals("B",obj.remove("AB"));
	}
	@Test
	void test6char2() {
		assertEquals("B",obj.remove("BA"));
	}
	@Test
	void test7char4() {
		assertEquals("BCD",obj.remove("ABCD"));
	}
	@Test
	void test8char4() {
		assertEquals("CD",obj.remove("AACD"));
	}
	@Test
	void test9char4() {
		assertEquals("BCD",obj.remove("BACD"));
	}
	@Test
	void test10char4() {
		assertEquals("BBAA",obj.remove("BBAA"));
	}
	@Test
	void test11char5() {
		assertEquals("BAA",obj.remove("AABAA"));
	}
	@Test
	void test12char5() {
		assertEquals("BBAA",obj.remove("ABBAA"));
	}
}
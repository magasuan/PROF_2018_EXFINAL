package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Vector;

import org.junit.Test;

public class GreetingTest {

	public abstract class MyCalendar extends Calendar {
		MyCalendar calendar = (MyCalendar) MyCalendar.getInstance();
		int hour = 15;
		}
	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}

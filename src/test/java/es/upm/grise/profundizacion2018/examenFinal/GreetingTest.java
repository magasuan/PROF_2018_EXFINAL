package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Vector;

import org.junit.Test;


public class GreetingTest {
	//No hace falta MyCalendar
//	public abstract class MyCalendar extends Calendar {
//	}
	private final Greeting greeting = spy(new Greeting());
	@Test
	public void smokeTest1() {
		when(this.greeting.getHora()).thenReturn(8);
		assertEquals("Good morning", greeting.getGreeting(null));
	}

	@Test
	public void smokeTest2() {
		when(this.greeting.getHora()).thenReturn(8);
		//Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}

	@Test
	public void smokeTest3() {
		// 8 de la mañana
		when(this.greeting.getHora()).thenReturn(8);
		//Greeting greeting = new Greeting();
		assertEquals("Buenos dÃ­as", greeting.getGreeting(Language.SPANISH));
	}
	@Test
	public void smokeTestPruebaTarde() {
		// Prueba para comprobar que funciona por la tarde
		when(this.greeting.getHora()).thenReturn(14);
		//Greeting greeting = new Greeting();
		assertEquals("Buenas tardes", greeting.getGreeting(Language.SPANISH));
	}

	@Test
	public void smokeTest4() {
		this.greeting.getGreeting(null);
		verify(this.greeting,times(1)).getDefaultLanguage();
		verify(this.greeting,times(1)).getMessage(TimeOfTheDay.AFTERNOON, Language.ENGLISH);
	}
	
	@Test
	public void smokeTest5() {		
		greeting.getGreeting(Language.SPANISH);
		verify(this.greeting,never()).getDefaultLanguage();
		verify(this.greeting,times(1)).getMessage(TimeOfTheDay.AFTERNOON, Language.SPANISH);
	}
}

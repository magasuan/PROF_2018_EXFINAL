package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Vector;

import org.junit.Test;


public class GreetingTest {
	//No hace falta MyCalendar
//	public abstract class MyCalendar extends Calendar {
//		//MyCalendar calendar = (MyCalendar) MyCalendar.getInstance();
//		private int hora;
//		public MyCalendar(int hora) {
//			hora = hora;
//		}
//		public int getHora() {
//			return hora;
//		}
//	}
	private final Greeting greeting = spy(new Greeting());
	@Test
	public void smokeTest1() {
		//MyCalendar calendario = mock(MyCalendar.class);
		//when(calendario.getHora()).thenReturn(3);
		
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

//	@Test
//	public void smokeTest4() {
//		MyCalendar calendario = mock(MyCalendar.class);
//		when(calendario.getHora()).thenReturn(3);
//		Greeting greeting = new Greeting();
//		assertEquals("Good morning", greeting.getGreeting(null));
//	}
}

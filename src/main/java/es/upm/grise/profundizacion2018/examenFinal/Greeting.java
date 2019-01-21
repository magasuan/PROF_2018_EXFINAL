package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class Greeting {
	
	public String getGreeting( Language language ) {
		// Get current hour
		//Creado metodo para crear la hora
		int hour = getHora();
		
		// Find out the greeting language
		if ( language == null )
			language = getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return getMessage( moment, language );
	}
	
	int getHora() {
		return getCalendar().get( Calendar.HOUR_OF_DAY );
	}
	String getMessage(TimeOfTheDay m, Language l) {
		return Message.getMessage( m, l );
	}

	Language getDefaultLanguage() {
		return Message.getDefaultLanguage();
	}

	Calendar getCalendar() {
		return Calendar.getInstance();
	}

}

package com.sapient.test;
import java.util.logging.Level;
import java.util.logging.Logger;

class Light {
  public static void main(String[] args) {
	  
	  Logger log = Logger.getLogger(Light.class.getName());

    int lightspeed;
		long days;
		 long seconds;
		 long distance;
		// approximate speed of light in miles per second
		lightspeed = 186000;

		days = 1000; // specify number of days here

        seconds = days * 24 * 60 * 60; // convert to seconds

		distance = lightspeed * seconds; // compute distance
		if (log.isLoggable(Level.FINE))
		{
		log.fine("In " + days); // NOPMD by mku106 on 8/21/15 3:47 PM
		}
		log.log(Level.INFO," days light will travel about ");
		log.log(distance + " miles.");
	}
}




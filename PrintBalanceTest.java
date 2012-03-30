
import static org.junit.Assert.*;

import org.junit.Test;



public class PrintBalanceTest {
	
	@Test
	public void testGetsInput(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.language, arg[0]);
		assertEquals(PrintBalance.country, arg[1]);
		assertEquals(PrintBalance.name, arg[2]);
	}

	@Test
	public void testEnglishGreeting(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.greeting, "Hello World");
	}
	
	@Test
	public void testEnglishGetName(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.getName, "Please enter your name ");
	}
	
	@Test
	public void testEnglishMeet(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.meet, "I am pleased to meet you ");
	}
	
	@Test
	public void testEnglishAsOf(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.asOf, "As of : ");
	}
	
	@Test
	public void testEnglishOwe(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.owe, "You owe the school ");
	}
	
	@Test
	public void testEnglishFarewell(){
		String[] arg = new String[3];
		arg[0] = "en"; arg[1] = "US"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.farewell, "Goodbye");
	}
	
	@Test
	public void testFrenchGreeting(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.greeting, "Bonjour tout le monde");
	}
	
	@Test
	public void testFrenchGetName(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.getName, "S'il vous plait entrer votre nom ");
	}
	
	@Test
	public void testFrenchMeet(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.meet, "Je suis heureux de vous rencontrer ");
	}
	
	@Test
	public void testFrenchAsOf(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.asOf, "En date du : ");
	}
	
	@Test
	public void testFrenchOwe(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.owe, "Vous devez l'ecole ");
	}
	
	@Test
	public void testFrenchFarewell(){
		String[] arg = new String[3];
		arg[0] = "fr"; arg[1] = "FR"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.farewell, "Au revoir");
	}
	
	@Test
	public void testGermanGreeting(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.greeting, "Hallo Welt");
	}
	
	@Test
	public void testGermanGetName(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.getName, "Bitte geben sie ihren namen ");
	}
	
	@Test
	public void testGermanMeet(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.meet, "Ich freue mich, sie kennen zu lernen ");
	}
	
	@Test
	public void testGermanAsOf(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.asOf, "Stand : ");
	}
	
	@Test
	public void testGermanOwe(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.owe, "Sie schulden die Schule ");
	}
	
	@Test
	public void testGermanFarewell(){
		String[] arg = new String[3];
		arg[0] = "de"; arg[1] = "DE"; arg[2] = "Tyler Shelton";
		PrintBalance.main(arg);
		assertEquals(PrintBalance.farewell, "Auf wiedersehen");
	}
}

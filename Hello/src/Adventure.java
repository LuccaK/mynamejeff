
import java.util.Scanner;
import java.util.Random;
public class Adventure 
{
     
	public static void speak(String input) 
	{
		System.out.println(input);
	}
	
    public static void main(String[] args) 
    {
        Random randomGenerator = new Random();
     
        int playerLevel = 1;
        String playerName = "Horatio";
        double playerHealth = 10.0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your player's name?");
        playerName = userInput.nextLine();
        speak("Welcome " + playerName + "!");
        speak("Before you is a humongo dungeon");
        speak("1. Enter the humongo dungeon.");
        speak("2. Run away like a coawrd.");
        int playerChoice;
        playerChoice = userInput.nextInt();
        if(playerChoice == 1) 
        {
            
        	speak("You made it inside the dungeon.");
            playerLevel++;
            System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);
             
            speak("You vengence deeper into da dungeon. You feel a chill coming down your spine...");
            speak("It's a evil fan! Suddenly, you're being meme'd by fans of all kind!");
            int rockDamage;
            rockDamage = randomGenerator.nextInt(5);
            playerHealth -= rockDamage;
            speak("Da fan blows air on you! It hits you for " + rockDamage + "!");
            speak("You have " + playerHealth + " health remaining.");
           
            System.out.println("You pick yourself up.. and brush fan scraps off from your clothes.");
            System.out.println("You walk deeper into the worm mouth andd come acress something strange..");
            System.out.println("Before you is a pack of pokemon cards.");
        
            boolean hasSword = false;
            System.out.println("1. Open the pack.");
            System.out.println("2. Ignore the pack. You will pull garbo.");
            playerChoice = userInput.nextInt();
             

            if(playerChoice == 1){
                System.out.println("You open the pack and pull 3 commons!");
                hasSword = true;
            }
             
            System.out.println("You leave the opned pack on the ground and walk away slowly.");
            System.out.println("Up ahead you see something hidden.");
            System.out.println("Peeking around a corner you see a lvl 5000 pidgey.");
            System.out.println("You swallow hard and decide it is time to leave.");
            System.out.println("As y		ou turn your foot finds a rock. It thuds loudly against the cave wall. The pidgey wakes up!");
             
            System.out.println("1. Fight the pidgey.");
            System.out.println("2. Run for your life.");
            playerChoice = userInput.nextInt();
            if(playerChoice == 1)
            {
         
                System.out.println("You feel courage surge through your body as you charge the pidgey!");
                if(hasSword)
                {
                    System.out.println("You raise the crummpy pokemon cards and plunge it into the pidgey doing less to none dmg.");

                    System.out.println("1. Try for a crit.");
                    System.out.println("2. Run for your life.");
                    playerChoice = userInput.nextInt();
                    if(playerChoice == 1)
                    {
                 
                        System.out.println("You get a crit!");
                    }
                    else 
                    {
                    System.out.println("Although your cards suck, pidgey is like the worst pokemon in the game so it faints!");
                    speak("1. Keep going.");
                    speak("2. Run away like a coawrd.");
                    if(playerChoice == 1)
                    {
                    	playerChoice = userInput.nextInt();
                    	if(playerChoice == 1) 
     
                System.out.println(playerName + " runs home and goes to sleep.");
                System.exit(0);
            }
             
        }
    }

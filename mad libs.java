import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        String name = console.readLine("Enter your name:  ");
        String noun = console.readLine("Enter a noun:  ");
        String pronoun = console.readLine("Enter a pronoun:  ");
        String thing = console.readLine("Enter a noun:  ");
        String thing2 = console.readLine("Enter a noun:  ");
        String adjective = console.readLine("Enter an adjective:  ");      
        String time = console.readLine("Enter an amount of time:  ");
        String verb = console.readLine("Enter a verb:  ");      
        String verb2 = console.readLine("Enter a verb:  ");
        console.printf("Once upon a time there was a %s %s named %s. \n %s liked %s and %s. Every %s, %s would %s and %s. \n %s was everyone's favorite %s. ", adjective, noun, name, pronoun, thing, thing2, time, pronoun, verb, verb2, name, noun );
    }
    
}
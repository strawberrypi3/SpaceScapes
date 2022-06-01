import java.util.*;
import java.lang.*;

public class Game {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      Move[] moveset = new Move[5]; // Player will have 4 moves in their moveset
      
      // Cures self by 100 HP:
      moveset[0] = new Move(0, 100, 1.0, 0.5, "Cure");
      
      // High chance of poison, can also deal 20 HP of damage:
      moveset[1] = new Move(1, -20, 0.5, 0.8, "Snakebite");
      
      // High chance of dealing 100 damage to enemy, very small chance of poison:
      moveset[2] = new Move(1, -100, 0.8, 0.1, "Punch"); 
      
      moveset[3] = new Move(2, 0, 0.0, 1.0, "Speak Pig Latin"); // Confuses enemy
      
      moveset[4] = new Move(3, 0, 0.0, 1.0, "Read \"Design Patterns: Elements of Reusable " + 
            "Object-Oriented Software (1st Edition)\""); // Makes enemy tired
      
      
      Move[] frankensteinMoveset = new Move[2]; // Frankenstein will have 2 moves in his moveset
      frankensteinMoveset[0] = new Move(0, -50, 1.0, 0.0, "Smack"); // Deals 50 damage to opponent
      
      
      // Creates a player named Bill Murray with 200 HP, 50 speed, and the moveset from above:
      Entity player = new Entity("Bill Murray", 200, 50, moveset);       
      
      // Creates an enemy named Frankenstein with 100 HP, 40 speed, and frankensteinMoveset:
      Entity enemy = new Entity("Frankenstein", 100, 40, frankensteinMoveset); 
      
      
      // Create a new display window:
      GameWindow window = new GameWindow(player);
      
      // Intro text:
      window.write("Quick, harold! Hide your pain!");
      
      // Add arena background:
      window.setBackground("assets/hidethepainharold.jpg");
      
      // Add frankenstein.png to foreground at desired coordinates/size:
      //window.setForeground("assets/hidethepainharold.jpg", 25, 80, 500, 500);
      
      // Cause battle to occur against enemy (Frankenstein):
      window.doBattle(enemy, console);
      
      window.addButton("Hello");
   }
}
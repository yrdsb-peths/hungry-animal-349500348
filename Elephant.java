import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, the player character.  
 * 
 * @author Ostin Hui
 * @version May 2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elephant()
    {
        for(int i = 0; i < 8; i++)
        {
            idle[i] = new GreenfootImage("image/elephant_idle/idle" + i + " .png");
        }
        setImage(idle[0]);
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        eat();
        
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            elephantSound.play();
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.createApple();
        }
    }
}

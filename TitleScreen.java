import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Title Screen.
 * 
 * @author Ostin Hui
 * @version 5/21/24
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    Label startLabel = new Label("Press Space to Start", 30);
    Label controlLabel = new Label("Use Arrow Keys to Move Left and Right", 30);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(startLabel, getWidth()/2, getHeight()/2 + 50);
        addObject(controlLabel, getWidth()/2, getHeight()/2 + 100);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,537,200);
        elephant.setLocation(547,203);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3);
        }   
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3 );
        }    
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +3, getY() );
        }    
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -3, getY() );
        }  
        detectWallCollision();
    }


    public void detectWallCollision()
    {
        if (isTouching(wall.class))
        {
            removeTouching(robot.class);
            Greenfoot.stop();
        }
                if (isTouching(block.class))
        {
            removeTouching(robot.class);
            Greenfoot.stop();
        }
    }
}

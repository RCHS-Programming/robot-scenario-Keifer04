import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int lives;
    private int pizzaEaten;
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        robotimage1 = new GreenfootImage ("man01.png");
        robotimage2 = new GreenfootImage ("man02.png");
        setImage (robotimage2);
        lives = 3;
        pizzaEaten = 0;
        
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
        eatPizza();
        switchImage();
        house();
        showStatus();
    }


    public void detectWallCollision()
    {
        if (isTouching(wall.class))
        {
            removeTouching(robot.class);
            Greenfoot.playSound("hurt.wav");
            setLocation( 100, 100);
        }
                if (isTouching(block.class))
        {
            removeTouching(robot.class);
            Greenfoot.playSound("hurt.wav");
            setLocation(100, 100);
        }
    }
    
    public void eatPizza()
    {
        if (isTouching(pizza.class))
        {
          Greenfoot.playSound("eat.wav");
          removeTouching(pizza.class);
          pizzaEaten = 0; 
          
          
          
        }
    }
    
    public void house()
    {
        if (isTouching(house.class))
        {
            Greenfoot.stop();
        }
    }
    public void switchImage()
    {
       {
        if (getImage() == robotimage1)
       {setImage (robotimage2);}
       else
       {setImage (robotimage1);}
    }  
    }
    
    public void showStatus()
    {
        //getWorld().showText("lives : "+lives, 70,540);
        //getWorld().showText("Pizza : "+pizzaEaten, 70, 560);
    }
}

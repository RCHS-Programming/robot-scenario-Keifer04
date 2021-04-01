import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robotWorld extends World
{

    /**
     * Constructor for objects of class robotWorld.
     * 
     */
    public robotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new robot(), 100, 100);
       
        addObject(new wall(), 50, 300);
        addObject(new wall(), 200, 300);
        addObject(new wall(), 100, 300);
        addObject(new wall(), 300, 300);
        addObject(new wall(), 800, 300);
        addObject(new wall(), 700, 300);
        addObject(new wall(), 600, 300);
        addObject(new wall(), 100, 300);
        addObject(new house(), 750, 550);
        addObject(new pizza(), 100, 550);
        addObject(new pizza(), 400, 500);
        addObject(new pizza(), 700, 400);
        addObject(new pizza(), 330, 100);
        addObject(new pizza(), 600, 500);
        addObject(new pizza(), 500, 500);
        addObject(new pizza(), 450, 300);
        addObject(new block(), 450, 300);
        addObject(new score(), 700, 100);
    }
}

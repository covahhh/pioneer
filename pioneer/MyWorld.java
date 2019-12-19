import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new enemy(), 500, 200 ); 
        addObject( new PLAYER(), 300, 200 );
    }
    
     public void act() 
    {
            GreenfootImage img1 = new GreenfootImage( "images/background1.png" );
            img1.scale(600,435);
            getBackground().drawImage( img1, 0, 0 );
    }    
}

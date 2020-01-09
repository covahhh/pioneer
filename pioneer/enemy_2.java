import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_2 extends Actor
{
    GifImage myGif = new GifImage("enemy_2.gif");
    /**
     * Act - do whatever the enemy_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( myGif.getCurrentImage() );
        int x = getX();
        int y = getY();
        setLocation( x-3,y );
    }    
}

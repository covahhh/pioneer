import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_1 extends Actor
{
    GifImage myGif = new GifImage("enemy_1.gif");
    int count=0,count2=1;
    /**
     * Act - do whatever the enemy_1 wants to do. This method is called whenever
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
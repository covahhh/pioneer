import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class treasure extends Actor
{
    private  GreenfootImage clear = null;
    /**
     * Act - do whatever the treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public treasure(){
        clear =  new GreenfootImage( "images/game_clear.png" );
    }
    public void act() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, PLAYER.class );
        if( actor != null ){
             setLocation( 300,200 );
            clear.scale(600,400);
            setImage(clear);
            Greenfoot.stop();
        }
    }    
}

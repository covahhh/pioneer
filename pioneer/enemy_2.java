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
    boolean firstf=false;
    int attack=0;
    public void act() 
    {
        int yp = PLAYER.y;
        int xp = PLAYER.x;
        
        setImage( myGif.getCurrentImage() );
       
        int x = getX();
        int y = getY();


        setLocation( x-2,y );

     
      
        

        if((xp<x+30)&&(xp>x-30))
        {   
            x=x-3;
            if(firstf==false)
            {
                if(y<yp) attack=10;         
                else      attack=-5;
                firstf=true;
            }
            y=y+attack;

        }
        else x=x-3;
        
        setLocation(x,y);

    }  

}

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
    GifImage myGif2 = new GifImage("enemy1_1r.gif");
    int count=0,count2=1;
    /**
     * Act - do whatever the enemy_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( myGif2.getCurrentImage() );
        setImage( myGif.getCurrentImage() );
        int yp = PLAYER.y;
        int xp = PLAYER.x;
        
        int x = getX();
        int y = getY();
<<<<<<< HEAD

=======
        
>>>>>>> 556cbbd339fc5b9c67aa56c2b282c343fdaf86ea
        int speed=1;
        //if     ((xp<x+5)&&(xp>x-5)) speed=2;
        //else                          speed=1;
        
        if(yp<y)        y=y-speed;
        else if(yp>y)   y=y+speed;
        
        if(xp<x)        
        {
            x=x-speed;
            setImage( myGif.getCurrentImage() );
        }
        else if(xp>x)
        {
            x=x+speed;
            setImage( myGif2.getCurrentImage() );
        }
        
<<<<<<< HEAD

        setLocation(x,y);
=======
        setLocation(x,y);

>>>>>>> 556cbbd339fc5b9c67aa56c2b282c343fdaf86ea
    }    
}

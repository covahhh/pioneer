import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0,count2=1;
    
    private  GreenfootImage left  = null;
    private  GreenfootImage right = null;
    
    public enemy()
    {
         left  =  new GreenfootImage( "images/enemy2.png" );
         right =  new GreenfootImage( "images/enemy3.png" );
        
    }
    
    
    public void act() 
    { 
        int x = getX();
        int y = getY();

            
  
            if(count2<=5)
            {
                setImage(right);
                if(count<6)setLocation( x,y+3 );
                else if(count<12)setLocation( x,y-3 );
                else if(count<24)setLocation( x-6,y );
                count++;
                if(count==24) 
                {
                    count=0;
                    count2++;
                }
            }
            else
            {
               setImage(left);
               if(count<6)setLocation( x,y+3 );
               else if(count<12)setLocation( x,y-3 );
               else if(count<24)setLocation( x+6,y );
               count++;
               if(count==24) 
                {
                    count=0;
                    count2++;
                    if(count2>10)count2=1;
                }
            }
        
           
    }    
}

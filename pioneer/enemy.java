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
    int jump=3;
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
        int yp = PLAYER.y;
        int xp = PLAYER.x;
        
            
  
            if(count2==0)
            {                
                if(count==48) 
                {
                   count=0;
                   if(xp>=x) count2=1;
                   if((xp<x+30)&&(xp>x-30)) 
                   {
                       if((yp-y)<=20) jump=10;
                       else           jump=30;
                       
                   }
                   else               jump=3;
                }
                
                setImage(right);
                if(count<6)setLocation( x,y-jump );
                else if(count<18)setLocation( x-5,y );
                else if(count<24)setLocation( x,y+jump );
                count++;
            }
            else
            {    
               if(count==48) 
               {
                   count=0;
                   if(xp<=x) count2=0;
                   if((xp<x+30)&&(xp>x-30)) 
                   {
                       if((y-yp)<=10) jump=10;
                       else           jump=30;
                       
                   }
                   else               jump=3;
               }
               
               setImage(left);
                if(count<6)setLocation( x,y-jump );
                else if(count<18)setLocation( x+5,y );
                else if(count<24)setLocation( x,y+jump );
               count++;
            }
        
           
    }    
}

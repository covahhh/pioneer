import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


//private ArrayList<PLAYER> usePlayer = new ArrayList<PLAYER>(0);
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Actor player = null;
    Actor enemy  = null;
    Actor enemy_1  = null;
    Actor enemy_2  = null;
    String[][] nowWorld = new String[2][2];
    int xW=0;
    int yW=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        enemy= new enemy();
        enemy_1=new enemy_1();
        enemy_2=new enemy_2();
        
        addObject( enemy_1, 500, 300 ); 
        addObject( enemy_2, 500, 100 ); 
                        
        player = new PLAYER();
        addObject( player, 300, 200 );

        GreenfootImage img1 = new GreenfootImage( "images/background1.png" );

        img1.scale(600,435);
        getBackground().drawImage( img1, 0, 0 );

    
    }
    
     public void act() 
    {
            int x = player.getX();
            int y = player.getY();
            
            if(x == 0){
                if(xW !=0){
                 GreenfootImage img = new GreenfootImage( "images/background4.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(598,y);
                 removeObject( enemy );
                 addObject( enemy_1, 500, 300 ); 
                 addObject( enemy_2, 500, 100 ); 
                 xW--;            
                }              
            }
            if(x == 599){
                if(xW !=1){
                 GreenfootImage img = new GreenfootImage( "images/background5.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(1,y);
                 addObject( enemy, 500, 200 ); 
                 removeObject( enemy_1 );
                 removeObject( enemy_2 );
                 xW++;
                }              
            }
                 

            showText( ""+x+","+y+","+xW, 100, 50 );
    }    
}

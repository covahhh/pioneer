import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER extends Actor
{
    private  GreenfootImage img_right1 = null;
    private  GreenfootImage img_hidari1 = null;
    private  GreenfootImage img_back1 = null;
    private  GreenfootImage img_kousin1 = null;
    int life=100;
    int count=0;
    static int x;
    static int y;
    static int h;
    static int h1;
    static int block[] =new int[4];
    
    public PLAYER()
    {
         img_right1 =  new GreenfootImage( "images/right1.png" );
         img_hidari1 =  new GreenfootImage( "images/hidari1.png" );
         img_back1 =  new GreenfootImage( "images/back1.png" );
         img_kousin1 =  new GreenfootImage( "images/kousin1.png" );
    }
    
    /**
     * Act - do whatever the PLAYER wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        x = getX();
        y = getY();
        int a =0;
        
        //getImage().scale( 100, 100 );
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+2,y );
            if(hit())
               setLocation( x,y );
            setImage(img_right1);
                     
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-2,y );
            if(hit())
               setLocation( x,y );
            setImage(img_hidari1);
           
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-2 );
            if(hit())
               setLocation( x,y );
            setImage(img_back1);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+2 );
           if(hit())
               setLocation( x,y );
           setImage(img_kousin1);
        }
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, enemy_1.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, enemy_2.class );
        
        if( actor != null ||actor2 != null||actor3 != null){
        if( life <= 0 ){  
            World game = new GAMEOVERWorld();
            Greenfoot.setWorld( game );
            //getWorld().showText( "GAME OVER", 300, 300 );
            Greenfoot.stop();
         }else{
            life--;
         }
        }
    
        String s=String.valueOf(life);
        getWorld().showText( "HP"+s, 100, 350 );
      }  
      
      
       public boolean hit(){
         Actor actorB1 = getOneIntersectingObject(Block.class );
      if(actorB1 != null){
           return true;
        }
        return false;
    }
       
}    
 
    


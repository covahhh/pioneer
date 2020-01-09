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
        
        int x = getX();
        int y = getY();
        //getImage().scale( 100, 100 );
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+2,y );
            setImage(img_right1);
                     
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-2,y );
            setImage(img_hidari1);
           
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-2 );
            setImage(img_back1);
           
            
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setLocation( x,y+2 );
           setImage(img_kousin1);
          
        }
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
        
        if( actor != null ){
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
       
       
}    
        
       /* if(getX() == 0 || getX() == 400){
            
        }*/
            
 
    


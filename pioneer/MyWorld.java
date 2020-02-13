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
    Actor treasure = null;
    Actor enemy_1  = null;
    Actor enemy_1_2  = null;
    Actor enemy_1_3  = null;
    Actor enemy_2  = null;
    Actor enemy_2_2  = null;
    Actor enemy_2_3  = null;
    Actor block1[] = {null,null,null,null,null,null,null,null,null,null};
    String[][] nowWorld = new String[2][2];
    int xW=0;
    int yW=0;
    boolean ene2set= true;
    boolean ene2_2set= true;
    boolean ene2_3set= true;
    GreenfootSound bgSound1 = new GreenfootSound("sounds/bgm_maoudamashii_8bit27.mp3");
    GreenfootSound bgSound2 = new GreenfootSound("sounds/Battle-Unison.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
<<<<<<< HEAD
<<<<<<< HEAD

       
=======
        treasure=new treasure();
>>>>>>> 5d39885627ff6615fc0e216af7e402d5ac1475fd
=======
        treasure=new treasure();
=======

       
>>>>>>> e80241da6c6a707baabd8a600ea6a8c23315c932
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
        enemy= new enemy();
        enemy_1=new enemy_1();
        enemy_1_2=new enemy_1();
        enemy_1_3=new enemy_1();
        enemy_2=new enemy_2();
        enemy_2_2=new enemy_2();
        enemy_2_3=new enemy_2();
        
        
        //addObject( enemy_1,   200, 400 ); 
        //addObject( enemy_1_2, 300, 200 ); 
        //addObject( enemy_1_3, 390, 390 );
        
        
        addObject( enemy_2, 500, 160 ); 
        addObject( enemy_2_2, 300, 150 );
        addObject( enemy_2_3, 440, 60 ); 
        
        player = new PLAYER();

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
        addObject( player, 300, 200 );

        for(int i = 0; i<5; i++){
           
                block1[i] = new Wood();
               
            
        }
<<<<<<< HEAD
=======
>>>>>>> 5d39885627ff6615fc0e216af7e402d5ac1475fd
=======
>>>>>>> e80241da6c6a707baabd8a600ea6a8c23315c932
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3

        addObject( player, 10, 200 );
        GreenfootImage img1 = new GreenfootImage( "images/background4.png" );

        addObject( player, 10, 200 );

        img1.scale(600,435);
        getBackground().drawImage( img1, 0, 0 );

<<<<<<< HEAD
 
=======
        bgSound2.stop();
        bgSound1.play();
>>>>>>> 5d39885627ff6615fc0e216af7e402d5ac1475fd
    }
    
     public void act() 
    {
            int x    = player.getX();
            int y    = player.getY();
            int enex=0; 
            int enex2=0; 
            int enex3=0; 
            if(ene2set==true)   enex  = enemy_2.getX();
            if(ene2_2set==true) enex2 = enemy_2_2.getX();
            if(ene2_3set==true) enex3 = enemy_2_3.getX();
            
            
            
            if(x == 0){
                if(xW !=0){
                 GreenfootImage img = new GreenfootImage( "images/background4.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(598,y);
                 removeObject( enemy );
<<<<<<< HEAD
<<<<<<< HEAD
=======
                 removeObject( treasure );
=======
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
                 
                 for(int i = 0; i<5; i++){
           
                //block1[i] = new Wood();
                removeObject(block1[i]);
                
            
                }
<<<<<<< HEAD
=======
                 removeObject( treasure );
>>>>>>> 5d39885627ff6615fc0e216af7e402d5ac1475fd
=======
>>>>>>> e80241da6c6a707baabd8a600ea6a8c23315c932
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
                 addObject( enemy_1, 500, 300 ); 
                 addObject( enemy_2, 500, 100 ); 
                 xW--;         
                 bgSound2.stop();
                 bgSound1.play();
                }              
            }
            if(x == 599){
                if(xW !=1){
                 GreenfootImage img = new GreenfootImage( "images/background5.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(1,y);
<<<<<<< HEAD
<<<<<<< HEAD
=======
                 
                 addObject( treasure, 500, 300 ); 
                 addObject( enemy, 500, 300 ); 
                 
                 removeObject( enemy_1 );
                 removeObject( enemy_2 );
                 removeObject( enemy_1_2 );
                 removeObject( enemy_2_2 );
                 removeObject( enemy_1_3 );
                 removeObject( enemy_2_3 );
=======
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
                // addObject( enemy, 500, 200 ); 
                 removeObject( enemy_1 );
                 removeObject( enemy_2 );
                 
                 for(int i = 0; i<5; i++){
                removeObject(block1[i]);
                }
                addObject(block1[0],160,130);
                addObject(block1[1],160,160);
                addObject(block1[2],180,180);
                addObject(block1[3],210,180);
                addObject(block1[4],240,180);
                 for(int i = 0; i<5; i++){
                block1[i] = new Wood();
                }
                addObject(block1[0],240,160);
                addObject(block1[1],240,130);
                addObject(block1[2],210,130);
                addObject(block1[3],180,130);
<<<<<<< HEAD
=======
                 
                 addObject( treasure, 500, 300 ); 
                 addObject( enemy, 500, 300 ); 
                 
                 removeObject( enemy_1 );
                 removeObject( enemy_2 );
                 removeObject( enemy_1_2 );
                 removeObject( enemy_2_2 );
                 removeObject( enemy_1_3 );
                 removeObject( enemy_2_3 );
>>>>>>> 5d39885627ff6615fc0e216af7e402d5ac1475fd
=======
>>>>>>> e80241da6c6a707baabd8a600ea6a8c23315c932
>>>>>>> af453d40555f6f25dba1e4ee180663ebcb4c55e3
                 xW++;
                 bgSound1.stop();
                 bgSound2.play();

                }              
            }
            
            if((enex==0)&&(ene2set==true))
            {
                removeObject( enemy_2 );
                ene2set=false;
            }
            if((enex2==0)&&(ene2_2set==true))
            {
                removeObject( enemy_2_2 );
                ene2_2set=false;
            }
            if((enex3==0)&&(ene2_3set==true))
            {
                removeObject( enemy_2_3 );
                ene2_3set=false;
            }
                 

            
    }    
}

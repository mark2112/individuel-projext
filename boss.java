import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
   // public static int sc ;
    int bbb ; 
    int i;
    int n = 6;
    int test = 5;
    int count ;
    int Step = 0;
    int hit ;
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updown();
        dash();
         hitboss();
         attack();
       }
        //setImage("1113758-ds2.png");
    
    public void updown(){
        
          setLocation(getX(),getY()-n);
       
        
        if(isAtEdge()){
            n=-n;
            
            
            
        }
       
    }
    public void dash(){
       test++;
       if(test%600==0){
           setImage("angry.png");
       }
       if(test%900==0){
           setImage("1113758-ds2.png"); 
           test=0;
       }
    }
     private void hitboss(){
     if(isTouching(bullet.class)){
        enemy1.score++;
         removeTouching(bullet.class);
         hit++;
         
         if(isTouching(beam.class)){
            hit+=10;
            }
        }if(hit>=100){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new scoreb());
            enemy1.score = 0;
        }
        
     }
     public void attack(){
    int x = 900;
    int y = Greenfoot.getRandomNumber(600);
     
        bbb++;
        
        if(bbb==900){
            getWorld().addObject(new bossbeam(),900,500);
            getWorld().addObject(new bossbeam(),y,x);
            getWorld().addObject(new bossbeam(),x,y);
            bbb=0;
            
        }
        
        
    }
    
        
        
    }
    
    

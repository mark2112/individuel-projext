import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy1 extends Actor
{
    public static int score = 0;
    public static int count = 0 ;
    /**
     * Act - do whatever the enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    setLocation(getX()-5, getY());
    Life();
    hit();
    try{
      if(isAtEdge()){
            getWorld().removeObject(this);
           
        }
    }catch(IllegalStateException e){
            
        }
     pop();  
     update();
       
    }

    public void hit(){
        if(isTouching(bullet.class)){
            //score++;
            removeTouching(bullet.class);
            count++;
            

            if(count>=3){
                getWorld().removeObject(this);
                
            }
        }
    }
     public void Life(){
        if(isAtEdge()){
        ((EasyWorld)getWorld()).removeLife();
        
            
        }
    
    }
    public enemy1(){
         if(getWorld() != null){
            Life();
        }
        
    }
    public void pop(){
      try{
        if(isTouching(beam.class)){
            getWorld().removeObject(this);
        }
    
      }catch(IllegalStateException e){
        
    }
  }
  public void update(){
     
      try{
      if(isAtEdge()||isTouching(bullet.class)){
        score++;
     } //getWorld().showText(""+score,getX()/2,getY()/2);
       
        
     
    }catch(IllegalStateException e){
    
    
    }
   
 }
}


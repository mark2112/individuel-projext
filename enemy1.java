import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy1 extends Actor
{
    public static int score ;
    public static int count ;
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
     //upscore();
       
    }

    public void hit(){
        if(isTouching(bullet.class)){
            count++;
            score++;
            removeTouching(bullet.class);
            
            

            if(count>=3){
                getWorld().removeObject(this);
                
            }
        }
    }
     public void Life(){
        if(isAtEdge()){
        ((Level)getWorld()).removeLife();
        
            
        
      }
    }
    public enemy1(){
        try{ 
        if(getWorld() != null){
            Life();
        }
     }catch(ClassCastException e){
        
} 
    }
    public void pop(){
      try{
        if(isTouching(beam.class)){
            score++;
            getWorld().removeObject(this);
        }
    
      }catch(IllegalStateException e){
        
    }
  }
  public void update(){
     
      try{
      if(isTouching(beam.class)){
        getWorld().removeObject(this);
     } //getWorld().showText(""+score,getX()/2,getY()/2);
       
        
     
    }catch(IllegalStateException e){
    
    
    }
   
 }
  public void upscore(){
      try{
      if(isTouching(bullet.class)){
        score++;
        
        }
    }catch(IllegalStateException e){
    
    }
}

}


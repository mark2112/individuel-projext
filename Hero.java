import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Hero extends Actor
{
    int bulletStep=0;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        catchKeyMove();
        catchKeyShoot();
        //Life();
    }
    private void catchKeyMove()
    {
      
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        }
    
}

    private void catchKeyShoot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            bulletStep++;
            if(bulletStep==20)
            {
                bullet b = new bullet();
                int posX = getX()+Math.floorDiv(getImage().getWidth(),2)+Math.floorDiv(b.getImage().getWidth(),2);
                getWorld().addObject(b, posX, getY());
                bulletStep=0;
            }
        }
    }
    public Hero(){
         if(getWorld() != null)
            Life();
    }
    public void Life(){
        if(isTouching(enemy1.class)){
        ((EasyWorld)getWorld()).removeLife();
        
            
        }
    }
    public void expol2(){
        if(isTouching(enemy2.class)){
            
        }
    }
}

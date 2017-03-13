import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skill extends Actor
{
    /**
     * Act - do whatever the skill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int skill = 900;
    public void act() 
    {
       chance();
    }
    public void chance(){
        skill++;
        if(Greenfoot.isKeyDown("z")&&skill>=900){
            skill = 0;
            setImage("skill2.png");
            getWorld().addObject(new beam(),10,300);
        }
        if(skill>=900){
            setImage("skill1.png"); 
        }  
        
    }
}

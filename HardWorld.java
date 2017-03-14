import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Write a description of class EasyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardWorld extends Level
{
    
     int compare;
    int skill;
   int dok;
    boolean n;
    int i ;
    int beam ;

    public HardWorld()
    {    
       super(1100,600, 1); 
       for(int i = 0; i < 5; ++i){
            lifes.addLast(new life());
        } 
       
       n=false;
       int offset = 127;
       for(life l : lifes){
            addObject(l, offset, 19);
            offset += 36;
        }
        addObject(new skill(),55,55);
       addObject(new Home(),1013,54);
        addObject(new Hero(),500,300);
       
       
    }
    public void act() {
        i++;
        if(i%100==0){
            randomEnemy1();
           if(dok<=30){
            dok++;
           }
           if(getObjects(bosshard.class).isEmpty()&&dok==30){
               dok=0;
               n=true;
            addObject(new bosshard(),1000,50);
           
           }
         
        }
        showText("score :"+enemy1.score,900,50);
        uplife();
        lose();
        
       
    }
    public void randomEnemy1(){
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(600);
        
        addObject(new enemy1(), x, y);
    }
    
    public void randomEnemy2(){
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(600);
        
        addObject(new enemy2(), x, y);
    }
    
    public void Skill(){
        skill++;
        if(skill>=900){
         if(Greenfoot.isKeyDown("z")){
           addObject(new beam(),10,300);
           skill=0;
         }
        }
        
        
    }
   
     public void uplife(){
       if(getObjects(life.class).isEmpty()){
           Greenfoot.setWorld(new scoreb());
           enemy1.score = 0;
        
           
        }  
    }
    public void lose(){
    if(getObjects(Hero.class).isEmpty()){
        Greenfoot.setWorld(new scoreb());
        
    
    }
   }
}
 







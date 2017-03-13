import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Write a description of class EasyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyWorld extends World
{
    int time = 120;
    public static int compare;
    int skill;
    public static int score = 0;
    boolean n;
    int i ;
    int life = 5;
    LinkedList<life> lifes = new LinkedList<>();
    public EasyWorld()
    {    
       super(1100,600, 1); 
       for(int i = 0; i < 5; ++i){
            lifes.addLast(new life());
        } 
        addObject(new Hero(),500,300);
       n=false;
       int offset = 127;
       for(life l : lifes){
            addObject(l, offset, 19);
            offset += 36;
        }
        addObject(new skill(),55,55);
       
       
       
    }
    public void act() {
        i++;
        if(i%100==0&&!n){
            randomEnemy1();
           if(score<=20){
            score++;
           }
           if(getObjects(boss.class).isEmpty()&&score==20){
               score=0;
               n=true;
           // addObject(new boss(),900,300);
           
           }
         
        }
        showText("time"+time,500,300);
        scoreb();
        /*if(i%100==0&&!n) {
            
            randomEnemy2();
        }*/
       
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
     public void removeLife()
    {
        try{
            life life_ = lifes.getLast();
            removeObject(life_);
           
            lifes.removeLast();
            life--;
            if(life == 0){
                Greenfoot.setWorld(new scoreb());
            }
        } catch(Exception e){
            e.printStackTrace();
        }
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
    public void scoreb(){
        compare++;
        if(compare%60==0){
            time--;
            if(time==0){
                Greenfoot.setWorld(new scoreb());
            
            }
        }
        

 }
}   







import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       followPlayer(); 
    }
    
    public void followPlayer()
    {
        //Defining what the player variable is and where to retrieve it 
       Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
       
       //Having enemy remain at consistent speed
       move(3); 
       
       //Turning towards player so that the AI is constantly point towards it 
       turnTowards(player.getX(), player.getY()); 
       
        //If there is no player in the world it returns and does nothing 
       if (getWorld().getObjects(Player.class).isEmpty())
           return; 
            //Greenfoot.playSound("Death sound");  
    }
    
    public void destroyPlayer()
    {
        Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
        if(isTouching(Player.class)) 
            //destroy player
            return; 
    }
}

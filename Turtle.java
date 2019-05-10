import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Animal
{
    private int mSpeed = 3;
    private int burgersEaten = 0;
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(canSee(Snake.class)){//determines if the snake is hit
            Greenfoot.playSound("Wrong-answer.mp3");
            Greenfoot.stop();
        }
        if (canSee(Hamburger.class)){//determines if a burger can be eaten
            World world = getWorld();
            burgersEaten++;
            eat(Hamburger.class);
            Hamburger newBurger = new Hamburger();
            world.addObject(newBurger, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            if(triggerEvent(burgersEaten, 3)){
                mSpeed++;
                scale(5);
            }
            if(triggerEvent(burgersEaten, 5)){
                Snake newSnake = new Snake();
                world.addObject(newSnake, 300, 300);
            }
        }
        
     
   
        if (Greenfoot.isKeyDown("right")){//what to do if key is pressed
            setRotation(0);
            move(mSpeed);
        }

        if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(mSpeed);
        }
        if (Greenfoot.isKeyDown("up")){
           setRotation(270);
           move(mSpeed);
        }
        if (Greenfoot.isKeyDown("down")){
           setRotation(90);
           move(mSpeed);
        }

        if(isAtEdge()){
            turn(30);
        }
    } 
    
    /*
     * Determines if an event should be triggered
     * @param counter the counter used to determine triggering
     * @param freq the frequency it should be changed by
     * @return true if the event should be triggered, false otherwise
     */
    public boolean triggerEvent(int counter, int freq){
        if((counter % freq) == 0){
            return true;
        }
        
        return false;
    }
}

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    
    /*
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 600, 1);
        prepare();
       
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        Hamburger burger1 = new Hamburger();
        addObject(burger1, 214, 392);
        Hamburger burger2 = new Hamburger();
        addObject(burger2, 144, 72);
        Hamburger burger3 = new Hamburger();
        addObject(burger3, 543, 377);
        Hamburger burger4 = new Hamburger();
        addObject(burger4, 429, 384);
        Hamburger burger5 = new Hamburger();
        addObject(burger5, 108, 555);
        Turtle turtle = new Turtle();
        addObject(turtle, 300, 300);
        Snake snake = new Snake();
        addObject(snake, 580, 580);
      
    }

   

}

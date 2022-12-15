import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    public Background()
    {    
        super(900, 600, 1, false);
        addObject(new eat(), Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(50)+380);
        addObject(new JackPlayer(), 100,550 );
        addObject(new JimPlayer(),800 ,550);
        addObject(new Ground(),452,600);
        addObject(new plate(),200,425);
        addObject(new plate(),700,425);
        addObject(new plate(),450,300);
        addObject(new plate(),200,175);
        addObject(new plate(),665,175);
        addObject(new Wall(),-25,300);
        addObject(new Wall(),925,300);
        addObject(new Life(), 10, 10);
        addObject(new Life(), 890, 10);
    }
   public void stopped(){
   //   removeObjects(getObjects(null));
     // addObject(new JimWins(),450,300);
      //addObject(new JackWins(),450,300);

   }
   
}

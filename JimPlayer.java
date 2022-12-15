import greenfoot.*;
/**
 * Write a description of class JimPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JimPlayer extends Solid
{
    int speed;
    int x;
    int y;
    int fireCount = 0 ;
    int pos=890;
    private int lives = 1;  
    
    public void fireCount()
    {
        if(fireCount <35 )
        {
            fireCount++ ;
        }
        else
        {
            fireCount = 35 ;
        }
    }
    private void livesCount()
    {
     
        
        if (isTouching(kunai.class)) 
        {    Actor rb = getOneObjectAtOffset(48,0,kunai.class); 
            removeTouching(kunai.class); 
            setLives(getLives() - 1);
            getWorld().addObject(new Lost(),pos,10);
            pos=pos+20;
        }
        if(lives==6)
        {lives=lives;}
        else if (isTouching(eat.class)) 
        {
           
            addLives(1);
            removeTouching(eat.class);
            getWorld().addObject(new eat(), Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(100)+100);
            
        }
                JackWins win = new JackWins();

        if(lives==0)
        {
             getWorld().addObject(win,450,300);  
             Greenfoot.stop();
        }
    }
    public void addLives(int lives)
    {
        if ((getLives() - lives) >= 0) setLives(getLives() + lives);
         pos=pos-20;
         getWorld().addObject(new Life(),pos,10);
    }
    public int getLives()
    {
        return lives;
    }
     public void setLives(int count)
    {
        if (count >= 0) lives = count;
    }
    public void act() 
    {
        livesCount();
        fireCount();
       if(Greenfoot.isKeyDown("h")||Greenfoot.isKeyDown("р"))
      {
          setLocation(getX()-5,getY());
          x=180;
          setImage("2-left.png");
       while(isTouching(Solid.class))
       {
          setLocation(getX()+1,getY());
       }
      }
       if(Greenfoot.isKeyDown("j")||Greenfoot.isKeyDown("о"))
      {
          setLocation(getX(),getY()+5);
          x=90; 
       while(isTouching(Solid.class))
       {
          setLocation(getX(),getY()-1);
       }
      }
       if(Greenfoot.isKeyDown("k")||Greenfoot.isKeyDown("л"))
      {
          setLocation(getX()+5,getY());
          x=0;
           setImage("2-right.png");
       while(isTouching(Solid.class))
       {
          setLocation(getX()-1,getY());
       }
    }    
    speed=speed+1;
    setLocation(getX(),getY()+speed);
    if(speed<0)
    {
        while(isTouching(Solid.class))
        {
            speed=0;
            setLocation(getX(),getY()+1);
        }
    }
    if(speed>=0)
    {
        while(isTouching(Solid.class))
        {
            speed=0;
            setLocation(getX(),getY()-1);
            if(Greenfoot.isKeyDown("u")||Greenfoot.isKeyDown("г"))
           {
            speed=-20;
            x=-90;
           }
        }
    }
    if((Greenfoot.isKeyDown("l")||Greenfoot.isKeyDown("д"))&& fireCount == 35)
    {
        getWorld().addObject(new suriken(x),getX(),getY());
        fireCount = 0;
    }
    
      
}
}
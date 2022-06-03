import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ataque del enemigo Jason en el nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Machete extends Shoot
{
    int speed = -10;
    /**
     * Constructor para los objetos de la clase Machete.
     * 
     */
    public Machete()
    {
        getImage().scale(30,30);
    }
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        /*if(isAtEdge()){
            getWorld().removeObject(this);
        }
        else{
            move(speed);
        }*/
        Actor p3 = getOneIntersectingObject(p3.class);
        if(p3 != null)
        {
            getWorld().removeObject(this);
        }
        else{
            move(speed);
        }
        // Add your action code here.
    }        
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ataque del enemigo Scream en el nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Ghost extends Shoot
{
    int speed = -10;
    /**
     * Constructor para los objetos de la clase Ghost.
     * 
     */
    public Ghost()
    {
        getImage().scale(30,30);
    }
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }
}

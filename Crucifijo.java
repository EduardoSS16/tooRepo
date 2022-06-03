import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ataque del personaje principal en el nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Crucifijo extends Shoot
{
    int speed = 10;
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
    }
}

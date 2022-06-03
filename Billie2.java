import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Personaje principal correspondiente al nivel 2
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Billie2 extends Actor
{
    fiesta thisGame2;
     /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-10, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+10, this.getY());
        }
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY()-10);
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY()+10);
        }
         //Contabiliza recompensa del segundo nivel
        Actor globo = getOneIntersectingObject(globo.class);
        if(globo != null)
        {
            getWorld().removeObject(globo);
            thisGame2.score++;
        }
    }
}

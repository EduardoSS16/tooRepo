import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Personaje principal correspondiente al nivel 1
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Billie extends Actor
{
    arroyo thisGame;
    private int vSpeed = 0;
    private int aceleracion = 0;
     /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        caida();
        verificaCaida();
        salto();
        //Movimiento del personaje
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-10, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+10, this.getY());
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY()+10);
        }
        //Contabiliza recompensa del primer nivel
        Actor Recompensa = getOneIntersectingObject(Recompensa.class);
        if(Recompensa != null)
        {
            getWorld().removeObject(Recompensa);
            thisGame.score++;
        }
        //Verifica vida
    }
    //Caída del personaje
     /**
       * Método que escenifica la caída del personaje
       * 
     */
    public void caida(){
        setLocation(getX(), getY() + vSpeed);
    }
    //Verifica que no esté cayendo
     /**
       * Método que verifica si está cayendo el personaje
       * 
     */
    public void verificaCaida(){
        if(!isTouching(Roca.class))
        {
            vSpeed++;
        }
        else
            vSpeed = 0;
    }
     /**
       * Método que permite saltar al personaje
       * 
     */
    public void salto(){
        if("space".equals(Greenfoot.getKey())){
            vSpeed = -12;
        }
    }
}

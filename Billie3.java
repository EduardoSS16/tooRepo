import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Personaje principal correspondiente al nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Billie3 extends Actor
{
    casa thisGame;
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
        dispara();
        salto();
        
        //Movimiento del personaje
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-10, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+10, this.getY());
        }
        //Contabiliza llaves del nivel
        Actor Key = getOneIntersectingObject(key.class);
        if(Key != null)
        {
            getWorld().removeObject(Key);
            thisGame.score++;
        }
        //Verifica ingreso a la puerta
        Actor Puerta = getOneIntersectingObject(Puerta.class);
        if(Puerta != null)
        {
            thisGame.puerta++;
        }
        //Verifica daño de Ghost
        Actor Ghost = getOneObjectAtOffset(0,0, Ghost.class);
        if(Ghost != null)
        {
            thisGame.vida--;
        }
        //Verifica daño de Garra
        Actor Garras = getOneObjectAtOffset(0,0, Garras.class);
        if(Garras != null)
        {
            thisGame.vida--;
        }
        //Verifica daño de Hacha
        Actor Hacha = getOneObjectAtOffset(0,0, Hacha.class);
        if(Hacha != null)
        {
            thisGame.vida--;
        }
        //Verifica daño de Machete
        Actor Machete = getOneObjectAtOffset(0,0, Machete.class);
        if(Machete != null)
        {
            thisGame.vida--;
        }
    }
    //Disparar
     /**
       * Método que permite disparar al personaje
       * 
     */
    public void dispara(){
        if("q".equals(Greenfoot.getKey())){
            Crucifijo c = new Crucifijo();
            getWorld().addObject(c, getX(), getY());
        }
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
       * Método que verifica si se está cayendo el personaje
       * 
     */
    public void verificaCaida(){
        if(!isTouching(Piso.class))
        {
            vSpeed++;
        }
        else if(isTouching(Piso.class))
        { 
            //setLocation(getX(), getY() - 1);
            vSpeed = 0;   
        }
    }
    //Saltar
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

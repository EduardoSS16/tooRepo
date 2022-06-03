import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo del personaje principal en el nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Saw extends Actor
{
    int speed = -4;
    int contador = 0;
    int vida = 3;
    boolean golpeado = false;
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        contador++;
        move();
        golpeadoCrucifijo();
    }
    /**
       * Método que permite mover el enemigo de manera automática
       * 
     */
    public void move(){
        if(contador < 120)
        setLocation(getX() + speed, getY());
        else{
            speed = - speed;
            getImage().mirrorHorizontally();
            contador = 0;
        }
    }
    /**
       * Método que verifica si el personaje es tocado por el crucifijo
       * 
     */
    public void golpeadoCrucifijo(){
        Actor crucifijo = getOneIntersectingObject(Crucifijo.class);
        if(crucifijo != null && !golpeado)
        {
            vida--;
            golpeado = true;
            getWorld().removeObject(crucifijo);
        }
        else if(!isTouching(Crucifijo.class))
        {
            golpeado = false;
        }
        if(vida == 0){
         getWorld().removeObject(this);
        }
        else if(vida != 0){
            ataca();
        }
    }
    /**
       * Método que permite al personaje atacar
       * 
     */
    public void ataca(){
        if(contador < 1){
        getWorld().addObject(new Hacha(), getX(), getY());
        }
    }
}

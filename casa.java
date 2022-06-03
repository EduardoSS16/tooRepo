import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenario correspondiente al nivel 3.
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class casa extends World
{
    GreenfootSound sound = new GreenfootSound("terror.wav");
    Billie3 bi;
    Puerta p;
    public static int score = 0;
    public static int vida = 1;
    public static int puerta = 0;  //0 indica puerta inhabilitada
    /**
     * Constructor para los objetos de la clase casa.
     * 
     */
    public casa()
    {    
        // Create a new world with 2000x600 cells with a cell size of 1x1 pixels.
        super(2000, 600, 1); 
        bi = new Billie3();
        p = new Puerta();
        this.addObject(bi, 60, 465);
        prepare();
    }
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act(){
        sound.play();
        showText("Llaves: " + score, 50, 25);
        if(this.score == 3){
           addObject(p, 1970, 86);
        }
        if(this.vida == 0){
            showText("HAS PERDIDO!", 400, 400);
            sound.stop();
            Greenfoot.setWorld(new GameOver());
            vida = 1;
        }
        if(this.puerta == 1){
            showText("HAS GANADO EL JUEGO!!!!", 1700, 100);
            sound.stop();
            Greenfoot.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        p1 p1 = new p1();
        addObject(p1,189,581);
        p2 p2 = new p2();
        addObject(p2,803,445);
        p2 p22 = new p2();
        addObject(p22,1120,233);
        p1 p12 = new p1();
        addObject(p12,1630,585);
        p2 p23 = new p2();
        addObject(p23,1702,403);
        p3 p3 = new p3();
        addObject(p3,1701,264);
        p3 p32 = new p3();
        addObject(p32,1964,171);
        Jason jason = new Jason();
        addObject(jason,1970,86);
        Scream scream = new Scream();
        addObject(scream,914,361);
        Saw saw = new Saw();
        addObject(saw,1875,499);
        Freddy freddy = new Freddy();
        addObject(freddy,1258,147);
        key key = new key();
        addObject(key,918,378);
        key key2 = new key();
        addObject(key2,1874,526);
        key key3 = new key();
        addObject(key3,1719,201);
        Fire fire = new Fire();
        addObject(fire,718,551);
        Fire fire2 = new Fire();
        addObject(fire2,1101,551);
        p3 p33 = new p3();
        addObject(p33,1457,100);
    }
}

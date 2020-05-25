import java.util.*;

/*Koosta klass pendli jaoks. Võnkeperiood = 2 x Pi * sqrt(pikkus/9.8). 
Määra peaprogrammist pendli pikkus ning pane tiksumise taktis välja trükkima. */

public class Pendulum {
    double period;
    Timer ticker;
    Cog wheel;

    public Pendulum(double length, Cog cog) {
        period = 2 * Math.PI * Math.sqrt(length / 9.8);
        wheel = cog;

        TimerTask task = new TimerTask() {
            public void run() {
                wheel.makeStep();
                System.out.println(wheel.toString());
            }
        };
        
        ticker = new Timer("timer");
        ticker.scheduleAtFixedRate(task, 0, (long)(period * 1000));   
    }
}
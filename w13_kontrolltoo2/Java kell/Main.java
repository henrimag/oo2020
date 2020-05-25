/*
Kellamehhanism

* Koosta klass pendli jaoks. Võnkeperiood = 2 x Pi * sqrt(pikkus/9.8). 
  Määra peaprogrammist pendli pikkus ning pane tiksumise taktis välja trükkima.
* Koosta klass hammasratta jaoks. Ette antakse hammaste arv.
  Pendlil on viide hammasrattale, millega ta seotud. Anna peaprogrammis andmed pendli ja
  hammasratta kohta, pane süsteem tööle, kus on näha/lugeda pendli tiksumine ning
  ratta tehtud ringid.
* Hammasrattal on kõrvuti kaks erisuguse hammaste arvuga ringi.
  Hammasrattaid saab omavahel kokku ühendada ning hammaste arvu erinevust ülekandena kasutada. 
  Ehita nende abil kokku kellamehhanism, kus tiksuks pendel, liiguks tunni- ja minutiosuti.
  Logimisel kuvatakse andmed detailide seisu kohta. Arvesta hammasrataste loomisel mõõtmetega, 
  et igas ringis oleks vähemasti 10 hammast, hamba suurus poleks alla millimeetri ning
  kogu kellamehhanism mahuks 10x10x10 cm suurusesse karpi (+ pendel eraldi)
*/

public class Main {
    public static void main(String[] args) {
        
        //hammasrataste arvud
        //üks hammasratas on kaks hammasratast mis on ühendunud
        //kui hammasratas1 annab hammasratas2 liikumise, üks on sisend ja teine väljund
        //viikordne vahe siis neljakordne vahe ja kolmekordne vahe, 4*5*6

        Cog wpendulum = new Cog(50, 10, "pendulum "); // viiekordne vahe
        Cog diff1 = new Cog(30, 10, "");             // kolmekordne vahe
        Cog diff2 = new Cog(40, 10, "");             // neljakordne vahe
        Cog whand1 = new Cog(50, 10, "minutes ");      // hammaste arvud, kahe hammasratta arvud, üks 50 ja teine 10
        Cog diff3 = new Cog(30, 10, "");             // kolmekordne vahe
        Cog diff4 = new Cog(40, 10, "");             // neljakordne vahe
        Cog whand2 = new Cog(50, 50, "hours ");        // viiekordne vahe

        //aitab aega kiiresti edasi liigutada et näha kas töötab, peaks muidu olema 1 sekund
        Pendulum pendulum = new Pendulum(0.0004, wpendulum);
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        //pendlid ja käed ühendatakse
        wpendulum.connectCog(diff1);
        diff1.connectCog(diff2);
        diff2.connectCog(whand1);
        whand1.connectCog(diff3);
        diff3.connectCog(diff4);
        diff4.connectCog(whand2);

        whand1.connectHand(hand1);
        whand2.connectHand(hand2);
    }
}
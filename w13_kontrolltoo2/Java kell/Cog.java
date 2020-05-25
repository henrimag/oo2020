    /*
     * Koosta klass hammasratta jaoks. Ette antakse hammaste arv. Pendlil on viide
     * hammasrattale, millega ta seotud. Anna peaprogrammis andmed pendli ja
     * hammasratta kohta, pane süsteem tööle, kus on näha/lugeda pendli tiksumine
     * ning ratta tehtud ringid.
     */

public class Cog {

    int internalteeth;
    int externalteeth;
    String name;

    int rotations;
    int internalsteps;
    int externalsteps;

    Cog controlled;
    boolean connectedWheel;

    Hand hand;
    boolean connectedHand;

    // iga hammasratas teab mitu pööret on teinud ja teab mitu hammast on edasi
    // tiksunud ja teab seda ratast mis on tema külge ühendatud

    // sisering on see, mis on ühenduses sammudega ja mida pendel või teine
    // hammasratas liigutab.
    // väliring on see, mis liigutab järgmist hammasratast.

    public Cog(int internal_teeth, int external_teeth, String name) {
        internalteeth = internal_teeth;
        externalteeth = external_teeth;
        rotations = 0;
        internalsteps = 0;
        externalsteps = 0;
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
        connectedWheel = false;
        connectedHand = false;
    }

    // juhitav hammasratas on ratas, millele see hammasratas väliringi kaudu jõu üle kannab.
    public void connectCog(Cog controlled) {
        if (!connectedWheel) {
            this.controlled = controlled;
            connectedWheel = true;
        }
    }

    public void connectHand(Hand hand) {
        if (!connectedHand) {
            this.hand = hand;
            connectedHand = true;
        }
    }

    //Ütleb hammasrattale et liigu üks samm edasi, kui osuti on ühendatud liigutab osutit.
    //arvutab välja suhte kui sisemine hammasratas liigub ühe võrra edasi, siis kui palju peaks välimine liikuma
    //peab arvet iga kord kui välimine ratas liigub ühe täkke võrra edasi, siis ütleb ühendatud hammasrattale et see võiks ka ühe sammu võrra liikuda
    //liigub doomino mööda edasi

    public void makeStep() {
        internalsteps = internalsteps + 1;
        double ratio = internalsteps / (double)internalteeth;

        if (connectedHand) {
            hand.setHandPosition(ratio);
        }
        
        if (internalsteps >= internalteeth) {
            rotations += 1;
            internalsteps = 0;            
        }

        int steps = (int)(ratio * externalteeth) - externalsteps;
        externalsteps = externalsteps + steps;
        if (externalsteps >= externalteeth) {
            externalsteps = 0;
        }

        if (connectedWheel) {
            for (int i = 0; i < steps; i++) {
                controlled.makeStep();
            }   
        }
    }
    //prindib välja hammasrataste liikumise
    //võtab kõikide varasemata ühendatud hammasrataste
    //paneb eelmiste hammasrataste toString funktsiooni enda külge läheb doomino moel edasi


    //iga kantsulgude vahel on üks hammasratas, numbrid ei ole aeg vaid hammasrataste staatused
    //esimene number on hammasratta pöörded ja kaks numbrit peale seda on mitme hamba peal ta parasjagu on, läheb 50ni

    public String toString() {
        String text = "|" + name + "" + rotations + ":" + internalsteps + ":" + externalsteps + "|";

        if (connectedHand) {
            text = "|" + hand.toString() + "|" + text;
        }
        if (connectedWheel) {
            text += "" + controlled.toString();
        }
        return text;
    }
}
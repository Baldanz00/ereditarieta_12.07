import films.Film;

public class App {
    public static void main(String[] args) throws Exception {
        
        Film f1 = new Film();
        f1.setTitolo("Titanic"); //setTitolo si trova in contenuto, eppure lo posso richiamare da film...

        // Contenuto c1 = new Contenuto();
        //c1.attori = .... -> non lo vedo, perchè ha il modificatore di defoult che è package
        // c1.titolo = "Pippo// Non posso farlo, non lo vedo perchè app è fuori dai package
        f1.stampaTitolo();
        f1.aggiungiAttore("Leonardo Di Caprio");
        f1.aggiungiAttore("Kate Winslet");
        f1.aggiungiAttore("Billi Zane");
        f1.aggiungiAttore("Kathy Bates");
        f1.aggiungiAttore("Bill Paxton");
        f1.stampaAttori();

        // f1.getAttori()[0] = "io";
        f1.stampaAttori();
        /*Così facendo ho rotto l'incapsulamento....ho sovrascritto l'attore a posizione 0...
        --> anche il getter può essere pericoloso. Allora questo stampaAttori che si trova in film, lo metto dentro contenuto
        Contenuto.java:47
        
        Ora non posso più sovrascrivere come ho fatto a r:20*/
    }
}

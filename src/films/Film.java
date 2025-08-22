package films;

import contenuto.Contenuto;

public class Film extends Contenuto {

    private long durata;
    public void stampaTitolo(){
        System.out.println("Il titolo del film è " + this.titolo);

    }
    // public void stampaAttori(){
    //     for(int i = 0; i < this.getAttori().length; i++){
    //         System.out.println("Attore " + this.getAttori()[i]); 
    //     }//essend privati come attributi, la sottoclasse non li vede, ma questo non significa che non ce li abbia.
    // }
}

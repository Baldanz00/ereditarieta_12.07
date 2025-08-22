package contenuto;

public class Contenuto {

    protected String titolo;
    private String[] attori;

    private int numAttori;
    void riproduci(){
        System.out.println("Inizio contenuto..");
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String[] getAttori() {
        return attori;
    } //non restituisce il valore, trattandosi di tipi non primitivi..restituisce l'intera struttira.

    // public void setAttori(String[] attori) {
    //     this.attori = attori;
    // } //Rompo l'incapsulamento, permetto di sovrascrivere la strittura

    public Contenuto() {
        this.attori = new String[5] ; //io ho impostato un costruttore che ha 5 attori....
        this.numAttori = 0;
    }
    //nel setter che cosa posso fare così? Posso modificare il dato.
    //Voglio pernettere di aggiungere gli attori e no di sovrascriverli.... come faccio mantenendo l'incapsulamento?
    //Come modifico il setter in modo che non si possa modificare la quantità di attori che io ho deciso a 5.
    //metto un contatore : metodo aggiungiAttore

    public void aggiungiAttore(String attore){
        if(numAttori < this.attori.length){
            this.attori[numAttori] = attore;
            this.numAttori++;
        } else{
            System.out.println("Raggiunto il numero massimo di attori");
        }
    }

    public void stampaAttori(){
       for(int i = 0; i < this.attori.length; i++){
             System.out.println("Attore " + this.attori[i]); 
         }

        }

    }

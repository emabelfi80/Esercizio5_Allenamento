public class Counter {

    int giorni;
    int ore;
    int minuti;
    int secondi;

    public Counter(int giorni, int ore, int minuti, int secondi) {
        this.giorni = giorni;
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getGiorni() {
        return giorni;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public int totaleSecondi(){
        int totale= giorni * 86400 + ore * 3600 + minuti * 60 + secondi;

       return totale;
    }
}

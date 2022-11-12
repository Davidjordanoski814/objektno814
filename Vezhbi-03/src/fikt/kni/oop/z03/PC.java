package fikt.kni.oop.z03;

public class PC {
    public int memorija;
    public String tipNaMemorija;
    public int SSD;
    public String golemina = "GB";

    public PC(){
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.SSD = 256;
    }

    public void pcMethod(int zgolemiMemorija, int novSSD){
        int drugSSD = this.SSD + novSSD;
        System.out.println("Memorijata beshe: " + this.memorija + golemina + ", sega iznesuva: " + (this.memorija + zgolemiMemorija) + golemina);
        System.out.println("Tipot na memorijata e: " + this.tipNaMemorija);
        System.out.println("SSD ima golemina od: " + (this.SSD + novSSD) + golemina + ", a prethodno iznesuvashe: " + this.SSD + golemina);
    }

}

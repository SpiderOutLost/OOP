package example;

public class Square {
    double dlina;
    double shirina;
    void getDinens(double dlina, double shirina){
        this.dlina = dlina;
        this.shirina = shirina;
    }
    double Ploshad(){
        return dlina*shirina;
    }
}

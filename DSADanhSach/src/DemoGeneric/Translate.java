package DemoGeneric;

public class Translate<E,V> {
    private E eng;
    private V viet;
    public Translate(E eng, V viet){
        this.eng=eng;
        this.viet=viet;
    }

    public E getEng() {
        return eng;
    }

    public void setEng(E eng) {
        this.eng = eng;
    }

    public V getViet() {
        return viet;
    }

    public void setViet(V viet) {
        this.viet = viet;
    }
}

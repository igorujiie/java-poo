package exemplo;

import exemplo.Automovel;

public class Moto extends Automovel {

    private  Integer cilindrada;

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public String toString() {
        return "exemplo.Moto{" +
                "cilindrada=" + cilindrada +
                 ",tipo=" + getTipo() +
                ", Marca=" + getMarca() +
                '}';
    }
}

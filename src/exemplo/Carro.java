package exemplo;

import exemplo.Automovel;

public class Carro  extends Automovel {

    private Integer portas;
    private Integer bancos;


    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Integer getBancos() {
        return bancos;
    }

    public void setBancos(Integer bancos) {
        this.bancos = bancos;
    }


    @Override
    public String toString() {
        return "exemplo.Carro{" +
                "portas=" + portas +
                ", bancos=" + bancos +
                ", tipo=" + getTipo() +
                ", Marca=" + getMarca() +
                '}';
    }
}

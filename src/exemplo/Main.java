package exemplo;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.setTipo("SUV");
        carro.setMarca("Fiat");
        carro.setPortas(5);
        carro.setBancos(5);

        moto.setMarca("Yamaha");
        moto.setTipo("Scootter");
        moto.setCilindrada(100);

        System.out.println(carro);
        System.out.println(moto);

        System.out.println("Hello world!");

        ;
    }
}


package eclaseexterna;

public class Enderezo {
    private String  rua;
    private int numero;

    public Enderezo(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
    }
    

}

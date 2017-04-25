
package eclaseexterna;

public class EClaseExterna {

    public static void main(String[] args) {
       Alumno alu = new Alumno("aa", 3,new Enderezo( "rua a", 20));
       alu.amosar();
       alu.mudarEnderezo();
       alu.amosar();
       
    }
    
}

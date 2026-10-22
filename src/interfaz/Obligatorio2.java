package interfaz;
import dominio.*;
public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        MenuPrincipal menu = new MenuPrincipal(sistema);
        menu.setVisible(true);
    }
    
}

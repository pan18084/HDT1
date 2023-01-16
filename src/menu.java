import java.util.Scanner;
public class RadioConsoleUI {
    private Scanner _in;
    private IRadio miRadio;
    
    public RadioConsoleUI(Scanner _scanner, IRadio _radio) {
        _in = _scanner;
        miRadio = _radio;
    }

    System.println("*******-************************************");
    System.println("*                                          *");
    System.println("*                   MENU                   *");
    System.println("*                                          *");
    System.println("*  1.  Seleccion de la frecuencia          *");
    System.println("*  2.  Cambiar emisora (adelante)          *");
    System.println("*  3.  Cambiar emisora (atras)             *");
    System.println("*  4.  Emisora AM actual                   *");
    System.println("*  5.  Emisora FM actual                   *");
    System.println("*  6.  Guardar emisora AM actual en # slot *");
    System.println("*  7.  Guardar emisora FM actual en # slot *");
    System.println("*  8.  Obtener # slot AM                   *");
    System.println("*  9.  Obtener # slot FM                   *");
    System.println("*  10. Desea encender/apgar                *");
    System.println("*                                          *");
    System.println("********************************************");

}

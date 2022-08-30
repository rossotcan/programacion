/* parte 1 */
public class App {
    public static void main(String[] args) {
        int resultado = suma(2,5,1);
        System.out.println(resultado);
    }
    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

/* parte 2 */
public class App {
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche();
        miCoche.addDoor();

        System.out.println(miCoche.door);
    }
}
class Coche{
    public int door = 4;

    public void addDoor(){
        this.door++;
    }
}




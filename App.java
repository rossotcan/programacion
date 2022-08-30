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


import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;

class Ej1 {

    public static int n = 0, head = 0, queue = 0;
    //int [] buffer = new int[10]; 
    public static IntBuffer intBuffer = IntBuffer.allocate(10);
    public static Semaphore binarySem = new Semaphore(1);
    public static Semaphore fullSem = new Semaphore(0);
    public static Semaphore emptySem = new Semaphore(10);

    public static void main(String[] args) {
        Ej1Productor productor = new Ej1Productor();
        Ej1Consumidor consumidor = new Ej1Consumidor();

        productor.start();
        consumidor.start();
    }
}
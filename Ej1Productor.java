public class Ej1Productor extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            try {
                Ej1.emptySem.acquire();
                Ej1.binarySem.acquire();

                Ej1.intBuffer.put(Ej1.head, i); // = buffer [head] = i
                Ej1.head = (Ej1.head + 1) % 10;

                Ej1.binarySem.release();
                Ej1.fullSem.release();
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
            
        }
    }
    
}

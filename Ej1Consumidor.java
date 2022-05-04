public class Ej1Consumidor extends Thread{
    @Override
    public void run() {
        // paint numbers given
        try {
            for (int i = 1; i <= 100; i++) {
                Ej1.fullSem.acquire();
                Ej1.binarySem.acquire();

                System.out.println(Ej1.intBuffer.get(Ej1.queue));
                Ej1.queue = (Ej1.queue + 1) % 10;

                Ej1.binarySem.release();
                Ej1.emptySem.release();
            }
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }

    }
}

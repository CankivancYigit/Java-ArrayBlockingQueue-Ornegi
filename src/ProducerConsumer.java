
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {

    Random random = new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce() {

        while (true) {
            
            try {
                Thread.sleep(1000);
                int deger = random.nextInt(100);
                System.out.println("değer üretiliyor :" + deger);
                queue.put(deger);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
    
    public void consume(){
    
        
        while (true) {            
            
        
        try {
            Thread.sleep(7000);
             int deger = queue.take();
             System.out.println("değer alınıyor :" + deger);
             
             System.out.println("Kuyruk büyüklüğü :" + queue.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }
    

}





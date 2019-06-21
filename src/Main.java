

public class Main{
	
    private static Monitor monitor;


    public static void main(String[] args) {

        CPU_buffer1 buffer1 = new CPU_buffer1();
        CPU_buffer2 buffer2 = new CPU_buffer2();
        
        monitor = new Monitor(buffer1, buffer2);
       


        Thread[]prod= new Thread[5];
//        Thread[]cons = new Thread[8];

        for(int i=0; i<5; i++)
        {
        	prod[i] =new Productor(i, monitor); //Creo un productor y un consumidor
        	//prod[i] =new Productor(i, monitor, buffer1, buffer2, lock);
        	prod[i].start();
        }

//        for(int j=6 ;j<14; j++)
//        {
//        	 cons[j-6] =new Consumidor(j, monitor); //Creo un productor y un consumidor
//        	// cons[j-6] =new Consumidor(j, monitor, buffer1, buffer2, lock);
//        	 cons[j-6].start();
//        }
//
//        Thread log=new Thread(new Log(buffer1, buffer2, cons  ));
//        log.start();

        try {

            for(int i=0; i<5; i++)
            {
                prod[i].join();

            }

//            for(int i=0; i<8; i++)
//            {
//                cons[i].join();
//
//            }
//            log.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


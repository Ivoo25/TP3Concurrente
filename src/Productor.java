

public class Productor extends Thread {

	
    private int id;
    private Monitor monitor;

    public Productor(int id, Monitor monitor){
        this.id = id;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        super.run();

        int cont = 0;
        int cont2 = 0;
        while(cont<96) {

            double choose = Math.random()*100 +1;
            int index = 0;

            if(choose<50) index = 1;
            else index = 2;
            
            switch (monitor.shoot(index)){
                case 1:
                    try {
                        sleep(50);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    monitor.agregar(1, Integer.toString(id));
                    
                    break;

                case 2:
                    try {
                        sleep(50);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    monitor.agregar(2, Integer.toString(id));
                    
                    break;
            }

            cont++;
            cont2++;
            //System.out.println(cont);
            if(cont2==100) {
                System.out.println("El prductor " + id + " ya lleva: " + cont);
                cont2=0;
            }
        }
        System.out.println("Soy un productor y TERMINE: " + id);
    }
}

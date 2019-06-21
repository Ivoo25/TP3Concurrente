import java.util.ArrayDeque;
import java.util.Queue;


public class CPU_buffer2 {


	    private Queue<String> cola;

	    public CPU_buffer2() {

	        cola = new ArrayDeque<>();
	    }

	    public void add(String dato) {
	        cola.add(dato);
	    }

	    public String remove() {
	        return cola.remove();
	    }

	    public  int size() {
	        return cola.size();
	    }
}

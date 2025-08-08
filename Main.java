import java.util.ArrayList;

public class Main {
    static class Aeronave {
        String modelo;
        Integer horasVoo;
        
        public Aeronave(String modelo, Integer horasVoo) {
            this.modelo = modelo;
            this.horasVoo = horasVoo;
        }
        
        public String getModelo() {
            return modelo;
        }
        public Integer gethorasVoo() {
            return horasVoo;
        }
    }
	public static void main(String[] args) {
	    ArrayList<Aeronave> aeronaves = new ArrayList<>();
	    aeronaves.add(new Aeronave("14-bis", 1024));
	    aeronaves.add(new Aeronave("Antonov An-225 Mriya", 2222));
	    aeronaves.add(new Aeronave("Saab JAS 39 Gripen", 894));
	    aeronaves.add(new Aeronave("Northrop Grumman B-2 Spirit", 3189));
	    aeronaves.add(new Aeronave("Boeing 777", 777));
	    
	    System.out.println("Modelos de aeronaves:\n");
	    for (int i = 0; i < aeronaves.size(); i++) {
	        System.out.println(aeronaves.get(i).getModelo());
	        
	    }
	    System.out.println("\nAeronaves com mais de 2000 horas de voo:\n");
	    for (int i = 0; i < aeronaves.size(); i++) {
	        if(aeronaves.get(i).gethorasVoo() > 2000) {
	            System.out.println(aeronaves.get(i).getModelo());
	        }
	    }
	}
}

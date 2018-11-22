package TrabalhoComSingleton;

public class Carros {
   
    private int totalCarrosFiat;
    private int totalCarrosFord;
    private int totalCarrosVolks;
    
    public String criarCarroVolks(int totalCarrosVolks){
        return new String("Carros Volks #" + totalCarrosVolks + " criado."); 
    }
    
    public String criarCarroFord(int totalCarrosFord){
        return new String("Carros Ford #" + totalCarrosFord + " criado."); 
    }
    
    public String criarCarroFiat(int totalCarrosFiat){
        return new String("Carros Fiat #" + totalCarrosFiat + " criado."); 
    }
    
    public String gerarRelatorio(int totalCarrosFiat, int totalCarrosFord, int totalCarrosVolks) {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }
    
    private Carros(){
        
    }
    
    private static Carros instancia = null;
 
    public static Carros getInstancia() {
        if (instancia == null){
            System.out.println("aaaaa");
            instancia = new Carros();
        }
        return instancia;
    }
}

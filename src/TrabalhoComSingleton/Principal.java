package TrabalhoComSingleton;

public class Principal {
    public static void main(String[] args) {
        
        Carros carros = null;
        
        carros = Carros.getInstancia();
        
        System.out.println(carros.criarCarroFiat(4));
        System.out.println(carros.criarCarroFord(5));
        System.out.println(carros.criarCarroVolks(6));
      
        System.out.println(carros.gerarRelatorio());
        
        carros = Carros.getInstancia();
        
        System.out.println(carros.gerarRelatorio());   
    }
}

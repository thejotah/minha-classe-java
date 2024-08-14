public class MinhaClasse {
    
public static void main (String [] args) {
    
    String primeiroNome = "José";
    String ultimoNome = "Oliveira";

    String nomeCompleto = nomeCompleto (primeiroNome,ultimoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String ultimoNome) {
    return "Resultado do Método:" + primeiroNome.concat(" ").concat(ultimoNome);
}

}

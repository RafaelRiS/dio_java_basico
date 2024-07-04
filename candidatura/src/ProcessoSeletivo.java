import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static double salarioBase = 2000.0;
    
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();  // Chamando o método para seleção de candidatos
        imprimirSelecionados();  // Chamando o método para imprimir os candidatos selecionados
        String [] candidatos = {"LUANA", "HENRIQUE", "CARLOS", "ELSON", "RICARDO"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA");
        else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato +", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"LUANA", "HENRIQUE", "CARLOS", "ELSON", "RICARDO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de iteração for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String[] candidatos = {"LUANA", "HENRIQUE", "CARLOS", "ELSON", "RICARDO", "JOSE", "LEANDRO", "MARIA", "JONATAN", "IGOR"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado(a) para a vaga!");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

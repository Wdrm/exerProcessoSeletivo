public class Main {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
        imprimirSelecionados();
        }
        static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","WELLINGTON","ANNA","CECÍLIA","GIANE"};
            System.out.println("Lista de Candidatos por indice:");
            for (int indice=0; indice< candidatos.length;indice++){
                System.out.println("Candidato n° "+(indice+1)+" e o "+candidatos[indice]);
            }

        }

        static void analisarCandidato (double salarioPretendido){
            double salarioBase= 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR COM CONTRA PROPOSTA!");

            }else{
                System.out.println("AGUARDANDO TÉRMINO DA SELEÇÃO!");

            }


        }



    }

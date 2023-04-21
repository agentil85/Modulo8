import javax.sql.rowset.JoinRowSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Notas dos Alunos ***");
        Alunos Joao  = new Alunos("Joao", 8);
        Alunos Maria = new Alunos("Maria",9);
        Alunos Chico = new Alunos("Chico", 10);
        Alunos Jose = new Alunos("Jose", 6);

       Joao.imprimirInfo();
       Maria.imprimirInfo();
       Chico.imprimirInfo();
       Jose.imprimirInfo();

        mediaDaClasse();

       }

    public static void mediaDaClasse() {
        System.out.println("*** Total e media da classe ***");

        int num1 = 8;
        int num2 = 9;
        int num3 = 10;
        int num4 = 6;
        int total = num1 + num2 + num3 + num4;
        int media = total / 4;

        System.out.println("Total: " + total);
        System.out.println("Media da classe: " + media);



    }

}


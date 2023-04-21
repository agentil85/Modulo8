public class Alunos {

    String nome;

    int nota;

    Alunos (String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void imprimirInfo(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Nota: " + this.nota);

    }


}

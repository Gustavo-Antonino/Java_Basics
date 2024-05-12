package pessoa;

public class TesteDePessoa{
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setCpf("33322211");
        professor.setNome("Diogo");
        professor.setIdade(34);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("1234567890");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        aluno.setMatricula("8989898");
        System.out.println(aluno.imprimirDadosDaPessoa());
       
    }
}


/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
       public static void main(String[] args) {
        // Testando as classes e records
        CidadeRecord cidadeRecord = new CidadeRecord("Tocantins");
        Cidade cidade = new Cidade("Brasília");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Fulano", cidade);
        PessoaRecord pessoa = new PessoaRecord("Ciclano", cidadeRecord);

        // Exibindo informações
        System.out.println("CidadeRecord: " + cidadeRecord);
        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("PessoaRecordShallow: " + pessoaShallow);
        System.out.println("PessoaRecord: " + pessoa);
    }

}

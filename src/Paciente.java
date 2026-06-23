public class Paciente extends Pessoa {
    private String convenio;
    private boolean ativo;

    public Paciente(String nome, String cpf) {
        super(nome, cpf); // Chama o construtor da Pessoa
        this.ativo = true;
    }

    public Paciente(String nome, String cpf, int idade, String telefone) {
        super(nome, cpf, idade, telefone);
        this.ativo = true;
    }

    public Paciente(String nome, String cpf, int idade, String telefone, String convenio) {
        super(nome, cpf, idade, telefone);
        this.convenio = convenio;
        this.ativo = true;
    }

    @Override
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("[Erro] Idade inválida.");
            return;
        }
        super.setIdade(idade);
    }

    public String getConvenio() { return convenio; }
    public void setConvenio(String convenio) { this.convenio = convenio; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
public class Paciente extends Pessoa {
    private String convenio;
    private boolean ativo;

    //Construtor simples
    public Paciente(String nome, String cpf) {
        super(nome, cpf,0,"");
        this.convenio = "";
        this.ativo = true;
    }

    //Construtor intermediário
    public Paciente(String nome, String cpf, int idade, String telefone) {
        super(nome, cpf, idade, telefone);
        this.convenio = "";
        this.ativo = true;
    }

    //Construtor Completo
    public Paciente(String nome, String cpf, int idade, String telefone, String convenio) {
        super(nome, cpf, idade, telefone);
        this.convenio = convenio;
        this.ativo = true;
    }

    //tratamento de erro
    @Override
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("[Erro] Idade inválida.");
            return;
        }
        super.setIdade(idade);
    }

    //método para adicionar os dados intermediários
    public void complementar(int idade, String telefone) {
        this.setIdade(idade);
        this.setTelefone(telefone);
    }

    //método para adicionar dados completos
    public void complementar(int idade, String telefone, String convenio){
        this.setIdade(idade);
        this.setTelefone(telefone);
        this.setConvenio(convenio);
    }

    public String getConvenio() { return convenio; }
    public void setConvenio(String convenio) { this.convenio = convenio; }

    public boolean getAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    //método para desativar o paciente
    public void desativar() {
        this.setAtivo(false);
    }

    //método que informa se o paciente ta ativo
    public boolean isAtivo() {
    return this.ativo;
    }

    @Override
    public String exibirResumo() {
        return "---Resumo do Paciente---" + "\n" +  
            "Nome: =" + getNome() + "\n" +
            "CPF: " + getCpf() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Telefone: " + getTelefone() + "\n" +
            "Convênio: " + (convenio.isEmpty() ? "Nenhum" : convenio) + "\n" +
            "Status: " + (ativo ? "Ativo" : "Inativo");
    }
}
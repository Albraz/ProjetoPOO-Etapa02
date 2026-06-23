public class Profissional extends Pessoa {
    private String registro;
    private double valorConsulta;
    private String especialidade;

    public Profissional(String nome, String specialty) {
        super(nome, "");
        this.especialidade = specialty;
    }

    public Profissional(String nome, String cpf, int idade, String telefone, String registro, double valorConsulta, String especialidade) {
        super(nome, cpf, idade, telefone);
        this.registro = registro;
        this.valorConsulta = valorConsulta;
        this.especialidade = especialidade;
    }

    public void setValorConsulta(double valorConsulta) {
        if (valorConsulta < 0) {
            System.out.println("[Erro] Valor inválido.");
            return;
        }
        this.valorConsulta = valorConsulta;
    }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public double getValorConsulta() { return valorConsulta; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
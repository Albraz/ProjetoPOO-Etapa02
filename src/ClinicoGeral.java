public class ClinicoGeral extends Profissional {
    
    private String encaminhamento;

    //Construtor Mínimo
    public ClinicoGeral(String nome) {
        super(nome, "Clínico geral");
    }

    //Construtor Intermediário
    public ClinicoGeral(String nome, String registro, double valorConsulta) {
        super(nome, "Clínico geral", registro, valorConsulta);
    }

    //Construtor Completo
    public ClinicoGeral(String nome, String registro, double valorConsulta, HorarioDisponivel[] agenda, String encaminhamento) {
        super(nome, "Clínico geral", registro, valorConsulta, agenda);
        this.encaminhamento = encaminhamento;
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Nutricionista: " + getNome() + " | Encaminhamento: " + this.encaminhamento;
    }

    @Override
    public String exibirResumo() {
    String listaHorarios = "";
    if (this.getAgenda() != null && this.getTotalHorarios() > 0) {
        for (int i = 0; i < this.getTotalHorarios(); i++) {
            listaHorarios += this.getAgenda()[i].toString();
            if (i < this.getTotalHorarios() - 1) {
                listaHorarios += ", ";
            }
        }
    } else {
        listaHorarios = "Nenhum";
    }

    return "---Resumo do Profissional---" + "\n" +
           "Nome: " + this.getNome() + "\n" +
           "Registro: " + this.getRegistro() + "\n" +
           "Especialidade: " + this.getEspecialidade() + "\n" +
           "Valor da Consulta: R$ " + String.format("%.2f", this.getValorConsulta()) + "\n" +
           "Dias Disponíveis: " + listaHorarios + "\n" +
           "Abordagem: " + (this.encaminhamento.isEmpty() ? "Não informada" : this.encaminhamento);
    }

    public String getEncaminhamento() { return encaminhamento; }
    public void setEncaminhamento(String encaminhamento) { this.encaminhamento = encaminhamento; }

}


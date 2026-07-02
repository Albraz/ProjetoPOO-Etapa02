public class Nutricionista extends Profissional {
    private String planoAlimentar;

    //Construtor Mínimo
    public Nutricionista(String nome) {
        super(nome, "Nutrição");
    }

    //Construtor Intermediário
    public Nutricionista(String nome, String registro, double valorConsulta) {
        super(nome, "Nutrição", registro, valorConsulta);
    }

    //Construtor Completo
    public Nutricionista(String nome, String registro, double valorConsulta, HorarioDisponivel[] agenda, String planoAlimentar) {
        super(nome, "Nutrição", registro, valorConsulta, agenda);
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Nutricionista: " + getNome() + " | Plano alimentar: " + this.planoAlimentar;
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
           "Plano alimentar: " + (this.planoAlimentar.isEmpty() ? "Não informada" : this.planoAlimentar);
    }

    //getters e setters

    public String getPlanoAlimentar() { return planoAlimentar; }
    public void setPlanoAlimentar(String planoAlimentar) { this.planoAlimentar = planoAlimentar; }
}

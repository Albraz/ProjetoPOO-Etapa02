public class Psicologo extends Profissional {

    private String abordagem;
    
    //Construtor Mínimo
    public Psicologo(String nome) {
        super(nome, "Psicologia");
    }

    //Construtor Intermediário
    public Psicologo(String nome, String registro, double valorConsulta) {
        super(nome, "Psicologia", registro, valorConsulta);
    }

    //Construtor Completo
    public Psicologo(String nome, String registro, double valorConsulta, HorarioDisponivel[] agenda, String abordagem) {
        super(nome, "Psicologia", registro, valorConsulta, agenda);
        this.abordagem = abordagem;
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Psicólogo: " + getNome() + " | Abordagem: " + abordagem;
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
           "Abordagem: " + (this.abordagem.isEmpty() ? "Não informada" : this.abordagem);
    }

    //getters e setters
    public String getAbordagem() { return abordagem; }
    public void setAbordagem(String abordagem) { this.abordagem = abordagem; }

}

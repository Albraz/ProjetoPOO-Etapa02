public class Fisioterapeuta extends Profissional {
    
    private int totalSessoesPrevistas;

    //Construtor Mínimo
    public Fisioterapeuta(String nome) {
        super(nome, "Fisioterapia");
    }

    //Construtor Intermediário
    public Fisioterapeuta(String nome, String registro, double valorConsulta) {
        super(nome, "Fisioterapia", registro, valorConsulta);
    }

    //Construtor Completo
    public Fisioterapeuta(String nome, String registro, double valorConsulta, HorarioDisponivel[] agenda, int totalSessoes) {
        super(nome, "Fisioterapia", registro, valorConsulta, agenda);
        this.totalSessoesPrevistas = totalSessoes;
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Plano de tratamento: " + totalSessoesPrevistas + " sessões.";
    }

    //Implementação de exibir resumo específico    
    @Override
    public String exibirResumo() {
    //Percorrendo o array de dias
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
            "Sessões Previstas: " + (this.totalSessoesPrevistas <= 0 ? "Não definido" : this.totalSessoesPrevistas);
}


    //getters e setters
    public int getTotalSessoes() { return totalSessoesPrevistas; }
    public void setTotalSessoes(int totalSessoesPrevistas) { this.totalSessoesPrevistas = totalSessoesPrevistas; }

}

public class Nutricionista extends Profissional {
    
    //Construtor Mínimo
    public Nutricionista(String nome, String especialidade) {
        super(nome, especialidade);
    }

    //Construtor Intermediário
    public Nutricionista(String nome, String especialidade, String registro, double valorConsulta) {
        super(nome, especialidade, registro, valorConsulta);
    }

    //Construtor Completo
    public Nutricionista(String nome, String especialidade, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias) {
        super(nome, especialidade, registro, valorConsulta, diasDisponiveis, totalDias);
    }

    // Implementação dos métodos abstratos
    @Override
    public void registrarEspecifico() {
        System.out.println("Registrando sessão de fisioterapia: Avaliação motora e tratamento.");
    }

    @Override
    public String exibirResumo() {
        return "Fisioterapeuta: " + getNome() + " | Registro: " + getRegistro();
    }

}

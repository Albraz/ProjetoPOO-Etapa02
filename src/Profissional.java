public abstract class Profissional extends Pessoa {
    private String registro;
    private double valorConsulta;
    private String especialidade;
    private HorarioDisponivel[] agenda; 
    private int totalHorarios;


    //construtor mínimo
    public Profissional(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
        this.registro = "";
        this.valorConsulta = 0;
        this.agenda = new HorarioDisponivel[10]; 
        this.totalHorarios = 0;
    }

    //Construtor intermediário
    public Profissional(String nome, String especialidade, String registro, double valorConsulta) {
        super(nome);
        this.especialidade = especialidade;
        this.registro = registro;
        this.valorConsulta = valorConsulta;
        this.agenda = new HorarioDisponivel[10];
        this.totalHorarios = 0;
    }

    //Construtos completo
    public Profissional(String nome, String especialidade, String registro, double valorConsulta, HorarioDisponivel[] listaHorarios){
        super(nome);
        this.especialidade = especialidade;
        this.registro = registro;
        this.valorConsulta = valorConsulta;
        this.agenda = new HorarioDisponivel[10];
        this.totalHorarios = 0;
        
        if (listaHorarios != null) {
        for (int i = 0; i < listaHorarios.length && i < this.agenda.length; i++) {
            this.agenda[i] = listaHorarios[i];
            this.totalHorarios++;
            }
        }

    }
        
    //setter com validação para tratamento de erro

    public void setValorConsulta(double valorConsulta) {
        if (valorConsulta < 0) {
            System.out.println("[Erro] Valor inválido.");
            return;
        }
        this.valorConsulta = valorConsulta;
    }

    //getters e setter

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public double getValorConsulta() { return valorConsulta; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    // Getter para a agenda completa
    public HorarioDisponivel[] getAgenda() {return agenda;}
    public void setAgenda(HorarioDisponivel[] agenda) {this.agenda = agenda;}

    public int getTotalHorarios() {return totalHorarios;}
    public void setTotalHorarios(int totalHorarios) {this.totalHorarios = totalHorarios;}

    public abstract String registrarEspecifico(Atendimento atendimento);

}
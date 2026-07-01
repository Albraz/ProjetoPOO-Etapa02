public abstract class Profissional extends Pessoa {
    private String registro;
    private double valorConsulta;
    private String especialidade;
    private String[] diasDisponiveis;
    private int totalDias;

    //construtor mínimo
    public Profissional(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
        this.registro = "";
        this.valorConsulta = 0;
        this.diasDisponiveis = new String[7];
        this.totalDias = 0;
    }

    //Construtor intermediário
    public Profissional(String nome, String especialidade, String registro, double valorConsulta) {
        super(nome);
        this.especialidade = especialidade;
        this.registro = registro;
        this.valorConsulta = valorConsulta;
        this.diasDisponiveis = new String[7];
        this.totalDias = 0;
    }

    //Construtos completo
    public Profissional(String nome, String especialidade, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias){
        super(nome);
        this.especialidade = especialidade;
        this.registro = registro;
        this.valorConsulta = valorConsulta;
        this.diasDisponiveis = new String[7];
        this.totalDias = totalDias;
        for (int i = 0; i < totalDias; i++) {
            this.diasDisponiveis[i] = diasDisponiveis[i];
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

    public int getTotalDias(){ return totalDias;}
    public void setTotalDias(int totalDias){ this.totalDias = totalDias; }

    public String [] getDiasDisponiveis() { return diasDisponiveis; }
    public void setDiasDisponiveis(String[] diasDisponiveis) { this.diasDisponiveis = diasDisponiveis;}

    //método a ser implementado específico por especialidade

    public abstract void registrarEspecifico();

}
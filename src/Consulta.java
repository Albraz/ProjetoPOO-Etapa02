public class Consulta implements Agendavel, Exportavel {
    // Atributos privados
    private String cpfPaciente;
    private String nomeProfissional;
    private String data;
    private String horario;
    private String tipo;
    private String status;

    // Construtores
    public Consulta(String cpfPaciente, String nomeProfissional, String data, String horario) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = "inicial";
        agendar(); // Define o status inicial através do método do contrato
    }

    public Consulta(String cpfPaciente, String nomeProfissional, String data, String horario, String tipo) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = tipo;
        agendar();
    }

    public Consulta(String cpfPaciente, String nomeProfissional, String data, String horario, String tipo, String status) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = tipo;
        this.status = status;
    }

    // ==========================================================
    // IMPLEMENTAÇÃO DOS MÉTODOS DA INTERFACE 'Agendavel'
    // ==========================================================
    @Override
    public void agendar() {
        this.status = "agendada";
    }

    @Override
    public void cancelar() {
        this.status = "cancelada";
    }

    @Override
    public void remarcar() {
        this.status = "remarcada";
    }

    // Sobrecarga de negócio (não obrigatório pela interface, mas mantido da sua regra original)
    public String cancelar(String motivo) {
        cancelar();
        return "Consulta cancelada. Motivo: " + motivo;
    }

    public void realizar() {
        this.status = "realizada";
    }

    public String exibirResumo() {
        return "Paciente(CPF): " + cpfPaciente + " | Prof: " + nomeProfissional
                + " | Data: " + data + " | Hora: " + horario
                + " | Tipo: " + tipo + " | Status: " + status;
    }

    // ==========================================================
    // IMPLEMENTAÇÃO DO MÉTODO DA INTERFACE 'Exportavel'
    // ==========================================================
    @Override
    public String exportarDados() {
        return "CONSULTA;" + cpfPaciente + ";" + nomeProfissional + ";" + data + ";" + horario + ";" + tipo + ";" + status;
    }

    // ==========================================
    // GETTERS E SETTERS
    // ==========================================
    public String getCpfPaciente() { return cpfPaciente; }
    public void setCpfPaciente(String cpfPaciente) { this.cpfPaciente = cpfPaciente; }

    public String getNomeProfissional() { return nomeProfissional; }
    public void setNomeProfissional(String nomeProfissional) { this.nomeProfissional = nomeProfissional; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
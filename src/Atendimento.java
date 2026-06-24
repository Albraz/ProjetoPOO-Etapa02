import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private int indiceConsulta;
    private String observacoes;
    private String diagnostico;
    private List<String> procedimentos;
    

    // registro basico - so observacoes
    public Atendimento(int indiceConsulta, String observacoes) {
        this.indiceConsulta = indiceConsulta;
        this.observacoes = observacoes;
        this.diagnostico = "";
        this.procedimentos = new ArrayList<>();
    }

    public Atendimento(int indiceConsulta, String observacoes, String diagnostico) {
        this.indiceConsulta = indiceConsulta;
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
        this.procedimentos = new ArrayList<>();
    }

    // registro completo com procedimentos ja definidos
    public Atendimento(int indiceConsulta, String observacoes, String diagnostico, List<String> procedimentos) {
        this.indiceConsulta = indiceConsulta;
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
        this.procedimentos = new ArrayList<>(procedimentos);
    }

    // adiciona um por vez
    public void adicionarProcedimento(String procedimento) {
        if (procedimento != null && !procedimento.trim().isEmpty()) {
            this.procedimentos.add(procedimento);
        }
    }

    // adiciona varios de uma vez
    public void adicionarProcedimento(List<String> novosProcedimentos) {
        if (novosProcedimentos != null) {
            this.procedimentos.addAll(novosProcedimentos);
        }
    }

    public String exibirResumo() {
        StringBuilder resumo = new StringBuilder("Observacoes: " + observacoes);

        if (diagnostico != null && !diagnostico.trim().isEmpty()) {
            resumo.append("\nDiagnostico: ").append(diagnostico);
        }

        if (!procedimentos.isEmpty()) {
            resumo.append("\nProcedimentos: ");
            resumo.append(String.join(", ", procedimentos));
        }
        
        return resumo.toString();
    }


    public int getIndiceConsulta() {
        return indiceConsulta;
    }

    public void setIndiceConsulta(int indiceConsulta) {
        this.indiceConsulta = indiceConsulta;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    
    public List<String> getProcedimentos() {
        return new ArrayList<>(procedimentos);
    }
}
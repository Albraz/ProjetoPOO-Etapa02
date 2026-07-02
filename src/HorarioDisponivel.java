public class HorarioDisponivel {
    private String diaSemana;
    private String turno; // "Manhã" ou "Tarde"

    public HorarioDisponivel(String diaSemana, String turno) {
        this.diaSemana = diaSemana;
        this.turno = turno;
    }

    public String toString() {
        return diaSemana + " (" + turno + ")";
    }

    // Getters e setters

    public String getDiasSemana() { return diaSemana; }
    public void setDiasSemana(String diaSemana) { this.diaSemana = diaSemana; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}

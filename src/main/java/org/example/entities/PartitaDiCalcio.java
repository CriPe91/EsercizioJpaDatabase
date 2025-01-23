package org.example.entities;

import org.example.enumeration.TipoEvento;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity

public class PartitaDiCalcio extends Evento{

private String SquadraDiCasa;
private String SquadraOspite;
private String SquadraVincente;
private int GoalSquadraCasa;
private int GoalSquadraOspite;

    public PartitaDiCalcio() {}

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int goalSquadraCasa, int goalSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        SquadraDiCasa = squadraDiCasa;
        SquadraOspite = squadraOspite;
        SquadraVincente = squadraVincente;
        GoalSquadraCasa = goalSquadraCasa;
        GoalSquadraOspite = goalSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return SquadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        SquadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return SquadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        SquadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return SquadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        SquadraVincente = squadraVincente;
    }

    public int getGoalSquadraCasa() {
        return GoalSquadraCasa;
    }

    public void setGoalSquadraCasa(int goalSquadraCasa) {
        GoalSquadraCasa = goalSquadraCasa;
    }

    public int getGoalSquadraOspite() {
        return GoalSquadraOspite;
    }

    public void setGoalSquadraOspite(int goalSquadraOspite) {
        GoalSquadraOspite = goalSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "SquadraDiCasa='" + SquadraDiCasa + '\'' +
                ", SquadraOspite='" + SquadraOspite + '\'' +
                ", SquadraVincente='" + SquadraVincente + '\'' +
                ", GoalSquadraCasa=" + GoalSquadraCasa +
                ", GoalSquadraOspite=" + GoalSquadraOspite +
                '}';
    }
}

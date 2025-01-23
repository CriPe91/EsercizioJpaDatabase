package org.example.entities;

import org.example.enumeration.TipoEvento;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity

public class GaraDiAtletica extends Evento{

    private Set<Persona> atleti = new HashSet<>();
    @OneToOne()
    @JoinColumn(name = "persona_id")
    private String Vincitore;

    public GaraDiAtletica() {}

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Set<Persona> atleti, String vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleti = atleti;
        Vincitore = vincitore;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public String getVincitore() {
        return Vincitore;
    }

    public void setVincitore(String vincitore) {
        Vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", Vincitore='" + Vincitore + '\'' +
                '}';
    }
}

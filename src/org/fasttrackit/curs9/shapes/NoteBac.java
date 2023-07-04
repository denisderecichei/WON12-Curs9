package org.fasttrackit.curs9.shapes;

import java.time.Instant;
import java.time.LocalDateTime;

public class NoteBac {
    private final String name;
    private final int notaMate;
    private final int notaRomana;
    private LocalDateTime time;

    public NoteBac(String name, int notaMate, int notaRomana) {
        this.name = name;
        this.notaMate = notaMate;
        this.notaRomana = notaRomana;
        //
        this.time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public int getNotaMate() {
        return notaMate;
    }

    public int getNotaRomana() {
        return notaRomana;
    }
}

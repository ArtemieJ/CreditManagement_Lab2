package com.credit.crefitmanagement;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Plata {
    @NonNull
    private int idPlata;
    @NonNull
    private int idCredit;


    private double sumaPlatita;
    private String dataPlatii;
    private String metodaPlata;
    private boolean intarziere;
    private double penalizare;


}
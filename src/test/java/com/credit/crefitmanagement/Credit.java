package com.credit.crefitmanagement;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor


public class Credit {
    @NonNull
    private int idCredit;

    @NonNull
    private String numeClient;
    private double sumaImprumutata;
    private double rataDobanzii;
    private int perioadaInLuni;
    private boolean esteAprobat;


}

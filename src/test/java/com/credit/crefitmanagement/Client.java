package com.credit.crefitmanagement;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Client {

    @NonNull
    private int id;

    @NonNull
    private String nume;

    @NonNull
    private String email;


    private String address;
    private int numar;
    private int varsta;


}

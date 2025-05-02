package com.credit.crefitmanagement;

import lombok.*;


public class CreditService {
    private Client client;
    private Credit credit;
    private Plata plata;


    // Dependency injection prin setter
    public void setClient(Client client) {
        this.client = client;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }

    public void afiseazaDetalii() {
        System.out.println("Client: " + client);
        System.out.println("Credit: " + credit);
        System.out.println("Plata: " + plata);
    }
}

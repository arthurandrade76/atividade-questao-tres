package com.mycompany.inngressos;
public class CamaroteSuperior extends VIP {
private double taxaAdicionalCamarote;

public CamaroteSuperior(double valor, double valorAdicional, double taxaAdicionalCamarote) {
super(valor, valorAdicional);
this.taxaAdicionalCamarote = taxaAdicionalCamarote;
}

public double getValorCamaroteSuperior() {
return getValorVIP() + taxaAdicionalCamarote;
}
}

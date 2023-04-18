/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ej6;

enum Estado{
    grave,medio,leve;
}
enum Especialidad{
    familia,traumotologia,pediatria,internista,otorrino;
}

public class Historia {
    private int indicador;
    private String codigoPaciente;
    private Estado estadoInicial;
    private Especialidad especialdiadMedico;
    private Medico medicoAsignado;
    private boolean altaPaciente;

    public Historia() {
    }

    public Historia(int indicador, String codigoPaciente, Estado estadoInicial, Especialidad especialdiadMedico, Medico medicoAsignado, boolean altaPaciente) {
        this.indicador = indicador;
        this.codigoPaciente = codigoPaciente;
        this.estadoInicial = estadoInicial;
        this.especialdiadMedico = especialdiadMedico;
        this.medicoAsignado = medicoAsignado;
        this.altaPaciente = altaPaciente;
    }

    public int getIndicador() {
        return indicador;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public Especialidad getEspecialdiadMedico() {
        return especialdiadMedico;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public boolean isAltaPaciente() {
        return altaPaciente;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public void setEspecialdiadMedico(Especialidad especialdiadMedico) {
        this.especialdiadMedico = especialdiadMedico;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public void setAltaPaciente(boolean altaPaciente) {
        this.altaPaciente = altaPaciente;
    }
    
    
}

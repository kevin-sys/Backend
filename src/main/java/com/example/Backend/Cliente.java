package com.example.Backend;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String Nombres;
    @Column
    private String Apellidos;
    @Column
    private String Identificacion;
    @Column
    private String CorreoElectronico;
    @Column
    private String TelefonoUno;
    @Column
    private String TelefonoDos;
    @Column
    private String DireccionUno;
    @Column
    private String DireccionDos;

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setCedula(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTelefonoUno() {
        return TelefonoUno;
    }

    public void setTelefonoUno(String TelefonoUno) {
        this.TelefonoUno = TelefonoUno;
    }

    public String getTelefonoDos() {
        return TelefonoDos;
    }

    public void setTelefonoDos(String TelefonoDos) {
        this.TelefonoDos = TelefonoDos;
    }

    public String getDireccionUno() {
        return DireccionUno;
    }

    public void setDireccionUno(String DireccionUno) {
        this.DireccionUno = DireccionUno;
    }

    public String getDireccionDos() {
        return DireccionDos;
    }

    public void setDireccionDos(String DireccionDos) {
        this.DireccionDos = DireccionDos;
    }

}

package ar.hergus.pruebajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jugadores {

    @Id
    private long id_jugador;
    private String apellido;
    private String nombre;
    private String apellido_completo;
    private String nombre_completo;
    private String tipo_documento;
    private long nro_documento;
    private String sobrenombre;
    private String apodo;
    private String cod_puesto;
    private java.sql.Timestamp fecha_nacimiento;
    private String localidad_nacimiento;
    private long provincia_nacimiento;
    private long pais_nacimiento;
    private java.sql.Timestamp fecha_fallecimiento;
    private String dudas;
    private String confirmaciones;
    private String observaciones;
    private String diccionario_a;
    private String diccionario_b;

    public long getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(long id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_completo() {
        return apellido_completo;
    }

    public void setApellido_completo(String apellido_completo) {
        this.apellido_completo = apellido_completo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public long getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(long nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getCod_puesto() {
        return cod_puesto;
    }

    public void setCod_puesto(String cod_puesto) {
        this.cod_puesto = cod_puesto;
    }

    public java.sql.Timestamp getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(java.sql.Timestamp fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLocalidad_nacimiento() {
        return localidad_nacimiento;
    }

    public void setLocalidad_nacimiento(String localidad_nacimiento) {
        this.localidad_nacimiento = localidad_nacimiento;
    }

    public long getProvincia_nacimiento() {
        return provincia_nacimiento;
    }

    public void setProvincia_nacimiento(long provincia_nacimiento) {
        this.provincia_nacimiento = provincia_nacimiento;
    }

    public long getPais_nacimiento() {
        return pais_nacimiento;
    }

    public void setPais_nacimiento(long pais_nacimiento) {
        this.pais_nacimiento = pais_nacimiento;
    }

    public java.sql.Timestamp getFecha_fallecimiento() {
        return fecha_fallecimiento;
    }

    public void setFecha_fallecimiento(java.sql.Timestamp fecha_fallecimiento) {
        this.fecha_fallecimiento = fecha_fallecimiento;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public String getConfirmaciones() {
        return confirmaciones;
    }

    public void setConfirmaciones(String confirmaciones) {
        this.confirmaciones = confirmaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDiccionario_a() {
        return diccionario_a;
    }

    public void setDiccionario_a(String diccionario_a) {
        this.diccionario_a = diccionario_a;
    }

    public String getDiccionario_b() {
        return diccionario_b;
    }

    public void setDiccionario_b(String diccionario_b) {
        this.diccionario_b = diccionario_b;
    }
}
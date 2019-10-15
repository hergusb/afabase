package ar.hergus.pruebajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jugadores {

  @Id
  private long nJugador;
  private String dApellido;
  private String dNombre;
  private String dApellidoComp;
  private String dNombreComp;
  private String dSobrenombre;
  private String dApodo;
  private String cPuesto;
  private java.sql.Timestamp fNacimiento;
  private String dLocalidadNac;
  private long nProvinciaNac;
  private long nPaisNac;
  private java.sql.Timestamp fFallecimiento;
  private String dDudas;
  private String dConfirmaciones;
  private String dObservaciones;
  private String dDiccionarioA;
  private String dDiccionarioB;
  private String cTipoDoc;
  private long nDocumento;


  public long getNJugador() {
    return nJugador;
  }

  public void setNJugador(long nJugador) {
    this.nJugador = nJugador;
  }


  public String getDApellido() {
    return dApellido;
  }

  public void setDApellido(String dApellido) {
    this.dApellido = dApellido;
  }


  public String getDNombre() {
    return dNombre;
  }

  public void setDNombre(String dNombre) {
    this.dNombre = dNombre;
  }


  public String getDApellidoComp() {
    return dApellidoComp;
  }

  public void setDApellidoComp(String dApellidoComp) {
    this.dApellidoComp = dApellidoComp;
  }


  public String getDNombreComp() {
    return dNombreComp;
  }

  public void setDNombreComp(String dNombreComp) {
    this.dNombreComp = dNombreComp;
  }


  public String getDSobrenombre() {
    return dSobrenombre;
  }

  public void setDSobrenombre(String dSobrenombre) {
    this.dSobrenombre = dSobrenombre;
  }


  public String getDApodo() {
    return dApodo;
  }

  public void setDApodo(String dApodo) {
    this.dApodo = dApodo;
  }


  public String getCPuesto() {
    return cPuesto;
  }

  public void setCPuesto(String cPuesto) {
    this.cPuesto = cPuesto;
  }


  public java.sql.Timestamp getFNacimiento() {
    return fNacimiento;
  }

  public void setFNacimiento(java.sql.Timestamp fNacimiento) {
    this.fNacimiento = fNacimiento;
  }


  public String getDLocalidadNac() {
    return dLocalidadNac;
  }

  public void setDLocalidadNac(String dLocalidadNac) {
    this.dLocalidadNac = dLocalidadNac;
  }


  public long getNProvinciaNac() {
    return nProvinciaNac;
  }

  public void setNProvinciaNac(long nProvinciaNac) {
    this.nProvinciaNac = nProvinciaNac;
  }


  public long getNPaisNac() {
    return nPaisNac;
  }

  public void setNPaisNac(long nPaisNac) {
    this.nPaisNac = nPaisNac;
  }


  public java.sql.Timestamp getFFallecimiento() {
    return fFallecimiento;
  }

  public void setFFallecimiento(java.sql.Timestamp fFallecimiento) {
    this.fFallecimiento = fFallecimiento;
  }


  public String getDDudas() {
    return dDudas;
  }

  public void setDDudas(String dDudas) {
    this.dDudas = dDudas;
  }


  public String getDConfirmaciones() {
    return dConfirmaciones;
  }

  public void setDConfirmaciones(String dConfirmaciones) {
    this.dConfirmaciones = dConfirmaciones;
  }


  public String getDObservaciones() {
    return dObservaciones;
  }

  public void setDObservaciones(String dObservaciones) {
    this.dObservaciones = dObservaciones;
  }


  public String getDDiccionarioA() {
    return dDiccionarioA;
  }

  public void setDDiccionarioA(String dDiccionarioA) {
    this.dDiccionarioA = dDiccionarioA;
  }


  public String getDDiccionarioB() {
    return dDiccionarioB;
  }

  public void setDDiccionarioB(String dDiccionarioB) {
    this.dDiccionarioB = dDiccionarioB;
  }


  public String getCTipoDoc() {
    return cTipoDoc;
  }

  public void setCTipoDoc(String cTipoDoc) {
    this.cTipoDoc = cTipoDoc;
  }


  public long getNDocumento() {
    return nDocumento;
  }

  public void setNDocumento(long nDocumento) {
    this.nDocumento = nDocumento;
  }

}

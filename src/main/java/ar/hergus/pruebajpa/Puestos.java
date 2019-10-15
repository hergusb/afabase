package ar.hergus.pruebajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Puestos {

  @Id
  @Column(name="cod_puesto")
  private String codPuesto;
  @Column(name="desc_puesto")
  private String descPuesto;
  @Column(name="nro_orden")
  private long nroOrden;


  public String getCodPuesto() {
    return codPuesto;
  }

  public void setCodPuesto(String codPuesto) {
    this.codPuesto = codPuesto;
  }


  public String getDescPuesto() {
    return descPuesto;
  }

  public void setdescPuesto(String descPuesto) {
    this.descPuesto = descPuesto;
  }


  public long getNroOrden() {
    return nroOrden;
  }

  public void setNroOrden(long nroOrden) {
    this.nroOrden = nroOrden;
  }

}

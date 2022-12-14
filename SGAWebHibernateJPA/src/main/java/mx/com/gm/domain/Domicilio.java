package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Domicilio implements Serializable{
    
    public static final long serialVersionUID = 1L;
    
    //Campos de la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    
    private String calle;
    
    @Column(name = "no_calle")
    private String numeroCalle;
    
    private String pais;

    public Domicilio() {
    }

    public Domicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Domicilio{idDomicilio=").append(idDomicilio);
        sb.append(", calle=").append(calle);
        sb.append(", numeroCalle=").append(numeroCalle);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.idDomicilio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Domicilio other = (Domicilio) obj;
        if (!Objects.equals(this.idDomicilio, other.idDomicilio)) {
            return false;
        }
        return true;
    }    
}

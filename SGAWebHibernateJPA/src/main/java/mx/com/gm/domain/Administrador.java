package mx.com.gm.domain;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import javax.persistence.*;
import mx.com.gm.helper.Md5;

@Entity
public class Administrador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Integer idAdministrador;

    private String nombre;

    private String apellido;

    private String correo;

    /*@Column(name = "password")
    @ColumnTransformer(
            
        write = "HEX(AES_ENCRYPT(?, 'password'))",
        read = "AES_DECRYPT(UNHEX(password),'password')"
    )*/
    private String password;

    public Administrador() {
    }

    public Administrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            
            this.password = Md5.getMd5(password);
            
        } catch (NoSuchAlgorithmException ex) {
            
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrador{idAdministrador=").append(idAdministrador);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", correo=").append(correo);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idAdministrador;
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
        final Administrador other = (Administrador) obj;
        if (this.idAdministrador != other.idAdministrador) {
            return false;
        }
        return true;
    }
}

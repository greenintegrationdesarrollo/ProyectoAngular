package ec.org.isspol.entities.security;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by mauchilan on 20/3/17.
 */

public class Sucursal implements Serializable {
    private int idSucursal;
    private String sucursal;
    private String nombre;
    private String oficina;
    private String creacionUsuario;
    private Timestamp creacionFecha;
    private String modificaUsuario;
    private Timestamp modificaFecha;
    private Collection<Oficina> oficinasByIdSucursal;


    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }


    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }


    public String getCreacionUsuario() {
        return creacionUsuario;
    }

    public void setCreacionUsuario(String creacionUsuario) {
        this.creacionUsuario = creacionUsuario;
    }


    public Timestamp getCreacionFecha() {
        return creacionFecha;
    }

    public void setCreacionFecha(Timestamp creacionFecha) {
        this.creacionFecha = creacionFecha;
    }


    public String getModificaUsuario() {
        return modificaUsuario;
    }

    public void setModificaUsuario(String modificaUsuario) {
        this.modificaUsuario = modificaUsuario;
    }


    public Timestamp getModificaFecha() {
        return modificaFecha;
    }

    public void setModificaFecha(Timestamp modificaFecha) {
        this.modificaFecha = modificaFecha;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sucursal sucursal1 = (Sucursal) o;

        if (idSucursal != sucursal1.idSucursal) return false;
        if (sucursal != null ? !sucursal.equals(sucursal1.sucursal) : sucursal1.sucursal != null) return false;
        if (nombre != null ? !nombre.equals(sucursal1.nombre) : sucursal1.nombre != null) return false;
        if (oficina != null ? !oficina.equals(sucursal1.oficina) : sucursal1.oficina != null) return false;
        if (creacionUsuario != null ? !creacionUsuario.equals(sucursal1.creacionUsuario) : sucursal1.creacionUsuario != null)
            return false;
        if (creacionFecha != null ? !creacionFecha.equals(sucursal1.creacionFecha) : sucursal1.creacionFecha != null)
            return false;
        if (modificaUsuario != null ? !modificaUsuario.equals(sucursal1.modificaUsuario) : sucursal1.modificaUsuario != null)
            return false;
        if (modificaFecha != null ? !modificaFecha.equals(sucursal1.modificaFecha) : sucursal1.modificaFecha != null)
            return false;

        return true;
    }


    public int hashCode() {
        int result = idSucursal;
        result = 31 * result + (sucursal != null ? sucursal.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (oficina != null ? oficina.hashCode() : 0);
        result = 31 * result + (creacionUsuario != null ? creacionUsuario.hashCode() : 0);
        result = 31 * result + (creacionFecha != null ? creacionFecha.hashCode() : 0);
        result = 31 * result + (modificaUsuario != null ? modificaUsuario.hashCode() : 0);
        result = 31 * result + (modificaFecha != null ? modificaFecha.hashCode() : 0);
        return result;
    }


    public Collection<Oficina> getOficinasByIdSucursal() {
        return oficinasByIdSucursal;
    }

    public void setOficinasByIdSucursal(Collection<Oficina> oficinasByIdSucursal) {
        this.oficinasByIdSucursal = oficinasByIdSucursal;
    }
}

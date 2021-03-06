package ec.org.isspol.entities.security;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by mauchilan on 20/3/17.
 */

public class EstacionUsuario implements Serializable {
    private int idEstacionUsuario;
    //private int idEstacion;
    //private int idUsuario;
    private String usuario;
    private String creacionUsuario;
    private Timestamp creacionFecha;
    private String modificaUsuario;
    private Timestamp modificaFecha;
    private Estacion estacionByIdEstacion;
    private Usuario usuarioByIdUsuario;

    public int getIdEstacionUsuario() {
        return idEstacionUsuario;
    }

    public void setIdEstacionUsuario(int idEstacionUsuario) {
        this.idEstacionUsuario = idEstacionUsuario;
    }




    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public Estacion getEstacionByIdEstacion() {
        return estacionByIdEstacion;
    }

    public void setEstacionByIdEstacion(Estacion estacionByIdEstacion) {
        this.estacionByIdEstacion = estacionByIdEstacion;
    }

    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }
}

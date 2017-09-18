
package mx.unam.ciencias.is.mapeobd;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Héctor Santaella Marín
 */
@Entity
@Table (name="usuario")


public class Usuario {
 @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
 @Column(name="idUsuario")
 private int idUsuario;
 @Column (name="nickname")
 private String nickname;
 @Column (name="correo")
 private String correo;
 @Column (name="contrasena")
 private String contrasena;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    @OneToMany(mappedBy="usuario")
    private Set<Marcador> marcadores;
    
}

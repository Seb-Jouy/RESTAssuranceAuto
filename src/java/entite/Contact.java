/**
 * This file was generated by the JPA Modeler
 */ 

package entite;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author  merguez
 */

@Entity@XmlRootElement

public class Contact implements Serializable { 

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Basic
    @NotNull(message="le message ne doit pas être nul")
    private String demande;

    @Basic
    private String email;

    @Basic
    private String login;

    @Basic
    private Timestamp dateDemande;

    @OneToOne
    private TypeDemande typeDemande;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemande() {
        return this.demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Timestamp getDateDemande() {
        return this.dateDemande;
    }

    public void setDateDemande(Timestamp dateDemande) {
        this.dateDemande = dateDemande;
    }

    public TypeDemande getTypeDemande() {
        return this.typeDemande;
    }

    public void setTypeDemande(TypeDemande typeDemande) {
        this.typeDemande = typeDemande;
    }

}
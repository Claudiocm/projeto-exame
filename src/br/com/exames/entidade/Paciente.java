package br.com.exames.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author estagio
 */

public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer pctId;
    private String pctNome;
    private String pctEndereco;
    private String pctSexo;
    private String pctFone;
    private Date pctNascimento;
    private List<Agendamento> consultasList;

    public Paciente() {
    }

    public Paciente(Integer pctId) {
        this.pctId = pctId;
    }

    public Paciente(Integer pctId, String pctNome,String pctSexo, String pctFone,Date pctNascimento, String pctEndereco) {
        this.pctId = pctId;
        this.pctNome = pctNome;
        this.pctEndereco = pctEndereco;
        this.pctSexo = pctSexo;
        this.pctFone = pctFone;
        consultasList = new ArrayList<>();
    }

    public Integer getPctId() {
        return pctId;
    }

    public void setPctId(Integer pctId) {
        this.pctId = pctId;
    }

    public String getPctNome() {
        return pctNome;
    }

    public void setPctNome(String pctNome) {
        this.pctNome = pctNome;
    }

    public String getPctEndereco() {
        return pctEndereco;
    }

    public void setPctEndereco(String pctEndereco) {
        this.pctEndereco = pctEndereco;
    }

    public String getPctSexo() {
        return pctSexo;
    }

    public void setPctSexo(String pctSexo) {
        this.pctSexo = pctSexo;
    }

    public String getPctFone() {
        return pctFone;
    }

    public void setPctFone(String pctFone) {
        this.pctFone = pctFone;
    }

    public Date getPctNascimento() {
        return pctNascimento;
    }

    public void setPctNascimento(Date pctNascimento) {
        this.pctNascimento = pctNascimento;
    }

    @XmlTransient
    public List<Agendamento> getConsultasList() {
        return consultasList;
    }

    public void setConsultasList(List<Agendamento> consultasList) {
        this.consultasList = consultasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pctId != null ? pctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.pctId == null && other.pctId != null) || (this.pctId != null && !this.pctId.equals(other.pctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pctNome;
    }

}

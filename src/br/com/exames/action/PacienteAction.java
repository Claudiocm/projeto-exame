package br.com.exames.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.exames.entidade.Paciente;

public class PacienteAction extends ActionSupport {
	private Paciente paciente;
	private List<Paciente> pacientes;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public String execute() throws Exception {
		if (paciente != null) {
			return "success";
		} else {
			return "success";
		}
	}
	
	public void validate(){
	    if (paciente.getPctNome().length() == 0) {
	        addFieldError("paciente.getPctNome()", "O nome é obrigatório!.");
	    }

	    if (paciente.getPctNascimento().equals(null)) {
	        addFieldError("paciente.getPctNascimento()", "A data de nascimento é obrigatório!.");
	    }

	    if (paciente.getPctSexo().length() == 0) {
	        addFieldError("paciente.getPctSexo()", "O Sexo do paciente é obrigatório");
	    }
	    
	    if(paciente.getPctFone().length() == 0) {
	    	addFieldError("paciente.getPctFone()", "O Telefone é obrigatório!");
	    }
	}
}

package br.com.exames.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.exames.entidade.Agendamento;

public class AgendamentoAction extends ActionSupport {
	private Agendamento agendamento;
	private List<Agendamento> agendamentos;
	
	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public String execute() throws Exception {
		if (agendamento != null) {
			return "success";
		} else {
			return "success";
		}
	}
	
	public void validate(){
	    if (agendamento.getData().equals(null)) {
	        addFieldError("agendamentogetData()", "A data da consulta é obrigatório!.");
	    }

	    if (agendamento.getPaciente().equals(null)) {
	        addFieldError("agendamento.getPaciente()", "O Paciente é obrigatório!.");
	    }

	    if (agendamento.getExame().equals(null)) {
	        addFieldError("agendamento.getExame()", "O Exame é obrigatório");
	    }
	}
}

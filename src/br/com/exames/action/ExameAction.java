package br.com.exames.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.exames.entidade.Exame;

public class ExameAction extends ActionSupport {
	private Exame exame;
	private List<Exame> exames;

	public String adicionar() {
		return "";
	}

	public List<Exame> todosExames() {
		return exames;
	}

	public String atualiza() {
		return "";
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	public String execute() throws Exception {
		if (exame != null) {
			return "success";
		} else {
			return "error";
		}
	}

	public void validate() {
		if (exame.getDescricao().length() == 0) {
			addFieldError("exame.getDescricao", "A descrição é obrigatório!.");
		}

		if (exame.getValor().equals(null)) {
			addFieldError("exame.getValor()", "O valor é obrigatório!.");
		}
	}

}

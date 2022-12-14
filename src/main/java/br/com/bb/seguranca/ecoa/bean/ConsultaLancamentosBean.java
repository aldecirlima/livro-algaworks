package br.com.bb.seguranca.ecoa.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import br.com.bb.seguranca.ecoa.model.Lancamento;
import br.com.bb.seguranca.ecoa.repository.Lancamentos;
import br.com.bb.seguranca.ecoa.util.JpaUtil;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Lancamento> lancamentos;

	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		this.lancamentos = lancamentos.todos();
		manager.close();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
}
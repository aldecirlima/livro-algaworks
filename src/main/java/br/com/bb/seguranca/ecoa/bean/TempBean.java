package br.com.bb.seguranca.ecoa.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;;

@ManagedBean
@ViewScoped
public class TempBean {

	private boolean termoAceito = false;

	public void printTermo() {

		System.out.println(termoAceito);
	}

	public boolean getTermoAceito() {
		return termoAceito;
	}

	public void setTermoAceito(boolean termoAceito) {
		this.termoAceito = termoAceito;
	}

}

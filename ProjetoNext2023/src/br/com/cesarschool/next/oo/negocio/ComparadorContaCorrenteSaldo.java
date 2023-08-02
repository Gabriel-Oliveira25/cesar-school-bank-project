package br.com.cesarschool.next.oo.negocio;

import java.util.Comparator;

import br.com.cesarschool.next.oo.entidade.ContaCorrente;

public class ComparadorContaCorrenteSaldo implements Comparator<ContaCorrente>{
	
	@Override
	public int compare(ContaCorrente o1, ContaCorrente o2) {
		return Double.compare(o1.getSaldo(), o2.getSaldo());
	}
}
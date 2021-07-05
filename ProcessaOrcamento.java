package controller;

import java.util.ArrayList;

import model.Orcamento;
import model.dao.OrcamentoDAO;

public class ProcessaOrcamento {
	public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
	private static OrcamentoDAO pd = new OrcamentoDAO();
	
	public static boolean salvar() {
		return OrcamentoDAO.salvar(orcamentos);
	}
	
	public static void abrir() {
		orcamentos = pd.abrir();
	}
}

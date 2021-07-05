package model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Orcamento;

public class OrcamentoDAO {

	private Orcamento item;
	private ArrayList<Orcamento> itens;
	private BufferedReader br;
	private static BufferedWriter bw;
	private static String arquivo = "./bd/patrimonio.csv";

	public ArrayList<Orcamento> abrir() {
		itens = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(arquivo));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] line_true = line.split(";");
				item = new Orcamento(Integer.parseInt(line_true[0]), line_true[1], line_true[2], line_true[3],
						Integer.parseInt(line_true[4]), Double.parseDouble(line_true[5]));
				itens.add(item);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e);
		}
		return itens;
	}

	public static boolean salvar(ArrayList<Orcamento> it) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			for (Orcamento i : it) {
				bw.write(i.toCsv());
			}
			bw.close();
			return true;
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			return false;

		}
	}

}

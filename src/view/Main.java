package view;

import model.ILista;
import model.Lista;

public class Main {

	public static void main(String[] args) {
		ILista<Integer> lista = new Lista<>();

		try {
			lista.addLast(3);
			lista.addLast(5);
			lista.addLast(18);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(13);
			lista.addLast(4);
			lista.addLast(16);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		int tamanho = lista.size();
		System.out.println("Lista Original");
		try {
			for (int i = 0; i < tamanho; i++) {
				System.out.print(lista.get(i) + " ");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			int tamanhoAux = lista.size();
			while (tamanhoAux > 0) {
				lista.addLast(lista.get(tamanhoAux - 1));
				lista.remove(tamanhoAux - 1);
				tamanhoAux--;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\n");
		System.out.println("Lista Invertida");
		try {
			for (int i = 0; i < tamanho; i++) {
				System.out.print(lista.get(i) + " ");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}

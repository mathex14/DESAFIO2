package br.unipe.mt3.ui;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.unipe.mt3.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		
		 Item  novoItem = new  Item();
		 Item novoItem2 = new Item();
		 
		 
			
		novoItem.setCodigo(554);
		novoItem.setDescricao("queijo");
		novoItem.setPreco(455);
	
		
		novoItem2.setCodigo(52);
		novoItem2.setDescricao("refri");
		novoItem2.setPreco(549);
		 
		 List<Item> listaItem = new ArrayList<>();
		
		listaItem.add(novoItem);	
		listaItem.add(novoItem2);
		
		Collections.sort(listaItem);
		System.out.println(Arrays.toString(listaItem.toArray()));
		
        Collections.reverse(listaItem);
        System.out.println(Arrays.toString(listaItem.toArray()));
		
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>(); //essa class4 pega melhores coisas do veto0r e da lista
		
		
		list.add("Maria");
		list.add("Marcio");
		list.add("Tania");
		list.add("Alex");
		list.add("Anna");
		list.add("Bob");
		
		list.remove(1); //remover da lista por st4ring ou por posição
		
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		list.removeIf(x -> x.charAt(0)== 'M'); // é possivel remover também por predicado
		// remover x tal que x inicie com o character "m"
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("-----------------------");
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Bob: "+ list.indexOf("Roger")); //retorna -1 quando não encontra
		
		System.out.println("-----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
		// exibir elementos que possuam uma caracteristica em comum
		for (String x : result) {
			System.out.println(x);
		}
		
		list.add(2,"Marco"); //tem como co,ocar em posições
		System.out.println(list.size()); //tamanho da lista
		
		//encontra o primeiro elemento com determinada caracteristica
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//Inserir um elemento na lista
		list.add("Maria");
		list.add("Anna");
		list.add("Bob");
		list.add("Alex");
		
		//Inserir um elemento em determinada posi��o
		list.add(0, "fiap");
		
		//Tamanho da lista
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		//Remover
		list.remove("Maria");	//Compara String e remove o semelhante
		list.remove(1);			//Remove pelo indice
		
		//Remover por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		//Fun��o lambda/predicado
		//remover todo os String x, tal que na posi��o 0 de cada palavra seja M
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		//Posi��o de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Index of Marcelo: " + list.indexOf("Marcelo"));	//Quando n�o encontra, retorna -1
		System.out.println("------------------");
		//filtro para pegar aqueles que possuem letra A na posi��o 0
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//da cole��o lista, converte para stream, que aceita fun��es lambda
		//fillter aceita um predicado/lambda
		//Stream n�o � compativel com list
		//funcao collect transforma stream para lista
		for(String x : result) {
			System.out.println(x);
		}
		
		//Encontrar um elemento da lista
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
	}
}

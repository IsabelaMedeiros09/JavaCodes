import java.util.*;

public BubbleSort {
  private List<Integer> numbers = new ArrayList<>();
  
  public BubbleSort(List<Integer> numbers) {
    this.numbers = numbers;
    
    for (Integer i = 0; i < numbers.size(); i++) {
      for (Integer j = 0; j < numbers.size() - 1; j++) {
        if (numbers.get(j) > numbers.get(j + 1)) {
          var temp = numbers.get(j);
          numbers.set(j, numbers.get(j + 1));
          numbers.set(j + 1, temp);
        }
      }
    }
  }
  
  public List<Integer> getList() {
    return this.numbers;
  }
}

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<Integer> lista = new ArrayList<>();
      
      System.out.println("Qual o tamanho da lista? ");
      Integer tamanho = scanner.nextInt();
      
      for (Integer i = 1; i <= tamanho; i++) {
        System.out.println("Digite o valor: ");
        Integer valor = scanner.nextInt();
        
        lista.add(valor);
      }
      BubbleSort bubbleSort = new BubbleSort(lista);
      
      System.out.println("A lista ordenada é: " + bubbleSort.getList());
      
  }
}
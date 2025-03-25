import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AtbashCipher{
  private String frase;
  private String alfabeto = "abcdefghijklmnopqrstuvwxyz";
  private List<String> novaPalavra = new ArrayList<>();
  
  public AtbashCipher(String frase){
    this.frase = frase;
    
    for (char i : frase.toLowerCase().toCharArray()){
      if (alfabeto.contains(String.valueOf(i))){
        var newIndex = alfabeto.length() - 1 - alfabeto.indexOf(String.valueOf(i));
        novaPalavra.add(String.valueOf(alfabeto.charAt(newIndex)));
      } else{
        novaPalavra.add(String.valueOf(i));
      }
    }
  }

 public String getFrase(){
   return String.join("", novaPalavra);
 }
}

public class Main {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Digite a palavra: ");
  String palavra = scanner.nextLine();
  
  AtbashCipher atbashCipher = new AtbashCipher(palavra);
  
  System.out.println("A palavra é: " + atbashCipher.getFrase());
    
  }
}
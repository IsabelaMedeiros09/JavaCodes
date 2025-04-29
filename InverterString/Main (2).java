import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
    System.out.print("Digite uma palavra: ");
     String palavra = scanner.nextLine();
     for(int i = palavra.length() -1; i >= 0; i-- ){
         list.add(String.valueOf(palavra.charAt(i)));
     }
     //para transformar em string podemos utilizar um método chamado "String.valueOf()" tudo oq colocar dentro vai se tornar String.
     
     System.out.println(String.join("",list));
    }
}
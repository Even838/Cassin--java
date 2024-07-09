 import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("   1 para yes 2 para no");
        
        System.out.println("   Casino Java");
        
        int Money = 50;
        
        System.out.println(" money" + Money);
        System.out.println();
        System.out.println("  choice a game:");
        System.out.println("  1 - Dice game");
        System.out.println("  2 the bet");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt(); // Lê a escolha do usuário

        if (escolha == 1) {
            dic();
        }
        else if(escolha == 2){
            time();
        }
        else {
            System.out.println("erro game not exist");
        }
    }
    
    public static void time(){
        System.out.println("will the team ein?");
        Scanner scanner = new Scanner(System.in);
        
        int choice = scanner.nextInt();
        
        int result = 1;
        
        
        
        if(choice == 2){
            System.out.println(" the team won");
            System.out.println("  you won");
            
        }
        else{
            System.out.println(" you lost");
            System.out.println(" the team won");
        }
        
    }
    
    public static void dic() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(6) + 1; // Gera um número entre 1 e 6

        Scanner scanner = new Scanner(System.in);
        System.out.print(" choice a number 1 ,6");
        int palpite = scanner.nextInt();

        if (palpite == numeroAleatorio) {
            System.out.println("  you won");
            
        } else { 
            System.out.println("  you lost the number was " + numeroAleatorio);
            
        }
    }
}

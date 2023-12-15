import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    
    System.out.print("Inserisci la chiave di cifratura: ");
    Matrice matrice = new Matrice(scanner.nextLine().toUpperCase());
    Thread[] runners = new Thread[4];
    runners[0] = new Thread(new Vigenere(0, 12, 0, 12, matrice));
    runners[1] = new Thread(new Vigenere(12, 26, 0, 12, matrice));
    runners[2] = new Thread(new Vigenere(0, 12, 12, 26, matrice));
    runners[3] = new Thread(new Vigenere(12, 26, 12, 26, matrice));
    for(Thread t: runners){
      t.start();
    }
    System.out.println("La matrice è stata popolata!");
    // matrice.stampa();
    
    System.out.print("Inserisci il testo da cifrare: ");
    String testocifrato = matrice.cifra(scanner.nextLine().toUpperCase());
    System.out.println("Testo cifrato: " + testocifrato);
  }
}

// creare 4 thread che popolano i 4 quadranti
// popolare la matrice con i quadranti
// inserire la chiave in input
// inserire il testo in chiaro
// stampare la frase cifrata
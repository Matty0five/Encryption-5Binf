class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    Matrice matrice = new Matrice("prova");
    Vigenere vigenere = new Vigenere(13, 25, 13, 25, matrice);
    Thread runner = new Thread(vigenere);
    runner.start();
    System.out.println("Matrice popolata.");
    matrice.stampa();
  }
}
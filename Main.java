import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int tab[] = {1,2,3,4,5};
    Scanner scan = new Scanner(System.in);
    int dlugosc = tab.length;
    System.out.println("Podaj liczbe a:");
    int x = scan.nextInt();
    int a =tab[x];
    System.out.println("Podaj liczbe b:");
    int z = scan.nextInt();
    int b =tab[z];
    tab[x]=b;
    tab[z]=a;
    for(int i=0;i<dlugosc;i++){

        System.out.print(tab[i]);
    }

  }
}
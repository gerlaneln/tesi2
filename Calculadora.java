public Class Calculadora{
  public static void main(String [] args){
    Scanner ler = new Scanner.System.in;
    int a, b, opcao;
    System.out.println("Entre com os valores de a e b: ");
    a = ler.nextInt();
    b = ler.nextInt();
    System.out.println("Selecione a operação: ");
    System.out.println("1 Soma");
    System.out.println("2 Subtração");
    System.out.println("3 Divisão");
    System.out.println("4 Multiplicação");
    opcao = ler.nextInt();
    case 1:
      System.out.println(a+b);
    case 2:
      System.out.println(a-b);
    case 3:
      System.out.println(a/b);
    case 4:
      System.out.println(a*b);
  
  }
}  

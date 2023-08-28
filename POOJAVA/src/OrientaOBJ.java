import java.util.Scanner;

public class OrientaOBJ {

    public static void main(String[] args) {

        Pessoa1 p = new Pessoa1();
        Pessoa2 p2  = new Pessoa2();
        soma1 s = new soma1();
        Scanner sc = new Scanner(System.in);



        //IDADE PESSOA 1
        System.out.println("antiga:"+ p.idade);
        p.fazAniversario();
        System.out.println("atual:" + p.idade);




        //PESSOA 2
        String exibir =  p2.meunome();
        System.out.println("Meu nome é: "+ exibir);



        //CALCULADORA
        System.out.println("Número 1:");
        s.n1 = sc.nextInt();
        System.out.println("Número 2:");
        s.n2 = sc.nextInt();
        s.soma();







    }
}

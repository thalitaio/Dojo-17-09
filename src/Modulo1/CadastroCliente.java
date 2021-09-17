package Modulo1;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\tCadastro de Cliente");
        System.out.println("\t1 - Cadastrar cliente: ");
        System.out.println("\t2 - Sair");
        System.out.println("Escolher uma opção");

        String nome, sobrenome;
        int op = Integer.parseInt(sc.nextLine());
        switch (op){
            case 1:
                System.out.print("\tDigite o nome do cliente: ");
                nome = sc.nextLine();
            break;
            case 2:
                System.out.print("\tEspero que voce volte na proxima ");
            break;
        }
    }
    
}

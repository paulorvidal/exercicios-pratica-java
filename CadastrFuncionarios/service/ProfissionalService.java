package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Profissional;

public class ProfissionalService {
        static Scanner scan = new Scanner(System.in);
       
    public static List<Profissional> cadastrarProfissional (){
        List<Profissional> professionals = new ArrayList<Profissional>();
        String b1 = "nao";

         do { 

             Profissional funcionario = new Profissional();
             System.out.println("Digite o id do funcionario: ");
             funcionario.setId(scan.nextInt());

             System.out.println("Digite o nome do funcionario: ");
             funcionario.setNome(scan.next());

             System.out.println("Digite a Função do funcionario: ");
             funcionario.setFuncao(scan.next());
             do{
             System.out.println("Deseja parar? ");
             b1 = scan.next().toLowerCase();
             if (!b1.equals("sim") && !b1.equals("nao")){
                System.out.println("opção inalida!! Digite sim ou nao");
             }
            }while(!b1.equals("sim") && !b1.equals("nao"));
            professionals.add(funcionario);
         } while (b1.equals("nao"));
         return professionals;
    }
    public static void listarProfissionals(List<Profissional> profissionals){
        for (Profissional profissional : profissionals) {
                    System.out.println(profissional.toString());
        }
    }
    
}

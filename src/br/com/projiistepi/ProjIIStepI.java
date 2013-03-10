/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author dj002
 */
public class ProjIIStepI {

    public static void main(String[] args) {
        String stringDeConexao = "jdbc:mysql://localhost:3306/projII";
        String usuario = "root";
        String senha = "administrador";
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Abrindo conexão ...");
            Connection conexao =
                    DriverManager.getConnection(stringDeConexao, usuario, senha);
            System.out.println(" Digite o nome do usuario : ");
            String nome = entrada.nextLine();
            System.out.println(" Digite a senha do usuario : ");
            String pass = entrada.nextLine();
            String sql = " INSERT INTO usuarios (nome , senha ) "
                    + " VALUES ('" + nome + " ', '" + pass + " ')";
            PreparedStatement comando =  conexao.prepareStatement(sql);
            System.out.println(" Executando comando ... ");
            comando.execute();
            System.out.println(" Fechando conexão ... ");
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
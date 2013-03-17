/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import java.util.Scanner;

/**
 *
 * @author dj002
 */
public class Persistindo {

    public static void main(String args[]) {
        UsuarioRepository ur = new UsuarioRepository();

        Scanner entrada = new Scanner(System.in);

        Usuario usuario = new Usuario();
        System.out.println(" Digite o nome do usuario: ");
        usuario.setNome(entrada.nextLine());
        System.out.println(" Digite a senha do usuario : ");
        usuario.setSenha(entrada.nextLine());
        
        ur.adiciona(usuario);
        
    }
}

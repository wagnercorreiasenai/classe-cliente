package cadastrocliente;

import modelo.Cliente;

public class CadastroCliente {

    public static void main(String[] args) {
      
        Cliente cli = new Cliente();
        
        cli.codigo = 10;
        cli.nome = "Marcos";
        cli.cpf = "08854212301";
        cli.endereco = "Av. 1º de maio";
        cli.cep = 88352490;
        cli.email = "marcos@gmail.com";
        cli.telefone = "33504226";
        cli.aposentado = false;
        
        //Array de clientes
        Cliente[] listaDeClientes = new Cliente[3];
        
        listaDeClientes[0] = cli;
        
        cli = new Cliente();
        cli.nome = "Deivide";
        cli.cpf = "01526345852";
        listaDeClientes[1] = cli;
        
        cli = new Cliente();
        cli.nome = "Bruno";
        cli.cpf = "48510130252";
        listaDeClientes[2] = cli;
        
        
        for (int i = 0; i < listaDeClientes.length; i++) {
            cli = listaDeClientes[i];
            
            System.out.println("Nome: "+cli.nome);
            System.out.println("CPF: "+cli.cpf);
            System.out.println("");
            
        }
        
        
        
    }
    
}
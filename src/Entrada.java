import model.Cliente;
import model.Pedido;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente(1,"Elia Martínez","eliamartinez@gmail.com");
        Cliente cliente2 = new Cliente(2,"Álvaro Soler","alvarosoler@gmail.com");
        Cliente cliente3 = new Cliente(3,"Tamara Robles","tamararobles@gmail.com");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

        Pedido pedido1 = new Pedido(21,1,"Milhoja crema",5);
        Pedido pedido2 = new Pedido(22,2,"Tarta almendra",3);
        Pedido pedido3 = new Pedido(23,3,"Boina yema",20);
        Pedido pedido4 = new Pedido(24,1,"Delfín chocolate",15);
        Pedido pedido5 = new Pedido(25,2,"Tarta americana",3);

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
    }
}

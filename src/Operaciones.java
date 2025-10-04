import model.Cliente;
import model.Pedido;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Operaciones {

    // metodo para la exporacion de la clase Cliente a csv
    public void exportarCliente(String path) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1, "Elia Martínez", "eliamartinez@gmail.com"));
        listaClientes.add(new Cliente(2, "Álvaro Soler", "alvarosoler@gmail.com"));
        listaClientes.add(new Cliente(3, "Tamara Robles", "tamararobles@gmail.com"));

        File file = new File(path);
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter(file, true));
            writer.println("id,nombre,email");
            for (Cliente cliente : listaClientes) {
                writer.println(cliente);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }

    public void exportarPedido(String path) {

        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new Pedido(21, 1, "Milhoja crema", 5));
        listaPedidos.add(new Pedido(22, 2, "Tarta almendra", 3));
        listaPedidos.add(new Pedido(23, 3, "Boina yema", 20));
        listaPedidos.add(new Pedido(24, 1, "Delfín chocolate", 15));
        listaPedidos.add(new Pedido(25, 2, "Tarta americana", 3));

        File file = new File(path);
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter(file, true));
            writer.println("id,clienteId,producto,cantidad");
            for (Pedido pedido : listaPedidos) {
                writer.println(pedido);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}

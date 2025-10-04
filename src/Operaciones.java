import model.Cliente;
import model.Pedido;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Operaciones {

        private static ArrayList<Cliente> listaClientes = new ArrayList<>();
        private static ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public static void main(String[] args) {

        // Creación de objetos de las dos clases
        Cliente cliente1 = new Cliente(1, "Elia Martínez", "eliamartinez@gmail.com");
        Cliente cliente2 = new Cliente(2, "Álvaro Soler", "alvarosoler@gmail.com");
        Cliente cliente3 = new Cliente(3, "Tamara Robles", "tamararobles@gmail.com");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        Pedido pedido1 = new Pedido(21, 1, "Milhoja crema", 5);
        Pedido pedido2 = new Pedido(22, 2, "Tarta almendra", 3);
        Pedido pedido3 = new Pedido(23, 3, "Boina yema", 20);
        Pedido pedido4 = new Pedido(24, 1, "Delfín chocolate", 15);
        Pedido pedido5 = new Pedido(25, 2, "Tarta americana", 3);

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
    }

    // metodo para la exporacion de la clase Cliente a csv
    public void exportarCliente(String path) {
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
}

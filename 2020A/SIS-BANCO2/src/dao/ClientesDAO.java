package dao;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

/**
 * @author amaranth.rosa
 */
public class ClientesDAO {

	private static List<Cliente> clientes = new ArrayList<Cliente>();

	/* RETORNA CLIENTE PELO CÓD. DO CLIENTE */
	public Cliente encontrarCliente(Long codigoCliente) {
		Cliente clienteEncontrado = new Cliente();

		for (Cliente cliente : listClientes()) {

			if (cliente.getCodigo().equals(codigoCliente)) {
				clienteEncontrado = cliente;
			}
		}

		return clienteEncontrado;
	}

	public void createCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public List<Cliente> listClientes() {
		return clientes;
	}
}

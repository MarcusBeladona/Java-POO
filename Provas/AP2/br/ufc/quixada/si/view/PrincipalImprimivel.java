package Provas.AP2.br.ufc.quixada.si.view;

import Provas.AP2.br.ufc.quixada.si.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrincipalImprimivel {

    public static void main(String[] args) {

        Cliente cliente1 = new ClientePessoaFisica("João", "R Da'Vinci", "4565432-67", LocalDate.of(2000, 11, 27));
        Cliente cliente2 = new ClientePessoaFisica("Maria", "R Burgs", "45424532-67", LocalDate.of(1980, 6, 22));
        Cliente cliente3 = new ClientePessoaJuridica("Andrey", "R Here", "23342-2435.3", LocalDate.of(1997, 2, 13));

        Vendedor vendedor1 = new Vendedor("Rey", "423123-4", "2345", 2000);
        Vendedor vendedor2 = new Vendedor("Thom", "94812-5", "43132", 1000);
        Vendedor vendedor3 = new Vendedor("Correy", "3145536-5", "3434", 1500);

        Contrato contrato1 = new Contrato(1, cliente1, vendedor1, LocalDate.of(2018, 11, 29), 200);
        Contrato contrato2 = new Contrato(2, cliente2, vendedor2, LocalDate.of(2018, 10, 13), 400);
        Contrato contrato3 = new Contrato(3, cliente3, vendedor3, LocalDate.of(2018, 4, 18), 800);

        List<Contrato> contratos = new ArrayList<>();
        contratos.add(contrato1);
        contratos.add(contrato2);
        contratos.add(contrato3);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Operadora  operadora1  = new Operadora(69, "AwaysDead", new ArrayList<>(), new ArrayList<>());
        Imprimivel imprimivel1 = new Operadora(12, "AwaysAlive", contratos, clientes);

        imprimivel1.mostrarContratos();
        operadora1.mostrarContratos();
    }
}

package teste.io;

import modelo.Cliente;
import modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Niko");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}

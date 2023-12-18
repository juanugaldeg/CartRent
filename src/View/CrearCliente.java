package View;
import Model.ArriendoCuota;
import Model.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearCliente extends JFrame {
    Cliente cliente = new Cliente();
    public CrearCliente(){
        //campo nombre
        JTextField tfNombre = new JTextField();
        getContentPane().add(tfNombre,"North");
        tfNombre.setBounds(100,100,200,100);

        // campo run
        JTextField tfRun = new JTextField();
        getContentPane().add(tfRun,"Center");
        tfNombre.setBounds(100,200,200,100);

        //boton agregar
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(100,300,200,100);

        getContentPane().add(btnAgregar, "South");
        btnAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrecliente =  tfNombre.getText();
                String runcliente = tfRun.getText();
                    cliente.setNombre(nombrecliente );
                    cliente.setCedula(runcliente);
                    cliente.setVigente(true);
                    PantallaArriendo(cliente);
                }
        });
    }

    public static ArriendoCuota PantallaArriendo (Cliente cliente){
        ArriendoCuota arriendo = new ArriendoCuota();
        JFrame arriendoconcuotas = new ArriendoConCuotas(cliente);
        arriendoconcuotas.setSize(500,500);
        arriendoconcuotas.setVisible(true);
        return  arriendo;
    }
}

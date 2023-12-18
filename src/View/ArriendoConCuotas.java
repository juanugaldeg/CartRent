package View;
import Model.Cliente;
import Model.Vehiculo;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArriendoConCuotas extends JFrame{

  /*  List<Vehiculo> vehiculo_arriendo2 = new List<Vehiculo>();
   vehiculo_arriendo2.add(new Vehiculo("ABC123", "OK"));
   vehiculo_arriendo2.add(new Vehiculo("XYZ789", "OK")
    */

    public ArriendoConCuotas(Cliente cliente){
    JLabel lblclientes = new JLabel("CLIENTES");

    getContentPane().add(lblclientes).setBounds(100,50,100,20);

    JComboBox cxclientes = new JComboBox();
    getContentPane().add(cxclientes, BorderLayout.CENTER);

    cxclientes.addItem(cliente.getNombre() + " " + cliente.getCedula() );
    JComboBox cxvehiculos = new JComboBox();
    getContentPane().add(cxvehiculos, BorderLayout.AFTER_LAST_LINE);
   /*for( Vehiculo vehiculos : vehiculo_arriendo2){
        cxvehiculos.addItem(vehiculos.getPatente() + " " + vehiculos.getCondicion());
        }*/
        cxvehiculos.addItem("AWERD29 DISPONIBLE");
        cxvehiculos.addItem("KKEEF54 NO DISPONIBLE");

     /*   //Fecha Arriendo
        JTextField tfFechaArriendo = new JTextField();
        getContentPane().add(tfFechaArriendo,"Center");

        //Dias
        JTextField tfDias = new JTextField();
        getContentPane().add(tfDias,"Center");

        //Precio Por dia
        JTextField tfPrecioporDias = new JTextField();
        getContentPane().add(tfPrecioporDias,"Center");
*/

    }


}

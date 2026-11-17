package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
    	txtNombre = new JTextField(20);
    	JPanel fila1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	fila1.add(new JLabel("Nombre "));
    	fila1.add(txtNombre);
    	
        // Crea el selector para la calificación con una etiqueta al frente
    	String[] calificaciones = {"1","2","3","4","5",};
    	cbbCalificacion = new JComboBox<String>(calificaciones);
    	JPanel fila2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	fila2.add(new JLabel("Calificación "));
    	fila2.add(cbbCalificacion);
    	

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
    	String[] opciones = {"Sí", "No"};
        cbbVisitado = new JComboBox<String>(opciones);
        JPanel fila3 = new JPanel( new FlowLayout(FlowLayout.LEFT));
        fila3.add(new JLabel("Visitado "));
    	fila3.add(cbbVisitado);

        // Agregar todos los elementos al panel
        setLayout(new GridLayout(3,1));
        add(fila1);
        add(fila2);
        add(fila3);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	String esvisitado = (String) cbbVisitado.getSelectedItem();
    	return esvisitado.equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText();
    }
}

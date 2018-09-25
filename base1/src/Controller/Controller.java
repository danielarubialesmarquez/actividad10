package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import View.View;
import javax.swing.JOptionPane;
/**
 *
 * @author Dani
 */
public class Controller implements ActionListener {
    
    private final Model Model;
    private final View View;
 
    public Controller(Model Model, View View){
        this.Model = Model;
        this.View = View;
        View.jb_guardar.addActionListener(this);
        View.jb_nuevo.addActionListener(this);
         
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.jb_guardar){
            Model.setPath("C:\\Users\\Dani\\Documents\\4 cuatri\\chava\\base.csv");
            String name = View.jtf_nombre.getText();
            String email = View.jtf_email.getText();
            System.out.println("buuuuuuuh");
            System.out.println(email);
            String message="";
            message+=name+","+email+"\n";
            Model.setMessage(message);
            Model.writeFile(Model.getPath(), Model.getMessage());
            JOptionPane.showMessageDialog(View, "Listo amiguito!");
        }else if(e.getSource()==View.jb_nuevo){
            View.jtf_email.setText(null);
            View.jtf_nombre.setText(null);
        }
    }
    private void initView() {
        View.setTitle("CSV v 0.1");
        View.setResizable(false);
        View.setLocationRelativeTo(null);
        View.setVisible(true);
    } 
    
}


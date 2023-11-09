import java.awt.event.*;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class Interface extends JFrame {

    private ControlaEquipes controlaEquipe;

    public Interface() {
        setTitle("Trabalho 3 - Nicolas Docolas");
        controlaEquipe = new ControlaEquipes();
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jlbCodinome = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jtfCodinome = new JTextField();
        jtfQuantidade = new JTextField();
        jtfLatitude = new JTextField();
        jtfLongitude = new JTextField();
        jbtSalvar = new JButton();
        jbtLimpar = new JButton();
        jbtVerTodos = new JButton();
        jbtSair = new JButton();
        jScrollPane1 = new JScrollPane();
        jtaSystemOut = new JTextArea();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jlbCodinome.setText("Codinome");

        jLabel2.setText("Quantidade");

        jLabel3.setText("Latitude");

        jLabel4.setText("Longitude");

        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(e -> jbtSalvarActionPerformed(e));

        jbtLimpar.setText("Limpar");
        jbtLimpar.addActionListener(e -> jbtLimparActionPerformed(e));

        jbtVerTodos.setText("Ver Todos");
        jbtVerTodos.addActionListener(e -> jbtVerTodosActionPerformed(e));

        jbtSair.setText("Sair");
        jbtSair.addActionListener(e -> jbtSairActionPerformed(e));

        jtaSystemOut.setEditable(false);
        jtaSystemOut.setColumns(20);
        jtaSystemOut.setRows(5);
        jScrollPane1.setViewportView(jtaSystemOut);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtLimpar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtVerTodos, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtSair, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 70,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfLongitude))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 70,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfLatitude))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 70,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfQuantidade))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlbCodinome, GroupLayout.PREFERRED_SIZE, 70,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfCodinome)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlbCodinome)
                                        .addComponent(jtfCodinome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jtfQuantidade, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jtfLatitude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jtfLongitude, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(jbtSalvar)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtLimpar)
                                        .addComponent(jbtVerTodos)
                                        .addComponent(jbtSair))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)));

        pack();
    }

    private void jbtSalvarActionPerformed(ActionEvent evt) {
        if(jtfCodinome.getText().equals("") || 
        jtfLatitude.getText().equals(("")) ||
        jtfQuantidade.getText().equals(("")) ||
        jtfLongitude.getText().equals((""))) {return;}
        
        Equipe equipe = null;
        try {
            equipe = new Equipe(jtfCodinome.getText(),
                    Integer.parseInt(jtfQuantidade.getText()),
                    Double.parseDouble(jtfLatitude.getText()),
                    Double.parseDouble(jtfLongitude.getText()));
        } catch (NumberFormatException e) {}
        

        if (controlaEquipe.adicionarEquipe(equipe))
            jtaSystemOut.append("\nAdicionado: " + jtfCodinome.getText() + "\n");
        else
            jtaSystemOut.append("\nNao adicionou\n");

        jtfCodinome.setText("");
        jtfQuantidade.setText("");
        jtfLatitude.setText("");
        jtfLongitude.setText("");
    }

    private void jbtSairActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jbtLimparActionPerformed(ActionEvent evt) {
        jtfCodinome.setText("");
        jtfQuantidade.setText("");
        jtfLatitude.setText("");
        jtfLongitude.setText("");
        jtaSystemOut.setText("");
    }

    private void jbtVerTodosActionPerformed(ActionEvent evt) {
        jtaSystemOut.setText(controlaEquipe.toString());
    }

    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JButton jbtLimpar;
    private JButton jbtSair;
    private JButton jbtSalvar;
    private JButton jbtVerTodos;
    private JLabel jlbCodinome;
    private JTextArea jtaSystemOut;
    private JTextField jtfCodinome;
    private JTextField jtfLatitude;
    private JTextField jtfLongitude;
    private JTextField jtfQuantidade;
}

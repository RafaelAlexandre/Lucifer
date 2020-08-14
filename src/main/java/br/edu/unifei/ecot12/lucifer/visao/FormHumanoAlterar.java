package br.edu.unifei.ecot12.lucifer.visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot12.lucifer.Humano;
import br.edu.unifei.ecot12.lucifer.PecadoEnum;
import br.edu.unifei.ecot12.lucifer.dao.HumanoDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class FormHumanoAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtSexo;
	private JTextField txtProfissao;
	private Humano hum;
	private HumanoDAO humdao = new HumanoDAO();
	private List <PecadoEnum> pec = new ArrayList<>();
	private JTextField txtNome;


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormHumanoAlterar frame = new FormHumanoAlterar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormHumanoAlterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(54, 81, 42, 14);
		contentPane.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(117, 78, 211, 20);
		contentPane.add(txtSexo);
		
		txtNome = new JTextField();
		txtNome.setBounds(117, 133, 211, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblProfissao = new JLabel("Profissao:");
		lblProfissao.setBounds(54, 109, 59, 14);
		contentPane.add(lblProfissao);
		
		txtProfissao = new JTextField();
		txtProfissao.setColumns(10);
		txtProfissao.setBounds(117, 106, 211, 20);
		contentPane.add(txtProfissao);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(32, 211, 320, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPecados = new JLabel("SELECIONE OS PECADOS:");
		lblPecados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPecados.setBounds(68, 11, 184, 14);
		panel.add(lblPecados);
		
		JLabel lblGula = new JLabel("GULA");
		lblGula.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGula.setForeground(new Color(128, 0, 0));
		lblGula.setBounds(38, 63, 46, 14);
		panel.add(lblGula);
		
		JLabel lblAvareza = new JLabel("AVAREZA");
		lblAvareza.setForeground(new Color(128, 0, 0));
		lblAvareza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAvareza.setBounds(125, 63, 81, 14);
		panel.add(lblAvareza);
		
		JLabel lblLuxuria = new JLabel("LUXURIA");
		lblLuxuria.setForeground(new Color(128, 0, 0));
		lblLuxuria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLuxuria.setBounds(216, 63, 81, 14);
		panel.add(lblLuxuria);
		
		JLabel lblIra = new JLabel("IRA");
		lblIra.setForeground(new Color(128, 0, 0));
		lblIra.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIra.setBounds(38, 136, 46, 14);
		panel.add(lblIra);
		
		JLabel lblInveja = new JLabel("INVEJA");
		lblInveja.setForeground(new Color(128, 0, 0));
		lblInveja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInveja.setBounds(125, 136, 81, 14);
		panel.add(lblInveja);
		
		JLabel lblPreguica = new JLabel("PREGUI\u00C7A");
		lblPreguica.setForeground(new Color(128, 0, 0));
		lblPreguica.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPreguica.setBounds(216, 136, 81, 14);
		panel.add(lblPreguica);
		
		JLabel lblVaidade = new JLabel("VAIDADE");
		lblVaidade.setForeground(new Color(128, 0, 0));
		lblVaidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVaidade.setBounds(125, 208, 81, 14);
		panel.add(lblVaidade);
		
		final JCheckBox cbxGula = new JCheckBox("");
		cbxGula.setBounds(48, 81, 33, 23);
		panel.add(cbxGula);
		
		final JCheckBox cbxAvareza = new JCheckBox("");
		cbxAvareza.setBounds(144, 81, 33, 23);
		panel.add(cbxAvareza);
		cbxAvareza.setSelected(false);
		
		final JCheckBox cbxLuxuria = new JCheckBox("");
		cbxLuxuria.setBounds(243, 81, 33, 23);
		panel.add(cbxLuxuria);
		
		final JCheckBox cbxIra = new JCheckBox("");
		cbxIra.setBounds(48, 157, 33, 23);
		panel.add(cbxIra);
		
		final JCheckBox cbxInveja = new JCheckBox("");
		cbxInveja.setBounds(144, 157, 33, 23);
		panel.add(cbxInveja);
		
		final JCheckBox cbxPreguica = new JCheckBox("");
		cbxPreguica.setBounds(243, 157, 33, 23);
		panel.add(cbxPreguica);
		
		final JCheckBox cbxVaidade = new JCheckBox("");
		cbxVaidade.setBounds(144, 229, 33, 23);
		panel.add(cbxVaidade);
		
		JLabel lblPecador = new JLabel("N\u00EDvel de pecado:");
		lblPecador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPecador.setBounds(111, 303, 128, 14);
		panel.add(lblPecador);
		
		JComboBox cmbPecador = new JComboBox();
		cmbPecador.setBounds(238, 301, 59, 22);
		panel.add(cmbPecador);
		cmbPecador.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		cmbPecador.setEditable(true);
		
		final JComboBox <Integer> cbxID = new JComboBox();
		cbxID.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				hum = humdao.find((Integer) cbxID.getSelectedItem());
				if(hum != null) {
					//txtNome.setText(hum.getNome());
					txtSexo.setText(hum.getSexo());
					txtProfissao.setText(hum.getProfissao());
					pec = hum.getPecados();
					
					cbxAvareza.setSelected(false);
					cbxGula.setSelected(false);
					cbxInveja.setSelected(false);
					cbxIra.setSelected(false);
					cbxLuxuria.setSelected(false);
					cbxPreguica.setSelected(false);
					cbxVaidade.setSelected(false);
					
					for(PecadoEnum p : pec) {
						
						if(p == PecadoEnum.AVAREZA) {
							cbxAvareza.setSelected(true);
						}
						
						if(p == PecadoEnum.GULA) {
							cbxGula.setSelected(true);
						}
						
						if(p == PecadoEnum.INVEJA) {
							cbxInveja.setSelected(true);
						}
						
						if(p == PecadoEnum.IRA) {
							cbxIra.setSelected(true);
						}
						
						if(p == PecadoEnum.LUXURIA) {
							cbxLuxuria.setSelected(true);
						}
						
						if(p == PecadoEnum.PREGUICA) {
							cbxPreguica.setSelected(true);
						}
						
						if(p == PecadoEnum.VAIDADE) {
							cbxVaidade.setSelected(true);
						}
						
					}
				}
			}
		});
		cbxID.setBounds(117, 49, 211, 22);
		contentPane.add(cbxID);
		List <Integer> l = humdao.codigosHumano();
		for(Integer item : l) {
			cbxID.addItem(item);
		}
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(155, 577, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(263, 577, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblAlterarHumano = new JLabel("ALTERAR HUMANO");
		lblAlterarHumano.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterarHumano.setBounds(119, 11, 150, 14);
		contentPane.add(lblAlterarHumano);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setForeground(new Color(0, 0, 128));
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setBounds(103, 179, 177, 14);
		contentPane.add(lblDestino);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(54, 53, 42, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(54, 136, 46, 14);
		contentPane.add(lblNome);
	}
}

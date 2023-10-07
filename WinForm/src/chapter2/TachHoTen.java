package chapter2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TachHoTen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfHoVaTen;
	private JTextField tfHo;
	private JTextField tfTenDem;
	private JTextField tfTen;
	private JLabel errorLog;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TachHoTen frame = new TachHoTen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TachHoTen() {
		setForeground(new Color(128, 255, 255));
		setType(Type.UTILITY);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Tách họ tên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbHoTen = new JLabel("Họ và tên");
		lbHoTen.setFont(new Font("Serif", Font.PLAIN, 16));
		lbHoTen.setBounds(10, 35, 76, 19);
		contentPane.add(lbHoTen);
		
		JLabel lbHo = new JLabel("Họ");
		lbHo.setFont(new Font("Serif", Font.PLAIN, 14));
		lbHo.setBounds(10, 89, 76, 19);
		contentPane.add(lbHo);
		
		JLabel lbTenDem = new JLabel("Tên đệm");
		lbTenDem.setFont(new Font("Serif", Font.PLAIN, 14));
		lbTenDem.setBounds(10, 146, 76, 19);
		contentPane.add(lbTenDem);
		
		JLabel lbTen = new JLabel("Tên");
		lbTen.setFont(new Font("Serif", Font.PLAIN, 14));
		lbTen.setBounds(10, 201, 76, 19);
		contentPane.add(lbTen);
		
		tfHoVaTen = new JTextField();
		tfHoVaTen.setBounds(112, 35, 279, 27);
		contentPane.add(tfHoVaTen);
		tfHoVaTen.setColumns(10);
		
		tfHo = new JTextField();
		tfHo.setColumns(10);
		tfHo.setBounds(112, 91, 279, 27);
		contentPane.add(tfHo);
		
		tfTenDem = new JTextField();
		tfTenDem.setColumns(10);
		tfTenDem.setBounds(112, 148, 279, 27);
		contentPane.add(tfTenDem);
		
		tfTen = new JTextField();
		tfTen.setColumns(10);
		tfTen.setBounds(112, 203, 279, 27);
		contentPane.add(tfTen);
		
		errorLog = new JLabel("");
		errorLog.setForeground(new Color(255, 0, 0));
		errorLog.setFont(new Font("Serif", Font.BOLD, 12));
		errorLog.setBounds(112, 246, 387, 19);
		contentPane.add(errorLog);
		
		JButton btnNewButton = new JButton("Tách nào");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBounds(112, 269, 153, 40);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] trySplit = tfHoVaTen.getText().split("\\s");
				
				if (trySplit.length < 2) {
					errorLog.setText("Vui lòng nhập đúng tên.");
					return;
				}
				
				if (trySplit.length > 2 && trySplit.length < 4) {
					tfHo.setText(trySplit[0]);
					tfTenDem.setText(trySplit[1]);
					tfTen.setText(trySplit[2]);
				}
				
				if (trySplit.length < 3) {
					tfHo.setText(trySplit[0]);
					tfTen.setText(trySplit[1]);
				}
				
				if (trySplit.length >= 4) {
					tfHo.setText(trySplit[0]);
					
					int i = 0;
					String tx = "";
					for (String w : trySplit) {
						if (i > 0 && i < trySplit.length - 1) tx += w + " ";
						i++;
					}
					
					tfTenDem.setText(tx);
					tfTen.setText(trySplit[trySplit.length - 1]);
				}
			}
		});
		contentPane.add(btnNewButton);
	}
}

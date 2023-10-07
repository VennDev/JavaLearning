package chapter1;

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

public class FrmManHinhTong2SoNguyen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoNguyenThuNhat;
	private JTextField txtSoNguyenThuHai;
	private JTextField txtKetQua;
	private JLabel label_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManHinhTong2SoNguyen frame = new FrmManHinhTong2SoNguyen();
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
	public FrmManHinhTong2SoNguyen() {
		setForeground(new Color(128, 255, 255));
		setType(Type.UTILITY);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Tổng 2 số nguyên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label_1 = new JLabel("Tính tổng 2 số nguyên");
		label_1.setFont(new Font("Serif", Font.BOLD, 18));
		label_1.setBounds(176, 10, 178, 45);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("Số nguyên thứ nhất:");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel.setBounds(45, 99, 126, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số nguyên thứ hai:");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 160, 126, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả: ");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_2.setBounds(45, 221, 58, 19);
		contentPane.add(lblNewLabel_2);
		
		txtSoNguyenThuNhat = new JTextField();
		txtSoNguyenThuNhat.setBounds(196, 90, 126, 28);
		contentPane.add(txtSoNguyenThuNhat);
		txtSoNguyenThuNhat.setColumns(10);
		
		txtSoNguyenThuHai = new JTextField();
		txtSoNguyenThuHai.setBounds(196, 158, 126, 28);
		contentPane.add(txtSoNguyenThuHai);
		txtSoNguyenThuHai.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setBounds(196, 219, 126, 28);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(196, 285, 365, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Tổng");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBounds(196, 331, 126, 28);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (isInteger(txtSoNguyenThuNhat.getText()) && isInteger(txtSoNguyenThuHai.getText())) {
            		int ketQua = Integer.parseInt(txtSoNguyenThuNhat.getText()) + Integer.parseInt(txtSoNguyenThuHai.getText());
            		txtKetQua.setText(String.valueOf(ketQua));
            	} else {
            		lblNewLabel_3.setText("Vui lòng nhập đúng 2 số cần tính!");
            	}
            }
        });
		contentPane.add(btnNewButton);
	}
	
	public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
}

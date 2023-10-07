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

import java.text.NumberFormat;
import java.util.Locale;

public class FrmManHinhTinhTien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoLuong;
	private JTextField txtDonGia;
	private JTextField txtThanhTien;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManHinhTinhTien frame = new FrmManHinhTinhTien();
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
	public FrmManHinhTinhTien() {
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
		
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
		
		label_1 = new JLabel("Tính giá trị hóa đơn");
		label_1.setFont(new Font("Serif", Font.BOLD, 18));
		label_1.setBounds(176, 10, 178, 45);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("Số lượng:");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel.setBounds(45, 99, 126, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Đơn giá:");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 160, 126, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thành tiền: ");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_2.setBounds(45, 221, 81, 19);
		contentPane.add(lblNewLabel_2);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(196, 90, 126, 28);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(196, 158, 126, 28);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setBounds(196, 219, 126, 28);
		contentPane.add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		label_2 = new JLabel("");
		label_2.setFont(new Font("Serif", Font.BOLD, 12));
		label_2.setForeground(Color.RED);
		label_2.setBounds(196, 285, 365, 13);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Tổng");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBounds(196, 331, 126, 28);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (isInteger(txtSoLuong.getText()) && isInteger(txtDonGia.getText())) {
            		int ketQua = Integer.parseInt(txtSoLuong.getText()) * Integer.parseInt(txtDonGia.getText());
            		txtThanhTien.setText(numberFormat.format(ketQua));
            	} else {
            		txtThanhTien.setText("Vui lòng nhập đúng 2 số cần tính!");
            	}
            }
        });
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("VNĐ");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(332, 173, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VNĐ");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(332, 234, 45, 13);
		contentPane.add(lblNewLabel_4);
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

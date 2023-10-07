package chapter3;

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
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JSeparator;

public class ThManHinhHienThi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputHoTen;
	private JTextField inputSDT;
	private JTextField inputHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThManHinhHienThi frame = new ThManHinhHienThi();
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
	public ThManHinhHienThi() {
		setForeground(new Color(128, 255, 255));
		setType(Type.UTILITY);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Thông tin liên hệ");
		title.setFont(new Font("Serif", Font.PLAIN, 16));
		title.setBounds(10, 10, 650, 27);
		contentPane.add(title);
		
		JLabel hoTen = new JLabel("Họ tên");
		hoTen.setFont(new Font("Serif", Font.PLAIN, 14));
		hoTen.setBounds(10, 59, 78, 27);
		contentPane.add(hoTen);
		
		JLabel sdt = new JLabel("SĐT");
		sdt.setFont(new Font("Serif", Font.PLAIN, 14));
		sdt.setBounds(10, 96, 78, 27);
		contentPane.add(sdt);
		
		JLabel hinhAnh = new JLabel("Hình ảnh");
		hinhAnh.setFont(new Font("Serif", Font.PLAIN, 14));
		hinhAnh.setBounds(10, 133, 78, 27);
		contentPane.add(hinhAnh);
		
		inputHoTen = new JTextField();
		inputHoTen.setFont(new Font("Serif", Font.PLAIN, 14));
		inputHoTen.setBounds(98, 59, 500, 25);
		contentPane.add(inputHoTen);
		inputHoTen.setColumns(10);
		
		inputSDT = new JTextField();
		inputSDT.setFont(new Font("Serif", Font.PLAIN, 14));
		inputSDT.setColumns(10);
		inputSDT.setBounds(98, 102, 251, 25);
		contentPane.add(inputSDT);
		
		inputHinhAnh = new JTextField();
		inputHinhAnh.setFont(new Font("Serif", Font.PLAIN, 14));
		inputHinhAnh.setColumns(10);
		inputHinhAnh.setBounds(98, 139, 500, 25);
		contentPane.add(inputHinhAnh);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 226, 611, 2);
		contentPane.add(separator);
		
		JLabel view1 = new JLabel("");
		view1.setBounds(10, 264, 114, 27);
		contentPane.add(view1);
		
		JLabel view2 = new JLabel("");
		view2.setBounds(10, 319, 114, 27);
		contentPane.add(view2);
		
		JLabel view3 = new JLabel("");
		view3.setBounds(10, 368, 114, 27);
		contentPane.add(view3);
		
		JLabel v1 = new JLabel("");
		v1.setFont(new Font("Serif", Font.PLAIN, 14));
		v1.setBounds(177, 264, 88, 13);
		contentPane.add(v1);
		
		JLabel v2 = new JLabel("");
		v2.setFont(new Font("Serif", Font.PLAIN, 14));
		v2.setBounds(177, 319, 88, 13);
		contentPane.add(v2);
		
		JLabel v3 = new JLabel("");
		v3.setFont(new Font("Serif", Font.PLAIN, 14));
		v3.setBounds(177, 368, 88, 13);
		contentPane.add(v3);
		
		JButton hienThi = new JButton("Hiển thị");
		hienThi.setFont(new Font("Serif", Font.PLAIN, 14));
		hienThi.setBounds(260, 174, 105, 42);
		hienThi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fcs = new JFileChooser();
				fcs.showOpenDialog(null);
			}
		});
		contentPane.add(hienThi);
	}
}

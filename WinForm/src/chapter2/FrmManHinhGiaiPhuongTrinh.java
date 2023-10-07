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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmManHinhGiaiPhuongTrinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputA;
	private JTextField inputB;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManHinhGiaiPhuongTrinh frame = new FrmManHinhGiaiPhuongTrinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	// You should input data is error<JLabel>
	private void calculate(JLabel error) {
		if (!isInteger(inputA.getText()) || !isInteger(inputB.getText())) {
			error.setText("Bạn phải nhập a/b là một giá trị số!");
		} else {
			double result = -Float.parseFloat(inputB.getText()) / Float.parseFloat(inputA.getText());
			this.result.setText(String.valueOf(result));
		}
	}
	
	private void reset() {
		inputA.setText("");
		inputB.setText("");
		result.setText("");
	}

	/**
	 * Create the frame.
	 */
	public FrmManHinhGiaiPhuongTrinh() {
		setForeground(new Color(128, 255, 255));
		setType(Type.UTILITY);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Giải phương trình bậc 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Giải phương trình bậc nhất ax + b = 0");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Serif", Font.BOLD, 14));
		title.setBounds(44, 10, 401, 42);
		contentPane.add(title);
		
		JLabel txtGiaTriA = new JLabel("Nhập a:");
		txtGiaTriA.setFont(new Font("Serif", Font.BOLD, 14));
		txtGiaTriA.setBounds(44, 72, 60, 18);
		contentPane.add(txtGiaTriA);
		
		JLabel txtGiaTriB = new JLabel("Nhập b:");
		txtGiaTriB.setFont(new Font("Serif", Font.BOLD, 14));
		txtGiaTriB.setBounds(44, 124, 60, 18);
		contentPane.add(txtGiaTriB);
		
		JLabel txtKetQua = new JLabel("Kết quả:");
		txtKetQua.setFont(new Font("Serif", Font.BOLD, 14));
		txtKetQua.setBounds(44, 182, 60, 18);
		contentPane.add(txtKetQua);
		
		inputA = new JTextField();
		inputA.setBounds(126, 73, 211, 22);
		contentPane.add(inputA);
		inputA.setColumns(10);
		
		inputB = new JTextField();
		inputB.setColumns(10);
		inputB.setBounds(126, 125, 211, 22);
		contentPane.add(inputB);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(126, 183, 211, 22);
		contentPane.add(result);
		
		JLabel error = new JLabel("");
		error.setFont(new Font("Serif", Font.BOLD, 11));
		error.setForeground(Color.RED);
		error.setBounds(44, 215, 401, 36);
		contentPane.add(error);
		
		JButton calculateButton = new JButton("Tính");
		calculateButton.setFont(new Font("Serif", Font.BOLD, 14));
		calculateButton.setBounds(98, 261, 85, 42);
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(error);
			}
		});
		contentPane.add(calculateButton);
		
		JButton inputAgain = new JButton("Nhập lại");
		inputAgain.setFont(new Font("Serif", Font.BOLD, 14));
		inputAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
				error.setText("");
			}
		});
		inputAgain.setBounds(193, 261, 144, 42);
		contentPane.add(inputAgain);
	}
}

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

public class FrmManHinhTinhGiaiThua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputXf;
	private JTextField resultF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManHinhTinhGiaiThua frame = new FrmManHinhTinhGiaiThua();
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
	
    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }

	/**
	 * Create the frame.
	 */
	public FrmManHinhTinhGiaiThua() {
		setForeground(new Color(128, 255, 255));
		setType(Type.UTILITY);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Tính giai thừa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Tính giai thừa của x");
		title.setFont(new Font("Serif", Font.BOLD, 14));
		title.setBounds(50, 22, 386, 26);
		contentPane.add(title);
		
		JLabel inputX = new JLabel("Nhập x:");
		inputX.setFont(new Font("Serif", Font.BOLD, 14));
		inputX.setBounds(50, 86, 56, 20);
		contentPane.add(inputX);
		
		JLabel result = new JLabel("Kết quả:");
		result.setFont(new Font("Serif", Font.BOLD, 14));
		result.setBounds(50, 139, 56, 20);
		contentPane.add(result);
		
		inputXf = new JTextField();
		inputXf.setBounds(128, 82, 174, 26);
		contentPane.add(inputXf);
		inputXf.setColumns(10);
		
		resultF = new JTextField();
		resultF.setColumns(10);
		resultF.setBounds(128, 139, 174, 26);
		contentPane.add(resultF);
		
		JLabel error = new JLabel("");
		error.setForeground(new Color(255, 0, 0));
		error.setFont(new Font("Serif", Font.PLAIN, 12));
		error.setBounds(50, 169, 396, 26);
		contentPane.add(error);
		
		JButton resetButton = new JButton("Nhập lại");
		resetButton.setFont(new Font("Serif", Font.BOLD, 14));
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputXf.setText("");
				resultF.setText("");
				error.setText("");
			}
		});
		resetButton.setBounds(195, 202, 107, 35);
		contentPane.add(resetButton);
		
		JButton calculate = new JButton("Tính");
		calculate.setFont(new Font("Serif", Font.BOLD, 14));
		calculate.setBounds(105, 202, 80, 35);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isInteger(inputXf.getText())) {
					int input = Integer.parseInt(inputXf.getText());
					
					if (input < 0) {
						error.setText("Vui lòng nhập số nguyên dương!");
						return;
					}
					
					long result = tinhGiaithua(input);
					resultF.setText(String.valueOf(result));
				}
			}
		});
		contentPane.add(calculate);
	}
}

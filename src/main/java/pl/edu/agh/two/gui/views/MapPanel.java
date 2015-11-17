package pl.edu.agh.two.gui.views;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Jakub Sloniec
 * @since 17 lis 2015
 */
@SuppressWarnings("serial")
public class MapPanel extends JPanel {
	private JScrollPane scrollPane;

	public MapPanel() {
		setBounds(new Rectangle(0, 0, 280, 280));
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane);

		// Image map = null;
		// try {
		// map =
		// ImageIO.read(getClass().getClassLoader().getResourceAsStream("map.gif"));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// JLabel label = new JLabel(new ImageIcon(map));
		//
		// scrollPane.setViewportView(label);
	}

	public void setTable(JTable table) {
		scrollPane.setViewportView(table);
	}

}
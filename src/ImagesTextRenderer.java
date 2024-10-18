import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ImagesTextRenderer extends JLabel implements ListCellRenderer{

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		//get values
		ImageAndText imgTxt = (ImageAndText)value;
		
		//set values from created class that extends JLabel
		setIcon(imgTxt.getImg());
		setText(imgTxt.getName());
		
		if(isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		return this;
	}

}

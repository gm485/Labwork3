import javax.swing.Icon;

public class ImageAndText {
	private Icon img;
	private String name;
	
	public ImageAndText(Icon img, String name) {
		super();
		this.img = img;
		this.name = name;
	}
	public Icon getImg() {
		return this.img;
	}
	public void setImg(Icon img) {
		this.img = img;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

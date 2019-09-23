package codechicken.nei;

public abstract class ButtonCycled extends Button {
	public int index;
	public Image[] icons;

	@Override
	public Image getRenderIcon() {
		return icons[index];
	}
}

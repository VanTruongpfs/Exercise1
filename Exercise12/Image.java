package Exercise12;

public class Image {
	private int height;
	private int width;
	private String source;
	private String quality;
/**
 * this is a image constructor;
 * 
 * @param height: height
 * @param width: width
 * @param source: source
 * @param quality: quality
 * 
 * ex:
 * new Image(5, 10, "small.gif", "low");
 * new Image(120, 200, "med.gif", "low");
 * new Image(1200, 1000, "large.gif", "high");
 */
public Image(int height, int width, String source, String quality) {
	super();
	this.height = height;
	this.width = width;
	this.source = source;
	this.quality = quality;
}
}

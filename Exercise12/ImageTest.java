/**
 * 
 */
package Exercise12;

import org.junit.jupiter.api.Test;

/**
 * this is Junit test of image;
 */

class ImageTest {
	
/**
* this is a constructor's test;
*ex:
* new Image(5, 10, "small.gif", "low");
* new Image(120, 200, "med.gif", "low");
* new Image(1200, 1000, "large.gif", "high");
*/
	
	@Test
	void testConstructor() {
		new Image(5, 10, "small.gif", "low");
		new Image(120, 200, "med.gif", "low");
		new Image(1200, 1000, "large.gif", "high");
	}

}

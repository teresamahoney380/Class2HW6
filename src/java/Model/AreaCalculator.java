package Model;

import java.io.IOException;

/**
 * This is the model program that calculates the area of the rectangle.
 *
 * @author Teresa Mahoney
 */
public class AreaCalculator {

    private int length;
    private int width;
    // private String TextLength;
    private static final String PARAM_ERROR = "Invalid Parameter";

    public AreaCalculator(String textLength, String textWidth) {
        setLength(textLength);
        setWidth(textWidth);

    }

    /**
     * This method sets the value of the length from a text field
     *
     * @param textLength - text containing entered length
     */
    public final void setLength(String textLength) {
        if (textLength == null || textLength.length() == 0) {
            throw new IllegalArgumentException(PARAM_ERROR);
        } else {
            length = Integer.parseInt(textLength);
        }
    }

    /**
     * This method sets the value of the width from a text field
     *
     * @param textWidth - text containing entered width
     */
    public final void setWidth(String textWidth) {

        if (textWidth == null || textWidth.length() == 0) {
            throw new IllegalArgumentException(PARAM_ERROR);
        } else {
            width = Integer.parseInt(textWidth);
        }
    }

    /**
     *
     * @return value of length
     */
    public final int getLength() {
        return length;
    }

    /**
     *
     * @return value of length
     */
    public final int getWidth() {
        return width;
    }

    /**
     *
     * @return value of length * width
     */
    public final int getArea() {
        return getLength() * getWidth();
    }

    public static void main(String[] args) {
        AreaCalculator ac=new AreaCalculator("10", "20");
        System.out.println(ac.getArea());
    }

}

package Model;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 * This is the model program that calculates the area of the rectangle.
 *
 * @author Teresa Mahoney
 */
public class AreaCalculator {

    private double length;
    private double width;
    private String shape;
    private double result;

    // private String TextLength;
    private static final String PARAM_ERROR = "Invalid Parameter";

    public AreaCalculator(String shape) {
        this.shape = shape;
    }

    public HttpServletRequest getResultForType(HttpServletRequest request, String shape) {

        switch (shape) {
            case "rectangle":
                String l=request.getParameter("tlength");
                String w=request.getParameter("twidth");
                length=Double.parseDouble(l);
                width=Double.parseDouble(w);
                result=length*width;
                break;
            case "circle":
                break;
            case "triangle":
                break;
        }
        request.setAttribute("textArea", result);
        request.setAttribute("shape", shape);
        return request;
    }
}

//    public AreaCalculator(String textLength, String textWidth) {
//        setLength(textLength);
//        setWidth(textWidth);
//
//    }
//
//  
//    /**
//     * This method sets the value of the length from a text field
//     *
//     * @param textLength - text containing entered length
//     */
//    public final void setLength(String textLength) {
//        if (textLength == null || textLength.length() == 0) {
//            throw new IllegalArgumentException(PARAM_ERROR);
//        } else {
//            length = Double.parseDouble(textLength.trim());
//        }
//    }
//
//    /**
//     * This method sets the value of the width from a text field
//     *
//     * @param textWidth - text containing entered width
//     */
//    public final void setWidth(String textWidth) {
//
//        if (textWidth == null || textWidth.length() == 0) {
//            throw new IllegalArgumentException(PARAM_ERROR);
//        } else {
//            width = Double.parseDouble(textWidth.trim());
//        }
//    }
//
//    /**
//     *
//     * @return value of length
//     */
//    public final double getLength() {
//        return length;
//    }
//
//    /**
//     *
//     * @return value of length
//     */
//    public final double getWidth() {
//        return width;
//    }
//
//    /**
//     *
//     * @return value of length * width
//     */
//    public final double getArea() {
//        return getLength() * getWidth();
//    }
//    public static void main(String[] args) {
//        AreaCalculator ac=new AreaCalculator("10", "20");
//        System.out.println(ac.getArea());
//    }


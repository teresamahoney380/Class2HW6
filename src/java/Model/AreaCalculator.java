package Model;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 * This is the model program that calculates the area of the rectangle.
 *
 * @author Teresa Mahoney
 */
public class AreaCalculator {

    private final String shape;
    private double result;
    private String shapeMsg;

    public AreaCalculator(String shape) {
        this.shape = shape;
    }

    public HttpServletRequest getResultForType(HttpServletRequest request, String shape) {

        switch (shape) {
            case "rectangle":
                try {
                    double l = Double.valueOf(request.getParameter("tlength"));
                    double w = Double.valueOf(request.getParameter("twidth"));
                    shapeMsg = "The area of a " + l + " x " + w + " " + shape + " is: ";
                    result = l * w;
                } catch (NumberFormatException nfe) {
                    shapeMsg = "Sorry, you must submit 2 numerical values for this calculation. ";
                    result = 0;
                }
                break;
            case "circle":
                try {
                    double r = Double.valueOf(request.getParameter("tradius"));
                    double radiusSquared = r * r;
                    shapeMsg = "The area of a " + shape + " with a radius of " + r + " is: ";
                    result = 3.14 * radiusSquared;
                } catch (NumberFormatException nfe) {
                    shapeMsg = "Sorry, you must submit a numerical value for this calculation. ";
                    result = 0;
                }
                break;
            case "triangle":
                try {
                    double a = Double.valueOf(request.getParameter("tsideA"));
                    double b = Double.valueOf(request.getParameter("tsideB"));
                    double c = (a * a) + (b * b);
                    shapeMsg = "A " + shape + " with Side A = " + a + " and Side B = " + b
                            + " has a Side C = ";
                    result = Math.sqrt(c);
                } catch (NumberFormatException nfe) {
                    shapeMsg = "Sorry, you must submit 2 numerical values for this calculation. ";
                    result = 0;
                }
                break;
            default:
                shapeMsg = "An invalid shape type was passed in - no caclculation performed. ";
                result = 0;
                break;
        }
        request.setAttribute("textArea", result);
        request.setAttribute("shapeMsg", shapeMsg);
        request.setAttribute("shape", shape);
        return request;
    }
}


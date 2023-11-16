package com.luoli.text1;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Repository
@Data
@Component
public class Triangle {
    private int lborderA = 0;
    private int lborderB = 0;
    private int lborderC = 0;


    /**
     * check if it is a triangle
     *
     * @return true for triangle and false not
     */
    public boolean istriangle(Triangle triangle) {
        boolean isTriangle = false;

        // check boundary
        if ((triangle.lborderA > 0 && triangle.lborderA <= Long.MAX_VALUE)
                && (triangle.lborderB > 0 && triangle.lborderB <= Long.MAX_VALUE)
                && (triangle.lborderC > 0 && triangle.lborderC <= Long.MAX_VALUE)) {            // check if subtraction of two border larger than the third
            if (diffOfBorders(triangle.lborderA, triangle.lborderB) < triangle.lborderC && diffOfBorders(triangle.lborderB, triangle.lborderC) < triangle.lborderA && diffOfBorders(triangle.lborderC, triangle.lborderA) < triangle.lborderB) {
                isTriangle = true;
            }

        }
        return isTriangle;
    }

    /**
     * Check the type of triangle
     * <p>
     * Consists of "Illegal", "Regular", "Scalene", "Isosceles"
     */
    public String getType(Triangle triangle) {
        String strType = "Illegal";

        if (istriangle(triangle)) {
            // Is Regular
            if (triangle.lborderA == triangle.lborderB
                    && triangle.lborderB == triangle.lborderC) {
                strType = "Regular";
            }
            // If scalene
            else if ((triangle.lborderA != triangle.lborderB)
                    && (triangle.lborderB != triangle.lborderC)
                    && (triangle.lborderA != triangle.lborderC)) {
                strType = "Scalene";
            }
            // if isosceles
            else {
                strType = "Isosceles";
            }
        }

        return strType;
    }

    /**
     * calculate the diff between borders
     */
    public long diffOfBorders(long a, long b) {
        return (a > b) ? (a - b) : (b - a);
    }

    /**
     * get length of borders
     */
    public long[] getBorders() {
        long[] borders = new long[3];
        borders[0] = this.lborderA;
        borders[1] = this.lborderB;
        borders[2] = this.lborderC;
        return borders;
    }

}

package com.Reclaim;
/*
 * This code came from a professor, who provided the code to students to hellp with game Development
 * The Professor was James Atlas, at the University of Delaware
 */


/**
 * Represents a directional vector with up to 3 dimensions.
 * 
 * @author jatlas
 */
public class DirectionVector extends Component3d {

    public DirectionVector(double x, double y) {
        super(x, y);
    }
    
    public DirectionVector(double x, double y, double z) {
        super(x, y, z);
    }
    
    /**
     * The magnitude of the vector (i.e. its length in Cartesian
     * coordinates).
     * 
     * @return
     */
    public double magnitude() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    public String toString() {
        return super.toString() + "[magnitude=" + magnitude()+"]";
    }
    
    public void scale(double factor) {
        setX(getX()*factor);
        setY(getY()*factor);
        setZ(getZ()*factor);
    }
}

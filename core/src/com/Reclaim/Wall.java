package edu.udel.dlaw.ReclaimandEvade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.udel.jatlas.gameframework.Position;

/**
 * A simple straight-line wall that must be at a 90 degree
 * angle.  Also start must be to the left of end OR it must
 * be above end.
 * 
 * @author jatlas
 *
 */
// remove the implements Iterable<Position> 
public class Wall implements Iterable<Position>{
    private Position start;
    private Position end;
    private Set<Position> allPositions;
    
    public Wall(Position start, Position end) {
        this.allPositions = new HashSet<Position>();
        if (start.getRow() == end.getRow()) {
            // horizontal wall
            int r = start.getRow();
            int end_c = end.getColumn();
            for (int c = start.getColumn(); c <= end_c; c++) {
                allPositions.add(new Position(c, r));
            }
        }
        else {
            // vertical wall
            int c = start.getColumn();
            int end_r = end.getRow();
            for (int r = start.getRow(); r <= end_r; r++) {
                allPositions.add(new Position(c, r));
            }
        }
        this.start = start;
        this.end = end;
    }
    
    public Position getStart() {
        return start;
    }
    
    public Position getEnd() {
        return end;
    }
    
    public boolean contains(Position p) {
        return allPositions.contains(p);
    }
    
// // Create Safety Zone 4
// 	// Produces a list of Walls that represent Safety Zone 4
// 	public List<Wall> safetyZoneFour(){	
// 		List<Wall> SafetyZoneFour = new ArrayList<Wall>();
// 		SafetyZoneFour.add(new Wall(new Position(16,16), new Position(16,17.75) ) );
// 		SafetyZoneFour.add(new Wall(new Position(16,18.15), new Position(16,20) ) );
// 		SafetyZoneFour.add(new Wall(new Position(16,16), new Position(17,16) ) );
// 		SafetyZoneFour.add(new Wall(new Position(17.4,16), new Position(20,16) ) );
// 		return SafetyZoneFour;
// 	}	
    
//    /**
//     * Returns true if the wall contains the position.
//     * 
//     * We are assuming that all Walls are 90 degree straight lines
//     * (no diagonal walls).
//     * 
//     * @param p
//     * @return
//     */
//    public boolean contains(Position p) {
//        if (p.getRow() == start.getRow() && p.getRow() == end.getRow()) {
//            return start.getColumn() <= p.getColumn() && p.getColumn() <= end.getColumn();
//        }
//        else if (p.getColumn() == start.getColumn() && p.getColumn() == end.getColumn()) {
//            return start.getRow() <= p.getRow() && p.getRow() <= end.getRow();
//        }
//        else {
//            return false;
//        }
//    }

    public String toString() {
        return "Wall [start=" + start + ", end=" + end + "]";
    }
    
    public Iterator<Position> iterator() {
        return allPositions.iterator();
    }

//    public Iterator<Position> iterator() {
//        return new WallIterator();
//    }
//    
//    /**
//     * Inner class definition.  We'll talk about these much later
//     * but they should be used sparingly.
//     * 
//     * @author jatlas
//     */
//    class WallIterator implements Iterator<Position> {
//        Position p;
//        int dr;
//        int dc;
//        
//        public WallIterator() {
//            // if it is horizontal iteration, change in column is 1
//            if (start.getRow() == end.getRow()) {
//                dc = 1;
//            }
//            else {
//                // else it is vertical iteration, change in row is 1
//                dr = 1;
//            }
//            // start it right before the beginning of the wall
//            p = new Position(start.getColumn()-dc, start.getRow()-dr);
//        }
//        
//        public boolean hasNext() {
//            return p.blockDistance(end) > 0;
//        }
//        
//        public Position next() {
//            p.setRow(p.getRow()+dr);
//            p.setColumn(p.getColumn()+dc);
//            return p;
//        }
//        
//        // not implemented
//        public void remove() {
//        }
//    }
//    
}

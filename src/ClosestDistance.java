import java.util.Collections;
import java.util.List;

public class ClosestDistance {

    public static int closestDistance(List<Integer> integers){

        //Potentially disruptive, could copy list
        // Sort to make sure any closest distance is between to consecutive numbers
        Collections.sort(integers);

        int listLength = integers.size();

        // The currently minimal distance
        int minDist = Math.abs(integers.get(0) - integers.get(1));

        // Check each distance, if it's smaller than the currently minimal, it is the new minimal
        for(int i = 1; i < listLength - 1; i++){
            int elem1 = integers.get(i);
            int elem2 = integers.get(i + 1);

            int dist = Math.abs(elem1 - elem2);

            if (minDist > dist){
                minDist = dist;
            }
        }

        return minDist;
    }

}

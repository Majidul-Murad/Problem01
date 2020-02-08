public class ClosestPoint {
    public static void main(String[]args){
        final int X = 0;
        final int Y = 1;
        double[]myPosition={4,2};//lat & long
        double [][] points={{1,3},{-1,-3},{2,5},{1,-8}};
        double[]closest=nearestPoint(myPosition,points);
        System.out.println("("+closest[X]+","+closest[Y]+")");
        double d = distance(myPosition[X],myPosition[Y],closest[X],closest[Y]);
        System.out.println("Distance: "+d);
    }
    public static double distance(double x1,double y1,double x2,double y2){
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        return Math.sqrt(x+y);

    }

    private static double[] nearestPoint(double[] myPosition, double[][] points) {
        final int X =0;
        final int Y =1;
        double []closestPoint=points[0];
        double closestDist=distance(myPosition[X],myPosition[Y],closestPoint[X],closestPoint[Y]);

        for (int i = 0;i<points.length;i++){
            double dist = distance(myPosition[X],myPosition[Y],points[i][X],points[i][Y]);

            if(dist<closestDist && dist !=0){
                closestDist=dist;
                closestPoint=points[i];
            }
        }

        return closestPoint;
    }


}

public class generic 
{
    public static <S extends Comparable<S>> S maximum(S x, S y, S z)
    {
      S max = x; 
  
      if (y.compareTo(max) > 0)
        max = y; 
  
      if (z.compareTo(max) > 0)
        max = z; 
  
      return max; 
    } 
  
    public static void main(String args[]) {
      System.out.printf("Maximum of %d, %d and %d is %d\n\n", 6, 7, 8, maximum(6, 7, 8));
      System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 9.6, 5.8, 7.3, maximum(9.6, 5.8, 7.3));
      System.out.printf("Maximum of %s, %s and %s is %s\n", "deer", "monkey", "panda", maximum(
        "deer", "monkey", "panda"));
    }
}

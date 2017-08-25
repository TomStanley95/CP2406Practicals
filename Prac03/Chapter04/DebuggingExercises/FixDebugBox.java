package Chapter04.DebuggingExercises;

public class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   public FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public  FixDebugBox(int widthIn, int lengthIn, int heightIn)
   {
      width = widthIn;
      length = lengthIn;
      height = heightIn;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume()
   { 
     double vol = length * width * height;
     return vol;
   }
}

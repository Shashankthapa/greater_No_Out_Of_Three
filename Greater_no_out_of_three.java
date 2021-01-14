public class Greater_no_out_of_three{
    public static void main(String args[]){
      int main_method1 = main_method(3,5,1);
      switch(main_method1){
        case 1:
          System.out.println("x is greater");
          break;
        case 2:
          System.out.println("y is greater");
          break;
        case 3:
          System.out.println(
                             "z is greater");
          break;
      }
    }
    
    
    public static int main_method (int x,int y,int z){
      if((x > y) &&  (x > z)){
        return 1;}
      else if ((y > x) && (y > z)){
        return 2;}
      else if ((z > x) && (z > y)){
        return 3;}
      else{
        return -1;
      }
    }
  }
  
  

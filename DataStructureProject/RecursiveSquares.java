/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivesquares;

/**
 *
 * @author Shod
 */
public class RecursiveSquares {
      // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    public static void draw(int n, double x, double y, double size) // This recursive method 
    {// x,y is a axises
     // n is number of the square
     // size is a size of square
            
        double ratio = 2.2;// هنا نسبة الاكل مارسم صغر المربع
        
        if (n == 0) // هنا شرط توقف الريرجن الا هيا البيزكيس يعني عددالاسطر الارعة الا تحت بيتكرر 
            return;
        
        else { 

            //plot a square, centered on (x, y) of the given side length
            //with a light gray background and black border
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);// here we can change the color
            StdDraw.filledSquare(x, y, size/2);// هنا حق الاحداثيات
            StdDraw.setPenColor(StdDraw.BLACK);// هنا الخط الخارجي ايش لونو
            StdDraw.square(x, y, size/2);// هنا برضو ايش حجم الاحداثيات
          
            // here the recursive method call itself
            draw(n-1, x - size/2, y - size/2, size/ratio);    // recursive call for lower left , change it/ comment it and see the results
            draw(n-1, x + size/2, y - size/2, size/ratio);                             // recursive call for upper left
            draw(n-1, x - size/2, y + size/2, size/ratio);    // recursive call for lower left , change it/ comment it and see the results
            draw(n-1, x + size/2, y + size/2, size/ratio); 
       } // هنا الاشارات معناها الاتجاهات
    }

 
    public static void main(String[] args) 
    {
        // this n drawing the squares
        int n = 5; // n recursive squares pattern, change it and see the results
        double x = 0.5, y = 0.5;   // center of square, , change it and see the results
        double size = 0.5;         // side length of square, , change it and see the results
        draw(n, x, y, size);
    }// هنا فوق بس حددنا الارقام للاحداثيات والحجم وكدا
}// end class of RecursiveSquares

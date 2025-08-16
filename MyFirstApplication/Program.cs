namespace MyFirstApplication
{
    class MyFirstApplication
    {

        public static void Main(string[] args)
        {
            // Console.WriteLine("Hello, World!");
            /**

             int FirstNum = 10;
             int SecondNum = 20;
             int sum = Sum(FirstNum, SecondNum);
             Console.WriteLine("The sum of " + FirstNum + " and " + SecondNum + " is: " + sum);

             int sideOfSquare = 4;
             int areaResult = AreaofSquare(sideOfSquare);
             Console.WriteLine("The area of square with side " + sideOfSquare + " is: " + areaResult);

             int lengthOfRectangle = 5;
             int widthOfRectangle = 3;
             int areaOfRectangle = AreaofRectangle(lengthOfRectangle, widthOfRectangle);
             Console.WriteLine("The area of the rectangle with Length = " + lengthOfRectangle + " and Width = " + widthOfRectangle + " is: " + areaOfRectangle);
         }

         public static int Sum(int num1, int num2)
         {
             return num1 + num2;
         }

         public static int AreaofSquare(int area)
         {
             return area * area;
         }

         public static int AreaofRectangle(int length, int width)
         {
             return length * width;
         }
         */

            Console.Write("Write your name: ");
            string? inputName = Console.ReadLine();
            string name = inputName ?? string.Empty;
            Console.Write("Hello, " + name + "!" + " Please enter your age: ");
            int age = Convert.ToInt16(Console.ReadLine());
            Console.Write("You are " + age + " years old.");
        }
    }
}
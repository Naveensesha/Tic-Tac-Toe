import java.util.Scanner;

public class tic_tac_Toe {

    public static String Tictacboard[][] = {{"00","01","02"},
                                            {"10","11","12"},
                                            {"20","21","22"}};

    public static int Playercount = 0;

    public static void display()
    {
        for(int row=0;row<Tictacboard.length;row++)
        {
            for(int col=0;col<Tictacboard.length;col++)
            {
                System.out.print(Tictacboard[row][col]+" | ");
            }
            System.out.println();
        }
    }

    public static void Greetingmgs(Scanner sc)
    {
        int x = 0;
        int y = 0;
        System.out.println(Playercount%2==0 ? "Player X" : "Player O");
        System.out.println("Enter X value : ");
        x = sc.nextInt();
        System.out.println("Enter Y value : ");
        y = sc.nextInt();
        System.out.println(insert(x,y,Playercount%2==0 ? "x" : "o"));
        
    }

    public static String insert(int x,int y,String playName)
    {
        if((x<3&&x>=0) && (y<3&&y>=0))
        {
            if(!Tictacboard[x][y].equals("x")&&!Tictacboard[x][y].equals("o")){
                Tictacboard[x][y] = playName;
                display();
                Playercount++;
                if(check())
                {
                    System.out.println(playName+" win!!!");
                    System.exit(0);
                }
                else if (Playercount==9) {
                    System.out.println("Game is draw!!");
                    System.exit(0);
                }
                return "Inserted";
            }
            else{
                return "Already Occupied";
            }
        }
        return "Unexpected Place";
    }

    public static boolean check()
    {
        // row

        for(int i=0;i<3;i++)
        {
            if(Tictacboard[i][0].equals(Tictacboard[i][1])&&Tictacboard[i][1].equals(Tictacboard[i][2])&&!Tictacboard[i][0].equals("")){
                return true;
            }
        }

        // column

        for(int i=0;i<3;i++)
        {
            if(Tictacboard[0][i].equals(Tictacboard[1][i])&&Tictacboard[1][i].equals(Tictacboard[2][i])&&!Tictacboard[0][i].equals("")){
                return true;
            }
        }

        // diagonal

        if(Tictacboard[0][2].equals(Tictacboard[1][1])&&Tictacboard[1][1].equals(Tictacboard[2][0])&&!Tictacboard[0][2].equals("")){
            return true;
        }

        if(Tictacboard[0][0].equals(Tictacboard[1][1])&&Tictacboard[1][1].equals(Tictacboard[2][2])&&!Tictacboard[0][0].equals("")){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            Greetingmgs(sc);
        }
        
    }
}

// import java.util.Scanner;

// public class tic_tac_Toe {

//     public static String Tictacboard[][] = {{"00","01","02"},
//                                             {"10","11","12"},
//                                             {"20","21","22"}};

//     public static int Playercount = 0;

//     public static void display()
//     {
//         for(int row=0;row<Tictacboard.length;row++)
//         {
//             for(int col=0;col<Tictacboard.length;col++)
//             {
//                 System.out.print(Tictacboard[row][col]+" | ");
//             }
//             System.out.println();
//         }
//     }

//     public static void Greetingmgs(Scanner sc)
//     {
//         int x = 0;
//         int y = 0;
//         System.out.println(Playercount%2==0 ? "Player X" : "Player O");
//         System.out.println("Enter X value : ");
//         x = sc.nextInt();
//         System.out.println("Enter Y value : ");
//         y = sc.nextInt();
//         System.out.println(insert(x,y,Playercount%2==0 ? "x" : "o"));
        
//     }

//     public static String insert(int x,int y,String playName)
//     {
//         if((x<3&&x>=0) && (y<3&&y>=0))
//         {
//             if(!Tictacboard[x][y].equals("x")&&!Tictacboard[x][y].equals("o")){
//                 Tictacboard[x][y] = playName;
//                 display();
//                 Playercount++;
//                 if(check())
//                 {
//                     System.out.println(playName+" win!!!");
//                     System.exit(0);
//                 }
//                 else if (Playercount==9) {
//                     System.out.println("Game is draw!!");
//                     System.exit(0);
//                 }
//                 return "Inserted";
//             }
//             else{
//                 return "Already Occupied";
//             }
//         }
//         return "Unexpected Place";
//     }

//     public static boolean check()
//     {
//         // row

//         for(int i=0;i<3;i++)
//         {
//             if(Tictacboard[i][0].equals(Tictacboard[i][1])&&Tictacboard[i][1].equals(Tictacboard[i][2])&&!Tictacboard[i][0].equals("")){
//                 return true;
//             }
//         }

//         // column

//         for(int i=0;i<3;i++)
//         {
//             if(Tictacboard[0][i].equals(Tictacboard[1][i])&&Tictacboard[1][i].equals(Tictacboard[2][i])&&!Tictacboard[0][i].equals("")){
//                 return true;
//             }
//         }

//         // diagonal

//         if(Tictacboard[0][2].equals(Tictacboard[1][1])&&Tictacboard[1][1].equals(Tictacboard[2][0])&&!Tictacboard[0][2].equals("")){
//             return true;
//         }

//         if(Tictacboard[0][0].equals(Tictacboard[1][1])&&Tictacboard[1][1].equals(Tictacboard[2][2])&&!Tictacboard[0][0].equals("")){
//             return true;
//         }

//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while (true) 
//         {
//             Greetingmgs(sc);
//         }
        
//     }
// }

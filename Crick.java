### Hi there 👋

import java.io.*;
public class hand
{
public static void main(String args[])throws Exception
{
  int sum=0;
  int sum1=0;
  int w=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("how many balls?");
      int n=Integer.parseInt(br.readLine());
  System.out.println("who's choosing? if player1:1 OR player2:2");
    int p=Integer.parseInt(br.readLine());
    if(p==1)
    {
    System.out.println("Choose odd:1 OR even:2");
    int tu=Integer.parseInt(br.readLine());
    System.out.println("play ur turns");
    int p1=Integer.parseInt(br.readLine());
    int p2=Integer.parseInt(br.readLine());
    int to=p1+p2;
    if(tu==1)
    {
      if(to%2==0)
      {
        System.out.println("Player2 won");
       
      }
      else
      {
      System.out.println("player1 won");
       
      }
     }
     else
     {
      if(to%2==0)
      {
        System.out.println("Player1 won");
       
      }
      else
      {
      System.out.println("player2 won");
       
      }
     }
    }
    else
    {
     System.out.println("Choose odd:1 OR even:2");
    int tu=Integer.parseInt(br.readLine());
    System.out.println("play ur turns");
    int p1=Integer.parseInt(br.readLine());
    int p2=Integer.parseInt(br.readLine());
    int to=p1+p2;
    if(tu==1)
    {
      if(to%2==0)
      {
        System.out.println("Player1 won");
       
      }
      else
      {
      System.out.println("player2 won");
       
      }
     }
     else
     {
      if(to%2==0)
      {
        System.out.println("Player2 won");
       
      }
      else
      {
      System.out.println("player1 won");
       
      }
     }
    }
     //1 INNINGS//
     System.out.println("press 4:batting of P1 OR 5:batting of P2");
     int c=Integer.parseInt(br.readLine());
     if(c==4)
     {
      //a batting//
      for(int i=0;i<=n;i++)
      {
        System.out.println("enter first player");
        System.out.println("enter second player");
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
     
        if(a==b)
        {
        System.out.println("OUT!!!");
        break;
        }
        else
        {
        sum=sum+a;
        }

      }
      System.out.println("total score of PLAYER1 is "  + sum);
      sum=sum+1;
     System.out.println("its Your friend's turn to bat");
     System.out.print("PLAYER2 needs " + sum );System.out.print("  to win");
sum=sum-1;
     }
     else if(c==5)
     {
      //b batting//
       for(int i=0;i<=n;i++)
      {
        System.out.println("enter first player");
        System.out.println("enter second player");
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
     
        if(a==b)
        {
        System.out.println("OUT!!!");
        break;
        }
        else
        {
        sum=sum+b;
        }

      }
     
      System.out.println("total score of PLAYER2 is " + sum);
      sum=sum+1;
     System.out.println("its Your friend's turn to bat");
     System.out.print(" PLAYER1 needs " + sum );System.out.println("  to win");
sum=sum-1;
     }
     else
     {
      System.out.println("invalid input");
     
     }
     //2 INNINGS//
    System.out.println("press 4:batting of P1 OR 5:batting of P2");
     int d=Integer.parseInt(br.readLine());
     if(d==4)
     {
      //a batting//
      for(int i=0;i<=n;i++)
      {
        System.out.println("enter first player");
        System.out.println("enter second player");
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
     
        if(a==b)
        {
        System.out.println("OUT!!!");
        break;
        }
        else
        {
        sum1=sum1+a;
        }
          }
      System.out.println("total score of PLAYER1 is "  + sum1);
     }
     else if(d==2)
     {
      //b batting//
       for(int i=0;i<=n;i++)
      {
        System.out.println("enter first player");
        System.out.println("enter second player");
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
     
        if(a==b)
        {
        System.out.println("OUT!!!");
        break;
        }
        else
        {
        sum1=sum1+b;
        }

      }
      System.out.println("total score of PLAYER2 is " + sum1);
     
     }
     else
     {
      System.out.println("invalid input");
     }
     if(sum<sum1)
     {
      System.out.println("player2 winns");
     }
     else if(sum>sum1)
     {
      System.out.println("player1 wins");
     }    
     else
     {
      System.out.println("its a tie");
     }
  }
}




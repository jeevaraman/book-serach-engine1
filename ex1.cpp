#include <stdio.h>	

int main()         
{
    int number;                          
  
    printf( "enter your number" );  
    scanf( "%d", &number );                 
    if ( number>0 ) 
    {                 
        printf ("the given number is positive\n" ); 
    }
    else
    {
        printf( "the given number is negative\n" );     
    }
    
  return 0;
}

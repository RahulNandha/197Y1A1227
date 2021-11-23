#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void) 
{
    int value;
    char str[20];
    strcpy(str,"2306");
    value = atoi(str);
    printf("String value = %s, Int value = %d\n", str, value);

    return(0);
}
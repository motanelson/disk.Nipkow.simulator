#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    int i=0;
    char s[1024]="enscript ";
    char ss[1024]="";
    char sss[1024]=" -o - | ps2pdf - output.pdf";
    printf("\ec\e[43;30m\ngive me a text file to print\n");
    fgets(ss,1023,stdin);
    i=strlen(ss)-1;
    ss[i]=32;
    strcat(s,ss);
    strcat(s,sss);
    printf("%s\n",s);
    system(s);
    return 0;
}
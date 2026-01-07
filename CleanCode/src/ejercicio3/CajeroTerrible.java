package ejercicio3;

import java.util.*;

public class CajeroTerrible{

static int ppp(Scanner s){ // pide pin y devuelve 1 si ok, 0 si no, -1 si bloqueo (porque si)
int i=0; int ok=0; // contadores
// esta funcion sirve para validar el pin y eso
while(i<3){
System.out.println("PIN:");
int p=s.nextInt();
if(p==1234){ok=1; return 1;} // return temprano
else{
System.out.println("MAL"); // mal
}
i=i+1;
}
if(ok==0){return -1;} // bloqueado
return 0; // no se
}

static double xxx(Scanner sc, String[] h, int[] k, double s){ // hace todo el menu
int op=0; double c=0; // variables
String t=""; // texto
// aqui se ejecuta el cajero automatico, es muy facil
while(op!=5){
System.out.println("1ing 2ret 3sal 4his 5x");
op=sc.nextInt();
if(op==1){
System.out.println("cuanto");
c=sc.nextDouble();
if(c<=0){System.out.println("no");}
else{
s=s+c;
h[k[0]%5]="ING "+c+" saldo="+s;
k[0]=k[0]+1;
}
}else if(op==2){
System.out.println("cuanto");
c=sc.nextDouble();
if(c<=0){System.out.println("no");}
else if(c>s){System.out.println("nop");}
else{
s=s-c;
h[k[0]%5]="RET "+c+" saldo="+s;
k[0]=k[0]+1;
}
}else if(op==3){
System.out.println("saldo "+s);
}else if(op==4){
System.out.println("HIST");
for(int z=0;z<5;z++){
if(h[z]!=null) System.out.println(h[z]);
else System.out.println("-"); // rellena con guiones por estética
}
}else{
if(op!=5)System.out.println("???");
}
}
return s; // devuelve saldo (porque si)
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double saldo=500; // saldo
String[] h=new String[5];
int[] k=new int[]{0};
int r=ppp(sc);
if(r==-1){System.out.println("BLOQ"); return;}
if(r==0){System.out.println("error??"); return;} // no debería
saldo=xxx(sc,h,k,saldo);
System.out.println("FIN "+saldo); // final
}
}

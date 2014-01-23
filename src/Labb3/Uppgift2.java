package Labb3;

public class Uppgift2 {

	
	
	
	public static void main (String[] args) 
	 {
        int a[] = {3, 10, 4, 2, 8};
        int[] b = {10, 4, 12, 3, 23, 1, 8};
        int[] c = new int[(int)Math.min(a.length, b.length)];
        int i=0;
         for(int f=0;f<a.length;f++){
              for(int k=0;k<b.length;k++){
                    if(a[f]==b[k]){
                    c[i] = a[f];
                    i++;
                    }
          }
        }
        for (int x=0; x<i; x++){
           System.out.println(c[x]);
        }
       }
  
	
	
	
	
	
	
	
	
	/*{ 
	int i = 10; 
	plustre(i); 
	System.out.println("Siffran: " + i); //skriver ut "Siffran: 10" 
	} */
	public static void plustre(int i) 
	{ 
	i = i + 3; 
	} 
	}


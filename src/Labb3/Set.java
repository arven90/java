package Labb3;

public class Set {



	public static void main (String[] args) {
		//prettyPrint(set1);
		//addElement(a,b);

		System.out.println("Testing ");
		System.out.println();
		System.out.println("Testing makeSet() and prettyPrint():");
		int[] set1 = makeSet();
		prettyPrint(set1);
		//fake set with known size:
		set1[1] = 1;
		set1[0] = set1[0] + 1;
		set1[2] = 2;
		set1[0] = set1[0] + 1;
		set1[3] = 3;
		set1[0] = set1[0] + 1;
		prettyPrint(set1);
		System.out.println();
		System.out.println("Testing isEmpty() and size():");
		System.out.println(isEmpty(set1));
		int[] set2 = makeSet();
		System.out.println(isEmpty(set2));
		System.out.println(size(set1));
		System.out.println(size(set2));
		System.out.println();
		System.out.println("Testing contains():");
		System.out.println(contains(set2, 0));
		System.out.println(contains(set1, 0));
		System.out.println(contains(set1, 1));
		System.out.println(contains(set1, 2));
		System.out.println(contains(set1, 3));
		System.out.println(contains(set1, 4));
		System.out.println();
		System.out.println("Testing add():");
		int[] set3 = makeSet();
		System.out.println(addElement(set3, 1));
		prettyPrint(set3);
		System.out.println(addElement(set3, 2));
		prettyPrint(set3);
		System.out.println(addElement(set3, 1));
		prettyPrint(set3);
		System.out.println();
		System.out.println("Testing remove():");
		System.out.println(remove(set3, 5));
		prettyPrint(set3);
		System.out.println(remove(set3, 1));
		prettyPrint(set3);
		System.out.println(remove(set3, 2));
		prettyPrint(set3);
		System.out.println();
		System.out.println("Testing intersection():");
		int[] set4 = makeSet();
		prettyPrint(set1);
		addElement(set4, 3);
		addElement(set4, 4);
		addElement(set4, 2);
		prettyPrint(set4);
		prettyPrint(intersection(set1, set4));
		System.out.println();
		System.out.println("Testing union():");
		prettyPrint(set1);
		prettyPrint(set4);
		prettyPrint(union(set1, set4));
		System.out.println();
		System.out.println("Testing symmetricDifference():");
		prettyPrint(set1);
		prettyPrint(set4);
		prettyPrint(symmetricDifference(set1, set4));
		System.out.println();


	}
	public static int[] makeSet(){

		int[] array = new int[101];//gives an array 101 positions to store elements. 
		array[0]=0;// sets the first positions to 0


		return array; 
	}


	public static void prettyPrint(int[] lista){


		System.out.print("set {");

		for(int i = 1; i <= size(lista); i++){//prints every element in the list, except position 0
			System.out.print(" " + lista[i] + ",");
		}
		System.out.println(" }");


	}

	public static boolean isEmpty(int[] e){
		boolean empty = false;
		if(size(e)==0){//if size of the array is 0 then it is empty
			empty=true;
		}
		return empty;
	}		
	public static int size(int[] e){
		int arraySize;
		arraySize = e[0];// the first position in an array determines how many elements it has (see other methods)
		return arraySize;
	}
	public static boolean contains(int[] list, int containElement){
		boolean contain= false;// contain is set to false from the beginning 

		if(size(list)==0){//if the first position in the array is 0 then no element exist in the array and thus no search for the specific element is necessary
			contain = false;

		}else{
			for (int i = 1; i <= size(list); i++){ //checks every element
				if (containElement==list[i]){// if the element is in the position i, then it exists in the array
					contain = true;
					break;
				}
			}		
		}
		return contain;
	}

	public static boolean addElement(int[] a, int b){
		boolean elementAdded =true;
		for (int i = 1; i < size(a)+1 ; i++){//kör loopen lika många gånger som det finns element i listan a
			if (b==a[i]){// om b har samma värde som värdet i listan på platsen i händer följande:
				elementAdded = false;
			}		
		}
		if(elementAdded==true){			
			a[size(a)+1]=b;
			a[0]+=1;
		}
	
		return elementAdded;
	}

	public static boolean remove(int[] m, int n){
		boolean remove = false;
		int q=0;
		for(int i = 1; i <size(m)+1; i++){//kör loopen så många gånger som listan har platser.

			if (m[i]== n){//om elementet i listan är detsamma som n görs följande:
				//position = i; // int "position" får platsnumret med elementet som ska raderas
				remove = true;// om listplatsen har värdet n så blir remove true.				
				q=i;
				break;
			}
		}
		if(remove == true){

			m[q]= 0;
			m[0]=m[0]-1;
			for(int j =0; j<size(m)+1; j++){
				if( j >= q){					
					m[j]=m[j+1];
				}
			}
			m[size(m)+1]=0;
		}		
		return remove;
	}


	public static int[] intersection(int[] a, int[]b){
		int[] c = new int[(int)Math.min(a.length, b.length)];//skapar en ny lista med så många platser som den minsta av a och b. 
		//int d=0;

		for (int i = 1; i < size(a)+1; i++){//loop som upprepas lika många gånger som a har element
			for(int j = 1;j<size(b)+1;j++){
				if (a[i]==b[j]){
					addElement(c,a[i]);

				}
			}
		}

		return c;
	}



	public static int[] union (int[] a, int[] b){

		int[]list= new int[a.length+b.length];


		for(int j = 1; j < size(a)+1; j++){
			addElement(list, a[j]);
		}	
		for (int i = 1; i < size(b)+1; i++){
			addElement(list,b[i]);
		}	

		return list;
	}

/**
 * 
 * @param a
 * @param b
 * @return
 */
	public static int[] symmetricDifference(int[]a, int[] b){
		int[] c = union(a,b);
		int[] d = intersection(a,b);

		for(int i =1;i<size(c)+1;i++){

			for(int j=1; j<size(d)+1;j++){
				if(c[i]==d[j]){
					remove(c,c[i]);

				}
			}
		}
		return c;
	}


}









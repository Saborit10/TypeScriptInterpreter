class B{
	
}

class A extends B{
	a: number;
	b: string;
	// obj: string = 0.1;
	c = {}; // ver porque no lanza error (no hace nada)
	
	2 = "luis";
	
	static s: boolean;
	static y = 4;

	constructor(a: number, b: string){
		super();
	}
}







// reservar espacio en los arreglos de propiedades para las de las clases superiores. (en los classinstancevalues)
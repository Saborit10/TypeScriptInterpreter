
class B{
	protected p: string;
}

class A extends B{
	a: number;
	b: number;
	c = {fr: 1, sc: 2};
	
	constructor(a: number, b: number, s: string){
		super();
		
		if( a < 0 && b < 0 ){
			this.a = -a;
			this.b = -b;
		}
		else{
			this.a = a;
			this.b = b;
		}

		// this.c.fr = 4;
		// this.p = s;
	}
}

let obj1 = new A(3, 5, "luis");
let obj2 = new A(-100, -2000, "casa");

(obj1);
(obj2);
(obj1.p);







// reservar espacio en los arreglos de propiedades para las de las clases superiores. (en los classinstancevalues)
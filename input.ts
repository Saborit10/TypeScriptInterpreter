
let global = 0;

class A{
	p = 1;
	q = 0;

	constructor(p: number, q: number){
		this.p = p;
		this.q = q;
	}

	f(a: number){
		return a == 2 ? 1 : ++global;
	}
}

let obj = new A(2, 3);

console.log(obj.f(2));
console.log(global);



//revisar los metodos declarados en literales
// Revisar las divisiones entre cero, como tratarlas
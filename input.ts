
class A{
	p = 1;
	q = 0;

	constructor(p: number, q: number){
		this.p = p;
		this.q = q;
	}

	f(a: number){
		return a + 1;
	}
}

let obj = new A(2, 3);

console.log(obj.f(5));


//revisar los metodos declarados en literales
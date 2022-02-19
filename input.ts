
let obj = {
	a: 1,
	b: 2,
	3: 3
}

let arr = [10, 2, 5, 3];

let variable = obj;

for(let i in variable){
	console.log(i);
}

for(let i of variable){
	console.log(i);
}


// class A{
// 	p: number;

// 	constructor(){
// 		this.p = 5;
// 	}

// 	getP(){
// 		return this.p;
// 	}
// }

// let a = new A();

// console.log(a);

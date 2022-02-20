
var a = [0, 1, 2];

let obj = {
	p: 1,
	q: 0,
	f: function(a:	number){
		return a + 1;
	}
};

a[2]--;
obj.p--;
// obj.f(0)++;

console.log(a);
console.log(obj);

let x = 4;
console.log(x--);
